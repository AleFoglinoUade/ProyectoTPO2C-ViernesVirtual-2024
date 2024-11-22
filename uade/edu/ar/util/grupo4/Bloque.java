package uade.edu.ar.util.grupo4;

import uade.edu.progra3.model.Transaccion;

import java.util.List;

public class Bloque {
    private List<Transaccion> transacciones;
    private int tamanioTotal;
    private int valorTotal;

    public Bloque(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
        this.calcularTotales();
    }

    private void calcularTotales() {
        this.tamanioTotal = 0;
        this.valorTotal = 0;
        for (Transaccion t : transacciones) {
            this.tamanioTotal += t.getTamanio();
            this.valorTotal += t.getValor();
        }
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public int getTamanioTotal() {
        return tamanioTotal;
    }

    public int getValorTotal() {
        return valorTotal;
    }
} 