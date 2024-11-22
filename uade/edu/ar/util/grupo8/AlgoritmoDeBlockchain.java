package uade.edu.ar.util.grupo8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//AlgoritmoDeBlockchain.java
public class AlgoritmoDeBlockchain {
 private static final int KB_TO_MB = 1024;
 
 public List<List<Bloque>> construirBlockchain(
         List<Transaccion> transacciones,
         int maxTamanoBloque,
         int maxValorBloque,
         int maxTransacciones,
         int maxBloques) {
     
     List<List<Bloque>> soluciones = new ArrayList<>();
     List<Bloque> blockchainActual = new ArrayList<>();
     Set<String> transaccionesIncluidas = new HashSet<>();
     
     construirBlockchainRecursivo(
         transacciones,
         maxTamanoBloque,
         maxValorBloque,
         maxTransacciones,
         maxBloques,
         blockchainActual,
         transaccionesIncluidas,
         soluciones);
         
     return soluciones;
 }
 
 private void construirBlockchainRecursivo(
         List<Transaccion> transacciones,
         int maxTamanoBloque,
         int maxValorBloque,
         int maxTransacciones,
         int maxBloques,
         List<Bloque> blockchainActual,
         Set<String> transaccionesIncluidas,
         List<List<Bloque>> soluciones) {
     
     // Si ya procesamos todas las transacciones, tenemos una solución válida
     if (transaccionesIncluidas.size() == transacciones.size()) {
         soluciones.add(new ArrayList<>(blockchainActual));
         return;
     }
     
     // Si excedimos el número máximo de bloques, retornamos
     if (blockchainActual.size() >= maxBloques) {
         return;
     }
     
     // Crear un nuevo bloque
     Bloque bloqueActual = new Bloque();
     List<Transaccion> transaccionesValidas = obtenerTransaccionesValidas(
         transacciones,
         transaccionesIncluidas,
         bloqueActual,
         maxTamanoBloque,
         maxValorBloque,
         maxTransacciones);
         
     // Probar todas las combinaciones posibles de transacciones válidas
     backtrack(
         transacciones,
         transaccionesValidas,
         maxTamanoBloque,
         maxValorBloque,
         maxTransacciones,
         maxBloques,
         bloqueActual,
         blockchainActual,
         transaccionesIncluidas,
         soluciones);
 }
 
 private void backtrack(
         List<Transaccion> todasTransacciones,
         List<Transaccion> transaccionesValidas,
         int maxTamanoBloque,
         int maxValorBloque,
         int maxTransacciones,
         int maxBloques,
         Bloque bloqueActual,
         List<Bloque> blockchainActual,
         Set<String> transaccionesIncluidas,
         List<List<Bloque>> soluciones) {
     
     // Verificar si el bloque actual es válido
     if (esValidoBloque(bloqueActual, maxTamanoBloque, maxValorBloque, maxTransacciones)) {
         // Agregar el bloque actual a la blockchain
         blockchainActual.add(bloqueActual);
         
         // Continuar con el siguiente bloque
         construirBlockchainRecursivo(
             todasTransacciones,
             maxTamanoBloque,
             maxValorBloque,
             maxTransacciones,
             maxBloques,
             blockchainActual,
             transaccionesIncluidas,
             soluciones);
             
         // Backtrack: remover el bloque actual
         blockchainActual.remove(blockchainActual.size() - 1);
     }
     
     // Probar agregando cada transacción válida
     for (Transaccion t : transaccionesValidas) {
         if (!transaccionesIncluidas.contains(t.getId())) {
             bloqueActual.agregarTransaccion(t);
             transaccionesIncluidas.add(t.getId());

             backtrack(
                     todasTransacciones,
                     transaccionesValidas,
                     maxTamanoBloque,
                     maxValorBloque,
                     maxTransacciones,
                     maxBloques,
                     bloqueActual,
                     blockchainActual,
                     transaccionesIncluidas,
                     soluciones);

             // Backtrack: remover la transacción
             bloqueActual.eliminarTransaccion(bloqueActual.getTransacciones().get(bloqueActual.getTransacciones().size() - 1));
             transaccionesIncluidas.remove(t.getId());
         }
     }

 }
 
 private List<Transaccion> obtenerTransaccionesValidas(
         List<Transaccion> transacciones,
         Set<String> transaccionesIncluidas,
         Bloque bloqueActual,
         int maxTamanoBloque,
         int maxValorBloque,
         int maxTransacciones) {
     
     List<Transaccion> validas = new ArrayList<>();
     
     for (Transaccion t : transacciones) {
         if (!transaccionesIncluidas.contains(t.getId()) &&
             dependenciasSatisfechas(t, transaccionesIncluidas) &&
             cabeEnBloque(t, bloqueActual, maxTamanoBloque, maxValorBloque, maxTransacciones)) {
             validas.add(t);
         }
     }
     
     return validas;
 }
 
 private boolean dependenciasSatisfechas(Transaccion t, Set<String> transaccionesIncluidas) {
     return transaccionesIncluidas.containsAll(t.getDependencias());
 }
 
 private boolean cabeEnBloque(
         Transaccion t,
         Bloque bloque,
         int maxTamanoBloque,
         int maxValorBloque,
         int maxTransacciones) {
     
     return (bloque.getTamanoTotal() + t.getTamano()) <= maxTamanoBloque * KB_TO_MB &&
            (bloque.getValorTotal() + t.getValor()) <= maxValorBloque &&
            (bloque.getTransacciones().size() + 1) <= maxTransacciones;
 }
 
 private boolean esValidoBloque(
         Bloque bloque,
         int maxTamanoBloque,
         int maxValorBloque,
         int maxTransacciones) {
     
     // Verificar tamaño máximo
     if (bloque.getTamanoTotal() > maxTamanoBloque * KB_TO_MB) return false;
     
     // Verificar valor máximo
     if (bloque.getValorTotal() > maxValorBloque) return false;
     
     // Verificar número máximo de transacciones
     if (bloque.getTransacciones().size() > maxTransacciones) return false;
     
     // Verificar prueba de trabajo (suma divisible por 10)
     if (bloque.getValorTotal() % 10 != 0) return false;
     
     return true;
 }
}