//package uade.edu.progra3;
package uade.edu.ar.util.grupo7;

import uade.edu.progra3.AlgoritmoDeBlockchain;
import uade.edu.progra3.model.Bloque;
import uade.edu.progra3.model.Transaccion;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class AlgoritmoDeBlockchainImp implements AlgoritmoDeBlockchain {

	
	//ALGORITMO DE BLOCKCHAIN
	//Metodo principal para construir la cadena de bloques.
	 @Override
	    public List<List<Bloque>> construirBlockchain(List<Transaccion> transacciones, int maxTamanioBloque, int maxValorBloque, int maxTransacciones, int maxBloques) {
	        //Lista que contendra la cadena de bloques generados.
		 	List<List<Bloque>> cadenaDeBloques = new ArrayList<>();
	        //Conjunto para llevar un registro de las transacciones que ya han sido agregadas a bloques.
		 	Set<Transaccion> transaccionesYaAgregadas = new HashSet<>();
	        
	        int i = 0;//Contador de bloques generados.
	        //Mientras haya transacciones disponibles.
	        while (!transacciones.isEmpty()) {
	        	//Crear un nuevo bloque.
	            Bloque bloqueActual = new Bloque();
	            
	            //Intentar construir un bloique con las transacciones disponibles.
	            List<Bloque> bloque = construirBloque(transacciones, maxTamanioBloque, maxValorBloque, maxTransacciones, transaccionesYaAgregadas, bloqueActual);
	            
	            //Si se ha construido un bloque valido, agregarlo a la cadena.
	            if (!bloque.isEmpty()) {
	                cadenaDeBloques.add(bloque);
	                //Actualizar la lista de transacciones restantes.
	                actualizarTransaccionesRestantes(transacciones, bloque);
	                
	                i++;
	            } else {
	                break;//Si no se puede construir mas bucles, salir del blucle.
	            }
	            
	            //Limitar el numero de bloques generados.
	            if (i >= maxBloques) {
	                break;
	            }
	        }

	        return cadenaDeBloques;//Retornar la cadena de bloques.3
	        
	    }
	 
	 
	 
	 
	 	//ALGORITMO DE CONSTRUITBLOQUE
	    private List<Bloque> construirBloque(List<Transaccion> transacciones, int maxTamanioBloque, int maxValorBloque, int maxTransacciones, Set<Transaccion> transaccionesYaAgregadas, Bloque bloqueActual) {
	        int tamanioActual = bloqueActual.getTransacciones().stream().mapToInt(Transaccion::getTamanio).sum();
	        int valorActual = bloqueActual.getTransacciones().stream().mapToInt(Transaccion::getValor).sum();

	        // Caso base: Si alcanzamos el máximo de transacciones o no hay transacciones disponibles
	        if (bloqueActual.getTransacciones().size() == maxTransacciones || transacciones.isEmpty()) {
	            if (tamanioActual <= maxTamanioBloque && valorActual <= maxValorBloque && validacionPow(bloqueActual.getTransacciones())) {
	                List<Bloque> resultado = new ArrayList<>();
	                bloqueActual.setTamanioTotal(tamanioActual);
	                bloqueActual.setValorTotal(valorActual);
	                resultado.add(bloqueActual);
	                return resultado;
	            }
	        }

	        // Iteramos sobre las transacciones restantes
	        for (Transaccion transaccion : transacciones) {
	        	
	        	//aqui esta agregada 
	            if (validarFirmas(transaccion) && !transaccionesYaAgregadas.contains(transaccion) && validarDependencias(transaccion, transaccionesYaAgregadas)) {
	                
	                // Agregamos la transacción al bloque
	                bloqueActual.getTransacciones().add(transaccion);
	                tamanioActual += transaccion.getTamanio();
	                valorActual += transaccion.getValor();
	                transaccionesYaAgregadas.add(transaccion);
	                
	                // Comprobamos si el bloque excede los límites
	                if (tamanioActual > maxTamanioBloque || valorActual > maxValorBloque) { //<=aqui se hace la validacion del tamaño maximo del bloque / y la validacion de valor maximo.
	                    // Si excede los límites, retiramos la transacción y continuamos
	                    bloqueActual.getTransacciones().remove(bloqueActual.getTransacciones().size() - 1);
	                    tamanioActual -= transaccion.getTamanio();
	                    valorActual -= transaccion.getValor();
	                    transaccionesYaAgregadas.remove(transaccion);
	                    continue;
	                }

	                // Llamamos recursivamente para intentar agregar más transacciones
	                List<Bloque> resultadoRecursivo = construirBloque(transacciones, maxTamanioBloque, maxValorBloque, maxTransacciones, transaccionesYaAgregadas, bloqueActual);

	                if (!resultadoRecursivo.isEmpty()) {
	                    return resultadoRecursivo;
	                }

	                // Si no se encuentra una solución, retiramos la transacción
	                bloqueActual.getTransacciones().remove(bloqueActual.getTransacciones().size() - 1);
	                tamanioActual -= transaccion.getTamanio();
	                valorActual -= transaccion.getValor();
	                transaccionesYaAgregadas.remove(transaccion);
	            }
	        }

	        // Si el bloque tiene transacciones y cumple con las validaciones, lo devolvemos
	        if (!bloqueActual.getTransacciones().isEmpty() &&
	            tamanioActual <= maxTamanioBloque && 
	            valorActual <= maxValorBloque && 
	            validacionPow(bloqueActual.getTransacciones())) {
	            
	            bloqueActual.setTamanioTotal(tamanioActual);
	            bloqueActual.setValorTotal(valorActual);
	            
	            List<Bloque> resultado = new ArrayList<>();
	            resultado.add(bloqueActual); // Devolvemos el bloque actual con las transacciones válidas
	            return resultado;
	        }

	        // Si no se puede construir el bloque con las transacciones restantes, retornamos una lista vacía
	        return new ArrayList<>();
	    }


	    //ALGORITMO PARA VALIDAR EL TRABAJO
	    private boolean validacionPow(List<Transaccion> actBloque) {
	        int sumaTotal = 0;
	        for (Transaccion transaccion : actBloque) {
	            sumaTotal += transaccion.getValor();
	        }
	        return sumaTotal % 10 == 0;
	    }
	    
	    
	    //ALGORITMO PARA VALIDAR LA DEPENDENCIA
	    private boolean validarDependencias(Transaccion transaccion, Set<Transaccion> transaccionesYaAgregadas) {
	        if (transaccion.getDependencia() == null) {
	            return true;
	        }
	        return transaccionesYaAgregadas.contains(transaccion.getDependencia());
	    }

	    
	    //ALGORITMO PARA ACTUALIZAR LA TRANSACCIONES RESTANTES
	    private void actualizarTransaccionesRestantes(List<Transaccion> transacciones, List<Bloque> bloque) {
	        for (Bloque b : bloque) { 
	            for (Transaccion transaccionAc : b.getTransacciones()) { 
	                transacciones.remove(transaccionAc);
	            }
	        }
	    }   
	    
	    
	    
	    
	 //NUEVO ALGORITMO PARA VALIDAR LAS FIRMAS
	    private boolean validarFirmas(Transaccion transaccion) {
	        // Verificamos si la transacción está firmada correctamente y cumple con las firmas requeridas
	        return transaccion.isFirmada() && transaccion.getFirmasActuales() >= transaccion.getFirmasRequeridas();
	        //validacion:
	        	//si la transaccion esta firmada isFirmada()
	        	//el numero actual de firmas sea mayor o igual al numero de firmas reqieridas getFirmasActuales() >= getFirmasRequeridas()
	    }

}
