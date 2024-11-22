package uade.edu.ar.util.grupo4;

import uade.edu.ar.AlgoritmoDeBlockchainImpl;
import uade.edu.ar.util.TransaccionUtils;
import uade.edu.progra3.model.Transaccion;
import uade.edu.progra3.model.Bloque;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Casos de prueba válidos
        probarTransaccionesSimpleValidasPreestablecidas();
        probarTransaccionesDependientesValidasPreestablecidas();
        
        // Casos de prueba inválidos
        probarValorBloqueInvalidoPreestablecido();
        probarTamanioBloqueInvalidoPreestablecido();
        probarFirmasInvalidasPreestablecidas();
    }

    /**
     * Prueba transacciones simples válidas
     * - Tamaño del bloque < 1MB
     * - Valor del bloque < 100 satoshis y divisible por 10
     * - Cantidad de transacciones ≤ 3
     */
    private static void probarTransaccionesSimpleValidasPreestablecidas() {
        AlgoritmoDeBlockchain algoritmoDeBlockchain = new AlgoritmoDeBlockchainImpl();
        List<Transaccion> transacciones = TransaccionUtils.crearTransaccionesSimples(10, 100, 100, 5);
        List<List<Bloque>> blockchain = algoritmoDeBlockchain.construirBlockchain(transacciones,1024,100,3,2);
        imprimirInformacionBlockchain(blockchain);
    }

    /**
     * Prueba transacciones válidas con dependencias
     * - Verifica que las dependencias se resuelvan en el orden correcto
     * - Todas las transacciones deben estar firmadas
     */
    private static void probarTransaccionesDependientesValidasPreestablecidas() {
        AlgoritmoDeBlockchainImpl algoritmo = new AlgoritmoDeBlockchainImpl();
        
        List<Transaccion> transacciones = new ArrayList<>();
        // Transacción base: 20KB tamaño, 20 satoshis
        Transaccion t1 = new Transaccion(20, 20, null, 1);
        t1.agregarFirma();
        // Transacción dependiente: 30KB tamaño, 30 satoshis, depende de t1
        Transaccion t2 = new Transaccion(30, 30, t1, 1);
        t2.agregarFirma();
        
        transacciones.add(t1);
        transacciones.add(t2);
        
        List<List<Bloque>> blockchain = algoritmo.construirBlockchain(transacciones, 1024, 100, 3, 2);
        imprimirInformacionBlockchain(blockchain);
    }

    /**
     * Prueba transacción con valor inválido (>100 satoshis)
     * - Debe retornar 0 soluciones
     */
    private static void probarValorBloqueInvalidoPreestablecido() {
        AlgoritmoDeBlockchainImpl algoritmo = new AlgoritmoDeBlockchainImpl();
        
        List<Transaccion> transacciones = new ArrayList<>();
        // Transacción con valor > 100 satoshis (inválido)
        Transaccion t1 = new Transaccion(50, 120, null, 1);
        t1.agregarFirma();
        
        transacciones.add(t1);
        
        List<List<Bloque>> blockchain = algoritmo.construirBlockchain(transacciones, 1024, 100, 3, 2);
        imprimirInformacionBlockchain(blockchain);
    }

    /**
     * Prueba transacción con tamaño inválido (>1MB)
     * - Debe retornar 0 soluciones
     */
    private static void probarTamanioBloqueInvalidoPreestablecido() {
        AlgoritmoDeBlockchainImpl algoritmo = new AlgoritmoDeBlockchainImpl();
        
        List<Transaccion> transacciones = new ArrayList<>();
        // Transacción con tamaño > 1MB (inválido)
        Transaccion t1 = new Transaccion(1500, 30, null, 1);
        t1.agregarFirma();
        
        transacciones.add(t1);
        
        List<List<Bloque>> blockchain = algoritmo.construirBlockchain(transacciones, 1024, 100, 3, 2);
        imprimirInformacionBlockchain(blockchain);
    }

    /**
     * Prueba transacción con firmas insuficientes
     * - Debe retornar 0 soluciones
     */
    private static void probarFirmasInvalidasPreestablecidas() {
        AlgoritmoDeBlockchainImpl algoritmo = new AlgoritmoDeBlockchainImpl();
        
        List<Transaccion> transacciones = new ArrayList<>();
        // Transacción que requiere 2 firmas pero solo tiene 1
        Transaccion t1 = new Transaccion(50, 30, null, 2);
        t1.agregarFirma(); // Solo se agrega 1 firma cuando se requieren 2
        
        transacciones.add(t1);
        
        List<List<Bloque>> blockchain = algoritmo.construirBlockchain(transacciones, 1024, 100, 3, 2);
        imprimirInformacionBlockchain(blockchain);
    }

    
    private static void imprimirInformacionBlockchain(List<List<Bloque>> blockchain) {
        System.out.println("Numero de soluciones: " + blockchain.size());
        
        for (int i = 0; i < blockchain.size(); i++) {
            System.out.println("\nSolucion " + (i + 1) + ":");
            List<Bloque> chain = blockchain.get(i);
            for (Bloque bloque : chain) {
                System.out.println("  Tamanio del bloque: " + bloque.getTamanioTotal());
                System.out.println("  Valor del bloque: " + bloque.getValorTotal());
                System.out.println("  Cantidad de transacciones: " + bloque.getTransacciones().size());
            }
        }
    }
}
