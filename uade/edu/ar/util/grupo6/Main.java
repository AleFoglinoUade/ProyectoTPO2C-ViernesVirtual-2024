package uade.edu.ar.util.grupo6;

import uade.edu.ar.AlgoritmoDeBlockchainImpl;
import uade.edu.ar.util.TransaccionUtils;
import uade.edu.progra3.AlgoritmoDeBlockchain;
import uade.edu.progra3.model.Bloque;
import uade.edu.progra3.model.Transaccion;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlgoritmoDeBlockchain algoritmoDeBlockchain = new AlgoritmoDeBlockchainImpl();

        List<Transaccion> transacciones = TransaccionUtils.crearTransaccionesConDependencias(10, 1000, 100, 5);

        TransaccionUtils.firmarTransacciones(transacciones);

        List<List<Bloque>> blockchain = algoritmoDeBlockchain.construirBlockchain(transacciones, 1000, 100, 3, 5);

        if (blockchain.isEmpty()){
            System.out.println("No se generaron cadenas de bloques validas. ");
        } else {
        // Mostrar bloques por pantalla
            for (int i = 0; i < blockchain.size(); i++) {
                System.out.println("Cadena de bloques " + (i + 1) + ":");
                List<Bloque> cadena = blockchain.get(i);

                for (int j = 0; j < cadena.size()-1; j++) {
                    Bloque bloque = cadena.get(j);
                    System.out.println("   Bloque " + (j) + ":");
                    System.out.println("        Tamaño total: " + bloque.getTamanioTotal());
                    System.out.println("        Valor total:  " + bloque.getValorTotal());
                    System.out.println("        Transacciones: ");

                    for (Transaccion transaccion : bloque.getTransacciones()) {
                        System.out.println("       Tamaño: " + transaccion.getTamanio() +
                                ", Valor: " + transaccion.getValor());

                    }
                }
                System.out.println();
            }
        }
    }
}

