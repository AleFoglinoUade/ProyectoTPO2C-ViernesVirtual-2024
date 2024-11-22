package uade.edu.ar.util.grupo5;
import uade.edu.progra3.AlgoritmoDeBlockchain;
import uade.edu.progra3.model.Bloque;
import uade.edu.progra3.model.Transaccion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * @author AlejandroFoglino
 */
public class AlgoritmoDeBlockchainImpl implements AlgoritmoDeBlockchain {
    private static final boolean True = false;

	@Override
    public List<List<Bloque>> construirBlockchain(List<Transaccion> transacciones, int maxTamanioBloque, int maxValorBloque, int maxTransacciones, int maxBloques) {
      int pruebaDeTrabajo = 10;
      
      List<List<Bloque>> soluciones = new ArrayList<>();      
      Set<Transaccion> transaccionesVisitadas = new HashSet<>();
      List<Transaccion> transaccionesValidas = new ArrayList<>();
      List<Bloque> bloquesPosibles = new ArrayList<>();
      List<Bloque> combinacionActual = new ArrayList<>();
      
      transaccionesValidas = validarTransacciones(transacciones, maxValorBloque, maxTamanioBloque);
      bloquesPosibles = buscarBloquesPosibles(transaccionesValidas, maxTransacciones, maxTamanioBloque, maxValorBloque, pruebaDeTrabajo);
      transaccionesBacktracking(transaccionesValidas, combinacionActual,  bloquesPosibles,  soluciones, transaccionesVisitadas, maxBloques);
      
      return soluciones;
    }

    public boolean verificarDependencias(List<Bloque> combinacionActual, Set<Transaccion> transaccionesVisitadas) {
    	 for (Bloque bloque: combinacionActual) {
             for (Transaccion transaccion : bloque.getTransacciones()) {
                 if (transaccion.getDependencia() != null && !transaccionesVisitadas.contains(transaccion.getDependencia())) {
                     return false;
                 }
             }
    	 }
         return true;
    }
    
    
    public boolean esBloqueValido(Bloque bloque, int maxTamanioBloque, int maxValorBloque, int maxTransacciones,
        int pruebaDeTrabajo) {
    	boolean BloqueValido = false;
    	if (bloque.getValorTotal() <= maxValorBloque && bloque.getTamanioTotal() <= maxTamanioBloque
            && bloque.getTransacciones().size() <= maxTransacciones
            && bloque.getValorTotal() % pruebaDeTrabajo == 0)
        BloqueValido = true;
    	return BloqueValido;
	}


    public List<Bloque> buscarBloquesPosibles(List<Transaccion> transacciones, int maxTransacciones, int maxTamanioBloque,
        int maxValorBloque, int pruebaDeTrabajo) {

    	List<Bloque> bloquesPosibles = new ArrayList<>();
    	List<Transaccion> combinacionActual = new ArrayList<>();

    	Combinaciones(transacciones, bloquesPosibles, combinacionActual, 0, maxTransacciones, maxTamanioBloque, maxValorBloque,
            pruebaDeTrabajo);

    	return bloquesPosibles;
    }

    private void Combinaciones(List<Transaccion> transacciones, List<Bloque> bloquesPosibles, List<Transaccion> combinacionActual,
        int inicio, int maxTransacciones, int maxTamanioBloque, int maxValorBloque, int pruebaDeTrabajo) {


    	if (!combinacionActual.isEmpty()) {
    		Bloque bloque = new Bloque();
    		int tamanioTotal = 0;
    		int valorTotal = 0;
    		for(Transaccion transaccion: combinacionActual) {
    			tamanioTotal = tamanioTotal + transaccion.getTamanio();
    			valorTotal = valorTotal + transaccion.getValor();
    		}
    		bloque.setTamanioTotal(tamanioTotal);
    		bloque.setValorTotal(valorTotal);
    		
    		bloque.setTransacciones(new ArrayList<>(combinacionActual));  // Asignar las transacciones al bloque
    		if (esBloqueValido(bloque, maxTamanioBloque, maxValorBloque, maxTransacciones, pruebaDeTrabajo)) {
    			bloquesPosibles.add(bloque);
    		}
    	}

    	if (combinacionActual.size() == maxTransacciones) {
    		return;
    	}


    	for (int i = inicio; i < transacciones.size(); i++) {
    		combinacionActual.add(transacciones.get(i)); 
    		Combinaciones(transacciones, bloquesPosibles, combinacionActual, i + 1, maxTransacciones, maxTamanioBloque, maxValorBloque,
                pruebaDeTrabajo);
    		combinacionActual.remove(combinacionActual.size() - 1); 
    	}
    }


    public List<Transaccion> validarTransacciones(List<Transaccion> transacciones, int maxValorBloque, int maxTamanioBloque) {
    	List<Transaccion> transaccionesValidas = new ArrayList<>();
    	
    	for (int i = 0; i < transacciones.size(); i++) {
    		Transaccion combinacionActual = transacciones.get(i);
    		if (combinacionActual.isFirmada() && combinacionActual.getTamanio() <= maxTamanioBloque && combinacionActual.getValor() <= maxValorBloque) {
    			transaccionesValidas.add(combinacionActual);
    		}
    	}
    	
    	return transaccionesValidas;
    }
    
    
    private List<Bloque> eliminarBloquesConTransferenciasUtilizadas(List<Bloque> bloquesPosibles, Set<Transaccion> transaccionesVisitadas) {
    	List<Bloque> bloquesPosiblesActualizados = new ArrayList<>();
    	for(Bloque bloque: bloquesPosibles) {
    		boolean bloqueConTransferenciaVisitada = false;
    		for(Transaccion transaccion : bloque.getTransacciones()) {
    			if (transaccionesVisitadas.contains(transaccion)) { 
    				bloqueConTransferenciaVisitada = true;
    			}
    		}
    		
    		if (!bloqueConTransferenciaVisitada) {
    			bloquesPosiblesActualizados.add(bloque);
    		}
    	}
    	
    	return bloquesPosiblesActualizados;
    }
    
    public void transaccionesBacktracking(List<Transaccion> transacciones, List<Bloque> combinacionActual, List<Bloque> bloquesPosibles, List<List<Bloque>> soluciones, Set<Transaccion> transaccionesVisitadas, int maxBloques){
    	if (!combinacionActual.isEmpty()) {
    		if (verificarDependencias(combinacionActual, transaccionesVisitadas)) {
    			List<Bloque> listaDeBloques = new ArrayList<>(combinacionActual);
    			soluciones.add(listaDeBloques);
    			int posUltimoBloque = combinacionActual.size() - 1;
    			Bloque ultimoBloque = combinacionActual.get(posUltimoBloque);
    			List<Transaccion> transaccionUltimoBloque= ultimoBloque.getTransacciones();
    			for(Transaccion transaccion: transaccionUltimoBloque) {
    				if(!transaccionesVisitadas.contains(transaccion)) {
    					transaccionesVisitadas.add(transaccion);
    				}
    			}
    			bloquesPosibles = eliminarBloquesConTransferenciasUtilizadas(bloquesPosibles, transaccionesVisitadas);
    		} else {
    			return;
    		}
    	}
    	
    	
    	if (transaccionesVisitadas.size() == transacciones.size() || combinacionActual.size() >= maxBloques) {
    		return;
    	}
    	
    	for(int i = 0; i < bloquesPosibles.size(); i++){
    		combinacionActual.add(bloquesPosibles.get(i)); 
    		transaccionesBacktracking(transacciones, combinacionActual, bloquesPosibles, soluciones, transaccionesVisitadas, maxBloques);
    		int posUltimoBloque = combinacionActual.size() - 1;
			Bloque ultimoBloque = combinacionActual.get(posUltimoBloque);
			List<Transaccion> transaccionUltimoBloque= ultimoBloque.getTransacciones();
			for(Transaccion transaccion: transaccionUltimoBloque) {
				if(transaccionesVisitadas.contains(transaccion)) {
					transaccionesVisitadas.remove(transaccion);
				}
			}
    		combinacionActual.remove(combinacionActual.size() - 1); 

		}
    			
	}

}
