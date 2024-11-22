package uade.edu.ar.util.grupo8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bloque {
    private final List<Transaccion> transacciones;
    private int tamanoTotal;
    private int valorTotal;

    public Bloque() {
        this.transacciones = new ArrayList<>();
        this.tamanoTotal = 0;
        this.valorTotal = 0;
    }

    public boolean agregarTransaccion(Transaccion t) {
        transacciones.add(t);
        tamanoTotal += t.getTamano();
        valorTotal += t.getValor();
        return true;
    }

    public boolean eliminarTransaccion(Transaccion t) {
        if (transacciones.remove(t)) {
            tamanoTotal -= t.getTamano();
            valorTotal -= t.getValor();
            return true;
        }
        return false;
    }

    public List<Transaccion> getTransacciones() {
        return Collections.unmodifiableList(transacciones);
    }

    public int getTamanoTotal() {
        return tamanoTotal;
    }

    public int getValorTotal() {
        return valorTotal;
    }
}
