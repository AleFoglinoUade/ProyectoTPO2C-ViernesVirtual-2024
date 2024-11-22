package uade.edu.ar.util.grupo5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import uade.edu.progra3.model.Bloque;
import uade.edu.progra3.model.Transaccion;

public class Principal {
	

	    public static List<Transaccion> crearTransaccionesSimples(int cantidad, int maxTamanio, int maxValor, int maxFirmas) {
	        List<Transaccion> transacciones = new ArrayList<>();

	        for(int i = 0; i < cantidad; ++i) {
	            int tamanio = (int)(Math.random() * (double)maxTamanio) + 1;
	            int valor = (int)(Math.random() * (double)maxValor) + 1;
	            int firmasRequeridas = (int)(Math.random() * (double)maxFirmas) + 1;
	            Transaccion transaccion = new Transaccion(tamanio, valor, (Transaccion)null, firmasRequeridas);
	            transacciones.add(transaccion);
	        }

	        return transacciones;
	    }

	    public static List<Transaccion> crearTransaccionesConDependencias(int cantidad, int maxTamanio, int maxValor, int maxFirmas) {
	        List<Transaccion> transacciones = new ArrayList<>();
	        Transaccion transaccionAnterior = null;

	        for(int i = 0; i < cantidad; ++i) {
	            int tamanio = (int)(Math.random() * (double)maxTamanio) + 1;
	            int valor = (int)(Math.random() * (double)maxValor) + 1;
	            int firmasRequeridas = (int)(Math.random() * (double)maxFirmas) + 1;
	            Transaccion dependencia = i == 0 ? null : transaccionAnterior;
	            Transaccion transaccion = new Transaccion(tamanio, valor, dependencia, firmasRequeridas);
	            transacciones.add(transaccion);
	            transaccionAnterior = transaccion;
	        }

	        return transacciones;
	    }

	    public static void firmarTransacciones(List<Transaccion> transacciones) {
	        Iterator var2 = transacciones.iterator();

	        while(var2.hasNext()) {
	            Transaccion t = (Transaccion)var2.next();

	            while(!t.isFirmada()) {
	                t.agregarFirma();
	            }
	        }

	    }

	    public static List<Transaccion> crearTransaccionesMixtas(int cantidadSimples, int cantidadConDependencias, int maxTamanio, int maxValor, int maxFirmas) {
	        List<Transaccion> transacciones = new ArrayList<>();
	        transacciones.addAll(crearTransaccionesSimples(cantidadSimples, maxTamanio, maxValor, maxFirmas));
	        transacciones.addAll(crearTransaccionesConDependencias(cantidadConDependencias, maxTamanio, maxValor, maxFirmas));
	        firmarTransacciones(transacciones);
	        return transacciones;
	    }

	

    public static void main(String[] args) {

        List<Transaccion> transacciones = new ArrayList<>();
        
        transacciones = crearTransaccionesMixtas(20, 20, 120, 120, 0);

        AlgoritmoDeBlockchainImpl algoritmo = new AlgoritmoDeBlockchainImpl();
		
		List<List<Bloque>> soluciones = algoritmo.construirBlockchain(transacciones, 100, 100, 3, 10);
		
		
		System.out.println("Blockchains posibles generados (total: " + soluciones.size() + ") : ");
		if (soluciones.isEmpty()) {
		    System.out.println("No se generaron .");
		} else {
			int i=0;
		    for (List<Bloque> blockchain : soluciones) {
		        System.out.println("Blockchain " + i +": ");
		        i++;
		        int j=0;
		        for (Bloque b : blockchain) {
		        	List<Transaccion> current = b.getTransacciones();
		        	if(j!=0) {
		        		System.out.print( " | " );
		        	}
		        	j++;
		        	System.out.print("(");
		        	for(Transaccion t: current) {
		        		int id = System.identityHashCode(t);
		        		if(t.getDependencia() != null) {
		        			System.out.print("id(" + id%199 + ", dependencia: " + System.identityHashCode(t.getDependencia())%199 + ")  ");
		        		} else {
		        			System.out.print("id(" + id%199 + ")  "); // le asigno un id a cada transaccion asi puedo identificarlas en el output
		        		}
		        	} 
		        	System.out.print(")");
		        }
		        System.out.println();
		    }
		}

}}