package uade.edu.ar.util.grupo4;


import uade.edu.progra3.AlgoritmoDeBlockchain;

import uade.edu.progra3.model.Transaccion;

import java.util.ArrayList;
import java.util.List;

public class AlgoritmoDeBlockchainImpl implements AlgoritmoDeBlockchain {
    
    /**
     * Construye una blockchain válida a partir de una lista de transacciones
     * @param transacciones Lista de transacciones a procesar
     * @param maxTamanioBloque Tamaño máximo permitido por bloque (en KB)
     * @param maxValorBloque Valor máximo permitido por bloque (en satoshis)
     * @param maxTransacciones Número máximo de transacciones por bloque
     * @param maxBloques Número máximo de bloques en la blockchain
     * @return Lista de soluciones válidas (cada solución es una lista de bloques)
     */
    public List<List<Bloque>> construirBlockchain(List<Transaccion> transacciones, 
                                                 int maxTamanioBloque, 
                                                 int maxValorBloque, 
                                                 int maxTransacciones, 
                                                 int maxBloques) {
        // Validación de parámetros de entrada
        if(transacciones.isEmpty()) {
            return new ArrayList<>();
        }

        if(maxTamanioBloque <= 0 || maxValorBloque <= 0 || maxBloques <= 0 || maxTransacciones <= 0) {
            return new ArrayList<>();
        }

        // Inicialización de estructuras para el backtracking
        List<List<List<Integer>>> listaSoluciones = new ArrayList<>();
        List<Integer> actSolucion = new ArrayList<>();

        // Inicializar array de solución con ceros
        for(int i = 0; i < transacciones.size(); i++) {
            actSolucion.add(0);
        }

        // Valores iniciales para la primera etapa
        int totalValorBloque = 0;
        int totalTamanioBloque = 0;
        int totalCantidadTransacciones = 0;
        int etapa = 0;

        backtrackBlockchain(transacciones, actSolucion, totalValorBloque, 
                          totalTamanioBloque, totalCantidadTransacciones, 
                          etapa, listaSoluciones, maxTamanioBloque, 
                          maxValorBloque, maxBloques, maxTransacciones);

        
        return convertirSolucionesABlockchain(listaSoluciones, transacciones);
    }

    private void backtrackBlockchain(List<Transaccion> transacciones, 
                                   List<Integer> actSolucion, 
                                   int totalValorBloque, 
                                   int totalTamanioBloque, 
                                   int totalCantidadTransacciones, 
                                   int etapa, 
                                   List<List<List<Integer>>> listaSoluciones,
                                   int maxTamanioBloque, 
                                   int maxValorBloque, 
                                   int maxBloques, 
                                   int maxTransacciones) {

        // Contar el número de bloques actuales
        int numBloques = 0;
        for(int j = 0; j < etapa; j++) {
            if(actSolucion.get(j) == maxTransacciones) {
                numBloques++;
            }
        }
        
        // Para cada decisión posible 
        // (0: no incluir, 
        // 1: incluir en bloque actual, 
        // 2: crear nuevo bloque)
        for(int i = 0; i <= 2; i++) {
            // Si ya tenemos el máximo de bloques, no permitir crear uno nuevo
            if(i == 2 && numBloques >= maxBloques - 1) {
                continue;
            }
            
            actSolucion.set(etapa, i);
            
            // Si creamos nuevo bloque (i == 2), reiniciamos los totales
            int nuevoValorBloque = (i == 2) ? transacciones.get(etapa).getValor() : 
                                  totalValorBloque + (transacciones.get(etapa).getValor() * (i == 1 ? 1 : 0));
            int nuevoTamanioBloque = (i == 2) ? transacciones.get(etapa).getTamanio() : 
                                    totalTamanioBloque + (transacciones.get(etapa).getTamanio() * (i == 1 ? 1 : 0));
            int nuevaCantidadTransacciones = (i == 2) ? 1 : 
                                           totalCantidadTransacciones + (i == 1 ? 1 : 0);

            // Validaciones principales
            if (nuevoValorBloque > maxValorBloque ||
                nuevaCantidadTransacciones > maxTransacciones ||
                nuevoTamanioBloque > maxTamanioBloque) {
                continue;
            }

            // Si llegamos a la última etapa, validar y agregar solución
            if(etapa == transacciones.size() - 1) {
                if(validarDependencias(transacciones.get(etapa), actSolucion, transacciones)) {

                    List<List<Integer>> bloquesSolucion = new ArrayList<>();
                    List<Integer> nuevaActSolucion = new ArrayList<>(actSolucion);

                    bloquesSolucion.add(nuevaActSolucion);

                    if (bloquesSolucion.size() < maxBloques) {
                        listaSoluciones.add(bloquesSolucion);
                    }
                }
            } else {
                backtrackBlockchain(transacciones, actSolucion, nuevoValorBloque,
                                  nuevoTamanioBloque, nuevaCantidadTransacciones,
                                  etapa + 1, listaSoluciones, maxTamanioBloque,
                                  maxValorBloque, maxBloques, maxTransacciones);
            }
        }
    }

    /**
     * Valida que todas las dependencias de una transacción estén resueltas
     * @param transaccion Transacción a validar
     * @param solucion Solución actual
     * @param transacciones Lista completa de transacciones
     * @return true si todas las dependencias están resueltas
     */
    private boolean validarDependencias(Transaccion transaccion, 
                                      List<Integer> solucion, 
                                      List<Transaccion> transacciones) {
        if(transaccion.getDependencia() == null) {
            return true;
        }
        return existeDependenciaResuelta(transaccion.getDependencia(), solucion, transacciones);
    }

    /**
     * Verifica si una dependencia específica está resuelta en la solución actual
     * @param dependencia Transacción de la que se depende
     * @param solucion Solución actual
     * @param transacciones Lista completa de transacciones
     * @return true si la dependencia está resuelta
     */
    private boolean existeDependenciaResuelta(Transaccion dependencia, 
                                            List<Integer> solucion,
                                            List<Transaccion> transacciones) {
        for(int i = 0; i < solucion.size(); i++) {
            if(solucion.get(i) == 1 && dependencia.equals(transacciones.get(i))) {
                return true;
            }
        }
        return false;
    }

    private List<List<Bloque>> convertirSolucionesABlockchain(List<List<List<Integer>>> soluciones,
                                                              List<Transaccion> transacciones) {
        List<List<Bloque>> blockchain = new ArrayList<>();

        for(List<List<Integer>> solucionBloques : soluciones) {
            List<Bloque> chain = new ArrayList<>();
            List<Transaccion> blockTransactions = new ArrayList<>();
            
            for(int i = 0; i < solucionBloques.get(0).size(); i++) {
                int decision = solucionBloques.get(0).get(i);
                
                if(decision > 0) { // Si es 1 o 2
                    blockTransactions.add(transacciones.get(i));
                    
                    if(decision == 2 || i == solucionBloques.get(0).size() - 1) {
                        if(!blockTransactions.isEmpty()) {
                            chain.add(new Bloque(blockTransactions));
                            blockTransactions = new ArrayList<>();
                        }
                    }
                }
            }

            if(!chain.isEmpty()) {
                blockchain.add(chain);
            }
        }

        return blockchain;
    }
}