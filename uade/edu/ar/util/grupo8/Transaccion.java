package uade.edu.ar.util.grupo8;

import java.util.Set;

public class Transaccion {
    private final String id;
    private final int tamano;
    private final int valor;
    private final Set<String> dependencias;
    private final int firmas;

    public Transaccion(String id, int tamano, int valor, Set<String> dependencias, int firmas) {
        this.id = id;
        this.tamano = tamano;
        this.valor = valor;
        this.dependencias = dependencias;
        this.firmas = firmas;
    }

    // Getters
    public String getId() { return id; }
    public int getTamano() { return tamano; }
    public int getValor() { return valor; }
    public Set<String> getDependencias() { return Set.copyOf(dependencias); }
    public int getFirmas() { return firmas; }

    @Override
    public String toString() {
        return "Transaccion{" +
               "id='" + id + '\'' +
               ", tamano=" + tamano +
               ", valor=" + valor +
               ", dependencias=" + dependencias +
               ", firmas=" + firmas +
               '}';
    }
}
