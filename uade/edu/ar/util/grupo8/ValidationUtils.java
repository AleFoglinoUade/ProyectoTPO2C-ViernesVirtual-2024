// ValidationUtils.java
package uade.edu.ar.util.grupo8;

import com.blockchain.model.Bloque;
import com.blockchain.model.Transaccion;
import java.util.Set;

public class ValidationUtils {
    private static final int KB_TO_MB = 1024;

    public static boolean esValidoBloque(
            Bloque bloque,
            int maxTamanoBloque,
            int maxValorBloque,
            int maxTransacciones) {
        
        if (bloque.getTamanoTotal() > maxTamanoBloque * KB_TO_MB) return false;
        if (bloque.getValorTotal() > maxValorBloque) return false;
        if (bloque.getTransacciones().size() > maxTransacciones) return false;
        if (bloque.getValorTotal() % 10 != 0) return false;
        
        return true;
    }

    public static boolean dependenciasSatisfechas(
            Transaccion transaccion,
            Set<String> transaccionesIncluidas) {
        return transaccionesIncluidas.containsAll(transaccion.getDependencias());
    }
}