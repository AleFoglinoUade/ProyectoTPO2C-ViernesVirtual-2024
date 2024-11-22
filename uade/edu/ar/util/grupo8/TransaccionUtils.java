// TransaccionUtils.java
package uade.edu.ar.util.grupo8;

import com.blockchain.model.Transaccion;
import java.util.*;

public class TransaccionUtils {
    public static List<Transaccion> generarTransaccionesEjemplo() {
        List<Transaccion> transacciones = new ArrayList<>();
        
        // T1: Sin dependencias
        transacciones.add(new Transaccion("T1", 200, 30, new HashSet<>(), 2));
        
        // T2: Depende de T1
        Set<String> depT2 = new HashSet<>();
        depT2.add("T1");
        transacciones.add(new Transaccion("T2", 150, 40, depT2, 1));
        
        // T3: Sin dependencias
        transacciones.add(new Transaccion("T3", 300, 50, new HashSet<>(), 2));
        
        // T4: Depende de T3
        Set<String> depT4 = new HashSet<>();
        depT4.add("T3");
        transacciones.add(new Transaccion("T4", 100, 20, depT4, 1));
        
        // T5: Sin dependencias
        transacciones.add(new Transaccion("T5", 250, 30, new HashSet<>(), 2));
        
        return transacciones;
    }
}