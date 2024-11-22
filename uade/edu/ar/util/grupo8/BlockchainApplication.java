// BlockchainApplication.java
package uade.edu.ar.util.grupo8;



import java.util.List;
import java.util.stream.Collectors;

public class BlockchainApplication {
    public static void main(String[] args) {
        // Configuración del ejemplo
        List<Transaccion> transacciones = TransaccionUtils.generarTransaccionesEjemplo();
        int maxTamanoBloque = 1; // 1 MB
        int maxValorBloque = 100; // 100 satoshis
        int maxTransacciones = 3;
        int maxBloques = 2;
        
        // Ejecutar algoritmo
        AlgoritmoDeBlockchain algoritmo = new AlgoritmoDeBlockchain();
        List<List<Bloque>> soluciones = algoritmo.construirBlockchain(
            transacciones,
            maxTamanoBloque,
            maxValorBloque,
            maxTransacciones,
            maxBloques);
            
        // Mostrar resultados
        imprimirSoluciones(soluciones);
    }

    private static void imprimirSoluciones(List<List<Bloque>> soluciones) {
        for (int i = 0; i < soluciones.size(); i++) {
            System.out.println("Solución " + (i + 1) + ":");
            List<Bloque> blockchain = soluciones.get(i);
            for (int j = 0; j < blockchain.size(); j++) {
                Bloque bloque = blockchain.get(j);
                System.out.println("  Bloque " + (j + 1) + ":");
                System.out.println("    Transacciones: " + 
                    bloque.getTransacciones().stream()
                        .map(Transaccion::getId)
                        .collect(Collectors.joining(", ")));
                System.out.println("    Tamaño total: " + bloque.getTamanoTotal() + " KB");
                System.out.println("    Valor total: " + bloque.getValorTotal() + " satoshis");
            }
            System.out.println();
        }
    }
}