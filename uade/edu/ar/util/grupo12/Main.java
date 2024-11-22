package uade.edu.ar.util.grupo12;


import uade.edu.progra3.model.Bloque;
import uade.edu.progra3.model.Transaccion;

import java.util.ArrayList;
import java.util.List;

    public class Main {
        public static void main(String[] args) {
            // Crear algunas transacciones de ejemplo
        	List<Transaccion> transacciones = new ArrayList<>();
            Transaccion transaccion1 = new Transaccion(200, 30, null, 2);
            Transaccion transaccion2 = new Transaccion(150, 40, transaccion1, 1);
            Transaccion transaccion3 = new Transaccion(300, 50, null, 2);
            Transaccion transaccion4 = new Transaccion(100, 20, null, 1);
            Transaccion transaccion5 = new Transaccion(250, 30, null, 2);
            transacciones.add(transaccion1);
            transacciones.add(transaccion2);
            transacciones.add(transaccion3);
            transacciones.add(transaccion4);
            transacciones.add(transaccion5);

            // Definir parámetros de la blockchain
            int maxTamanioBloque = 1000;
            int maxValorBloque = 100;
            int maxTransacciones = 3;
            int maxBloques = 2;

            long startTime = System.currentTimeMillis();
            // Crear la implementación de AlgoritmoDeBlockchain
            AlgoritmoDeBlockchainImpl algoritmo = new AlgoritmoDeBlockchainImpl();
            

            List<List<Bloque>> blockchain = algoritmo.construirBlockchain(transacciones, maxTamanioBloque, maxValorBloque, maxTransacciones, maxBloques);
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            System.out.println("Coste temporal: " + elapsedTime);
            
            System.out.println("Blockchain construida con éxito:");

            for (int i = 0; i < blockchain.size(); i++) {
                System.out.println("Solución " + (i + 1) + ":");
                List<Bloque> bloques = blockchain.get(i);
                for (int j = 0; j < bloques.size(); j++) {
                    System.out.println("  Bloque " + (j + 1) + " con transacciones: ");
                    for (Transaccion t : bloques.get(j).getTransacciones()) {
                        System.out.println("    - Transacción (Tamaño: " + t.getTamanio() + ", Valor: " + t.getValor() + ")");
                    }
                }
            }
        }
    }