package uade.edu.ar.util.grupo1;

import uade.edu.progra3.AlgoritmoDeBlockchain;
import uade.edu.progra3.model.Bloque;
import uade.edu.progra3.model.Transaccion;

import java.util.ArrayList;
import java.util.List;

public class AlgoritmoDeBlockchainImpl implements AlgoritmoDeBlockchain {
    @Override
    public List<List<Bloque>> construirBlockchain(List<Transaccion> transacciones, int maxTamanioBloque, int maxValorBloque, int maxTransacciones, int maxBloques) {
        List<List<Bloque>> soluciones = new ArrayList<>();
        List<Bloque> bloques = new ArrayList<>();

        backtracking2(0, transacciones, bloques, soluciones, maxTamanioBloque, maxValorBloque, maxTransacciones, maxBloques);

        return soluciones;
    }

    private void backtracking2(int indice, List<Transaccion> transacciones, List<Bloque> bloquesActuales, List<List<Bloque>> soluciones, int maxTamanioBloque, int maxValorBloque, int maxTransacciones, int maxBloques) {
        //CHANGED cambie: bloque.size > 0 por: transacciones.size() > 0; Si no hay mas transacciones es una condicion de corte
        if(bloquesActuales.size() <= maxBloques) {
            soluciones.add(bloquesActuales);
            return;
        }

        if(bloquesActuales.size() > maxBloques) {
            return;
        }

        Bloque bloqueActual;
        //hago esto para evaluar que no me pase de maxtransacciones
        if (bloquesActuales.isEmpty() || bloquesActuales.get(bloquesActuales.size() - 1).getTransacciones().size() >= maxTransacciones) {
            bloqueActual = new Bloque();
            bloquesActuales.add(bloqueActual);
        } else {
            bloqueActual = bloquesActuales.get(bloquesActuales.size() - 1);
        }

        for (int i = indice; i < transacciones.size(); i++) {
            var transaccionSeleccionada = transacciones.get(i);

            if (puedeAgregarTransaccion(bloqueActual, transaccionSeleccionada, maxTamanioBloque, maxValorBloque, maxTransacciones)) {
                var transaccionesActuales = bloqueActual.getTransacciones();
                transaccionesActuales.add(transaccionSeleccionada);

                bloqueActual.setTransacciones(transaccionesActuales);
                bloqueActual.setValorTotal(bloqueActual.getValorTotal() + transaccionSeleccionada.getValor());


                //if (bloqueActual.getValorTotal() % 10 == 0) {
                bloquesActuales.add(bloqueActual);

                backtracking2(i + 1, transacciones, bloquesActuales, soluciones, maxTamanioBloque, maxValorBloque, maxTransacciones, maxBloques);
                //}

                bloqueActual.getTransacciones().remove(bloqueActual.getTransacciones().size() - 1);
                bloqueActual.setTamanioTotal(bloqueActual.getTamanioTotal() - transaccionSeleccionada.getTamanio());
                bloqueActual.setValorTotal(bloqueActual.getValorTotal() - transaccionSeleccionada.getValor());
            }

            if (bloqueActual.getTransacciones().isEmpty()) {
                bloquesActuales.remove(bloquesActuales.size() - 1);
            }
            //backtracking2(indice-1, transaccionesAux , bloquesActuales, soluciones, bloqueActual, maxTamanioBloque, maxValorBloque, maxTransacciones, maxBloques);
        }
    }

    private boolean puedeAgregarTransaccion(Bloque bloque, Transaccion transaccion, int maxTamanioBloque, int maxValorBloque, int maxTransacciones) {
        return bloque.getValorTotal() + transaccion.getValor() <= maxTamanioBloque;
        /*return (bloque.getTransacciones().size() < maxTransacciones &&
                bloque.getTamanioTotal() + transaccion.getTamanio() <= maxValorBloque &&
                bloque.getValorTotal() + transaccion.getValor() <= maxTamanioBloque &&
                (transaccion.getDependencia() == null || transaccion.getFirmasActuales() >= transaccion.getFirmasRequeridas()));*/
    }

    /*
        maxTamanioBloque = Valor máximo por bloque: La suma de los valores de las transacciones en un bloque no debe superar 100 satoshis.

        maxValorBloque = El tamaño de cada bloque sigue siendo de 1 MB.

        maxTransacciones = Máximo de transacciones por bloque: Un bloque puede contener como máximo 3 transacciones.

        maxBloques = cantidad maxima de bloques de la blockchain
    */
    private void backtracking(int indice, List<Transaccion> transacciones, List<Bloque> bloques, List<List<Bloque>> soluciones, int maxTamanioBloque, int maxValorBloque, int maxTransacciones, int maxBloques) {
        //CHANGED cambie: bloque.size > 0 por: transacciones.size() > 0; Si no hay mas transacciones es una condicion de corte
        if(transacciones.size() > 0 && bloques.size() <= maxBloques)
            soluciones.add(bloques);

        while (indice <= transacciones.size()) {
            Transaccion transaccion = transacciones.get(indice);

            if(validarTransaccion(transaccion, bloques, maxTamanioBloque, maxValorBloque, maxTransacciones)){
                Bloque bloque = new Bloque();
                bloque.setTransacciones(transacciones);
                //FIXME Verificar bien si está bien pasarle al bloque todas las transacciones

                if(validarBloque(bloque)) {
                    bloques.add(bloque);

                    //FIXME no se esta restando el maxValorBloque, maxTransacciones, maxBloques, etc.
                    backtracking(indice+1, transacciones, bloques, soluciones, maxTamanioBloque, maxValorBloque, maxTransacciones, maxBloques);
                    bloques.remove(bloques.size() - 1);
                }
            }
            indice++;
        }
    }

    private boolean validarBloque(Bloque bloque) {
        return bloque.getTamanioTotal() > 0 && tieneHashValido(bloque); // && verificarFirmas(bloque)
        //TODO el bloque no tiene firmas, ver que queriamos validar
    }

    private boolean tieneHashValido(Bloque bloque) {
        //TODO verificar este metodo, como calcularlo
        return true;
    }

    private boolean validarTransaccion(Transaccion transaccion, List<Bloque> bloques, int maxTamanioBloque, int maxValorBloque, int maxTransacciones) {
        if(transaccion.getDependencia() != null)
            return esDependenciaValida(transaccion, bloques);

        if(transaccion.getFirmasRequeridas()>2)
            return tieneFirmasRequeridas(transaccion);

        //FIXME el código venia usando bloques y ahora usa un bloque.
        //if (tamaño(bloque) + tamaño(transaccion) > maxTamañoBloque) or (valor(bloque) + valor(transaccion) > maxValorBloque):
        return true;
    }

    private boolean tieneFirmasRequeridas(Transaccion transaccion) {
        return true;
    }

    private boolean esDependenciaValida(Transaccion transaccion, List<Bloque> bloques) {
        return true;
    }
}