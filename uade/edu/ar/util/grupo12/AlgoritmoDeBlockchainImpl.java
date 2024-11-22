package uade.edu.ar.util.grupo12;

import uade.edu.progra3.AlgoritmoDeBlockchain;
import uade.edu.progra3.model.Bloque;
import uade.edu.progra3.model.Transaccion;

import java.util.ArrayList;
import java.util.List;
/**
 * @author AlejandroFoglino
 */
public class AlgoritmoDeBlockchainImpl implements AlgoritmoDeBlockchain {

    @Override
    public List<List<Bloque>> construirBlockchain(List<Transaccion> transacciones, int maxTamanioBloque, int maxValorBloque, int maxTransacciones, int maxBloques) {
        List<List<Bloque>> blockchain = new ArrayList<>();
        List<Bloque> bloquesActuales = new ArrayList<>();
        List<Bloque> mejorSolucion = new ArrayList<>();

        for(int a = 0; a < maxBloques; a++) {
        	bloquesActuales.add(new Bloque());
        }
        
        AsignarTransacciones(transacciones, bloquesActuales, maxTamanioBloque, maxValorBloque, maxTransacciones, mejorSolucion, transacciones.size(), 0, maxBloques);
        
        blockchain.add(mejorSolucion);
        return blockchain;
    }

    private void AsignarTransacciones(List<Transaccion> transacciones, List<Bloque> bloquesActuales, int maxTamanioBloque, int maxValorBloque, int maxTransacciones, List<Bloque> mejorSolucion, int cantidadTransacciones, int nroTransaccion, int maxBloques) {
        int i = 0;
        while (i < maxBloques) {
        	Transaccion transaccion = transacciones.get(nroTransaccion);
            agregarTransaccion(bloquesActuales, i, transaccion);
            
            if((cumpleReglas(bloquesActuales, maxTamanioBloque, maxValorBloque, maxTransacciones)) && (maxEspacio(bloquesActuales) < maxEspacio(mejorSolucion) || maxValor(bloquesActuales) < maxValor(mejorSolucion) || mejorSolucion.isEmpty())) {
            	if (nroTransaccion == transacciones.size() - 1) {
            		mejorSolucion.clear();
                	for (Bloque bloque : bloquesActuales) {
                        Bloque copia = new Bloque();
                        copia.setTransacciones(new ArrayList<>(bloque.getTransacciones()));
                        copia.setTamanioTotal(bloque.getTamanioTotal());
                        copia.setValorTotal(bloque.getValorTotal());
                        mejorSolucion.add(copia);
                    }
            	} else {
                	AsignarTransacciones(transacciones, bloquesActuales, maxTamanioBloque, maxValorBloque, maxTransacciones, mejorSolucion, cantidadTransacciones, nroTransaccion + 1, maxBloques);
                }
            }
            
            removerTransaccion(bloquesActuales, i, transacciones.get(nroTransaccion));
            i++;
        }
    }

    private void agregarTransaccion(List<Bloque> bloquesActuales, int i, Transaccion transaccion) {
            Bloque bloque = bloquesActuales.get(i); // Obtener el bloque en la posición i

            if (!bloque.getTransacciones().contains(transaccion)) {
                bloque.getTransacciones().add(transaccion); // Agregar la transacción
                System.out.println("Transacción agregada al bloque " + i);
            } else {
                System.out.println("La transacción ya existe en el bloque " + i);
            }
    }

    private void removerTransaccion(List<Bloque> bloquesActuales, int i, Transaccion transaccion) {
            Bloque bloque = bloquesActuales.get(i); // Obtener el bloque en la posición i

            if (bloque.getTransacciones().contains(transaccion)) {
                bloque.getTransacciones().remove(transaccion); // Eliminar la transacción
                System.out.println("Transacción removida del bloque " + i);
            } else {
                System.out.println("La transacción no se encuentra en el bloque " + i);
            }
    }

    private boolean cumpleReglas(List<Bloque> bloques, int maxTamanioBloque, int maxValorBloque, int maxTransacciones) {
    	for (int i = 0; i < bloques.size(); i++) {
    		Bloque bloque = bloques.get(i);
    		
            if (maxEspacioBloque(bloque) > maxTamanioBloque || maxValorBloque(bloque) > maxValorBloque || bloque.getTransacciones().size() > maxTransacciones) {
                return false;
            }
    		
    		//Dependencias
            for (Transaccion transaccion : bloque.getTransacciones()) {
            	if(transaccion.getDependencia() != null) {
            		if (!estaTransaccionEnBloquesPrevios(bloques, i, transaccion.getDependencia())) {
                        return false;
                    }
            	}
            }
        }
        return true;
    }

    private int maxEspacio(List<Bloque> bloques) {
        // Lógica para calcular el espacio total de los bloques
        int espacio = 0;
        for (Bloque bloque : bloques) {
            for(Transaccion transaccion : bloque.getTransacciones()) {
            	espacio += transaccion.getTamanio();
        	}
        }
        return espacio;
    }

    private int maxValor(List<Bloque> bloques) {
        // Lógica para calcular el valor total de los bloques
        int valor = 0;
        for (Bloque bloque : bloques) {
        	for(Transaccion transaccion : bloque.getTransacciones()) {
        		valor += transaccion.getValor();
        	}
        }
        return valor;
    }
    
    private int maxEspacioBloque(Bloque bloque) {
        // Lógica para calcular el espacio total de los bloques
        int espacio = 0;
        for(Transaccion transaccion : bloque.getTransacciones()) {
            espacio += transaccion.getTamanio();
        }
        return espacio;
    }

    private int maxValorBloque(Bloque bloque) {
        // Lógica para calcular el valor total de los bloques
        int valor = 0;
        for(Transaccion transaccion : bloque.getTransacciones()) {
        	valor += transaccion.getValor();
        }
        return valor;
    }
    
    private boolean estaTransaccionEnBloquesPrevios(List<Bloque> bloques, int indiceActual, Transaccion dependencia) {
        // Dependencia en todos los bloques anteriores al indice actual
        for (int i = 0; i <= indiceActual; i++) {
            Bloque bloque = bloques.get(i);
            if (bloque.getTransacciones().contains(dependencia)) {
                return true;
            }
        }
        return false; 
    }
    
}