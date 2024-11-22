//package uade.edu.progra3;
package uade.edu.ar.util.grupo7;

import uade.edu.progra3.model.Bloque;
import uade.edu.progra3.model.Transaccion;


import java.util.ArrayList;
import java.util.List;

//para el tiemp de ejecucion
import java.time.Duration;
import java.time.Instant;


//CALSE MAIN PARA EJECUTAR:
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Crear una lista de transacciones de prueba
        List<Transaccion> transacciones = new ArrayList<>();
        
        
        
        /*--				USAR PARA HACER TRANSACCIONES SIN DEPENDECIAS, CON DEPENDECIAS.
         * AGREGAR LAS TRANSACCIONES CON DEPENDEICA, TRNSACCIONES ADICIONALES Y 
         * HACER SIMULACION DE FIRMAS DE LA TRANSACCION:
         * 
         * //transacciones sin dependencias
	    transacciones.add(new Transaccion(200, 30, null, 2)); // tamaño 200, valor 30
	    transacciones.add(new Transaccion(150, 40, null, 1)); // tamaño 150, valor 40
	    transacciones.add(new Transaccion(300, 50, null, 1)); // tamaño 300, valor 50
	    transacciones.add(new Transaccion(100, 20, null, 0)); // tamaño 100, valor 20
	    transacciones.add(new Transaccion(250, 30, null, 2)); // tamaño 250, valor 30
	    
	    //transacciones con dependencias
	    Transaccion transaccion1 = new Transaccion(200, 30, null, 2);
	    Transaccion transaccion2 = new Transaccion(150, 40, transaccion1, 1);
	    Transaccion transaccion3 = new Transaccion(300, 50, transaccion2, 1);
	    
	    //agregar la transacciones con dependecnaia:
	    transacciones.add(transaccion1);
	    transacciones.add(transaccion2);
	    transacciones.add(transaccion3);
	    
	    //transacciones adicionales
	    transacciones.add(new Transaccion(100, 20, null, 0)); // tamaño 100, valor 20, no requiere firmas
	    transacciones.add(new Transaccion(250, 30, null, 2)); // tamaño 250, valor 30, requiere 2 firmas
	    
	    
	    
	    //simulacion de firma de la transacciones:
	    transaccion1.agregarFirma(); // Ahora tiene 1 firma
	    transaccion1.agregarFirma(); // Ahora tiene 2 firmas, cumple con el requisito
	
	    transaccion2.agregarFirma(); // Ahora tiene 1 firma, cumple con el requisito
	
	    transaccion3.agregarFirma(); // Ahora tiene 1 firma, cumple con el requisito
    
         * 
         * 
         * 
         * 
         * 
         * */
        
        
        /* 					AGREGANDO 20 TRANSACCIONES:
         * // Agregar 20 transacciones de ejemplo
        transacciones.add(new Transaccion(200, 30, null, 2)); // T1
        transacciones.add(new Transaccion(150, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(400, 60, null, 1)); // T6
        transacciones.add(new Transaccion(350, 70, null, 1)); // T7
        transacciones.add(new Transaccion(500, 80, null, 2)); // T8
        transacciones.add(new Transaccion(600, 90, null, 2)); // T9
        transacciones.add(new Transaccion(700, 100, null, 1)); // T10
        transacciones.add(new Transaccion(800, 110, null, 1)); // T11
        transacciones.add(new Transaccion(900, 120, null, 2)); // T12
        transacciones.add(new Transaccion(1000, 130, null, 2)); // T13
        transacciones.add(new Transaccion(1100, 140, null, 1)); // T14
        transacciones.add(new Transaccion(1200, 150, null, 1)); // T15
        transacciones.add(new Transaccion(1300, 160, null, 2)); // T16
        transacciones.add(new Transaccion(1400, 170, null, 2)); // T17
        transacciones.add(new Transaccion(1500, 180, null, 1)); // T18
        transacciones.add(new Transaccion(1600, 190, null, 1)); // T19
        transacciones.add(new Transaccion(1700, 200, null, 2)); // T20

        // Simulación de firma de las transacciones
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(2).agregarFirma();
        transacciones.get(5).agregarFirma();
        transacciones.get(6).agregarFirma();
        transacciones.get(8).agregarFirma();
        transacciones.get(9).agregarFirma();
        transacciones.get(12).agregarFirma();
        transacciones.get(13).agregarFirma();
        transacciones.get(15).agregarFirma();
        transacciones.get(16).agregarFirma();
         * 
         * 
         * 
         * 
         * 
         * */
        
        
        /*					AGREGANDO 15 TRANSACCIONES:
         * // Agregar 15 transacciones de ejemplo
        transacciones.add(new Transaccion(200, 30, null, 2)); // T1
        transacciones.add(new Transaccion(150, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(400, 60, null, 1)); // T6
        transacciones.add(new Transaccion(350, 70, null, 1)); // T7
        transacciones.add(new Transaccion(500, 80, null, 2)); // T8
        transacciones.add(new Transaccion(600, 90, null, 2)); // T9
        transacciones.add(new Transaccion(700, 100, null, 1)); // T10
        transacciones.add(new Transaccion(800, 110, null, 1)); // T11
        transacciones.add(new Transaccion(900, 120, null, 2)); // T12
        transacciones.add(new Transaccion(1000, 130, null, 2)); // T13
        transacciones.add(new Transaccion(1100, 140, null, 1)); // T14
        transacciones.add(new Transaccion(1200, 150, null, 1)); // T15

        // Simulación de firma de las transacciones
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(2).agregarFirma();
        transacciones.get(5).agregarFirma();
        transacciones.get(6).agregarFirma();
        transacciones.get(8).agregarFirma();
        transacciones.get(9).agregarFirma();
        transacciones.get(12).agregarFirma();
        transacciones.get(13).agregarFirma();
         * 
         * */
        
        
        
        /*
         * 					AGREGANDO 5 TRANSACCIONES:
         *  // Agregar transacciones de ejemplo
        transacciones.add(new Transaccion(200, 30, null, 2)); // tamaño 200, valor 30
        transacciones.add(new Transaccion(150, 40, null, 1)); // tamaño 150, valor 40
        transacciones.add(new Transaccion(300, 50, null, 1)); // tamaño 300, valor 50
        transacciones.add(new Transaccion(100, 20, null, 0)); // tamaño 100, valor 20
        transacciones.add(new Transaccion(250, 30, null, 2)); // tamaño 250, valor 30

        // Simulación de firma de las transacciones
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(2).agregarFirma();
         * 
         * */
        
       
        // Agregando transacciones
        //Transaccion(int, int, Transaccion, int)
        //Transaccion(tamaño, valor, dependencia, firmas)
        //transacciones sin dependencias
        transacciones.add(new Transaccion(202, 30, null, 2)); // T1
        transacciones.add(new Transaccion(150, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(505, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(430, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(750, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1250, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1450, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2150, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        
        transacciones.add(new Transaccion(200, 30, null, 2)); // T1
        transacciones.add(new Transaccion(110, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(500, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(410, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(740, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1150, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1550, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2250, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        /*100*/
        /*------------------------------------------------------------*/
        
        transacciones.add(new Transaccion(202, 30, null, 2)); // T1
        transacciones.add(new Transaccion(150, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(505, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(430, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(750, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1250, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1450, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2150, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        
        transacciones.add(new Transaccion(200, 30, null, 2)); // T1
        transacciones.add(new Transaccion(110, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(500, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(410, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(740, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1150, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1550, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2250, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        /*200*/
        /*------------------------------------------------------------*/
        
        transacciones.add(new Transaccion(202, 30, null, 2)); // T1
        transacciones.add(new Transaccion(150, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(505, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(430, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(750, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1250, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1450, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2150, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        
        transacciones.add(new Transaccion(200, 30, null, 2)); // T1
        transacciones.add(new Transaccion(110, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(500, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(410, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(740, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1150, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1550, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2250, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        /*300*/
        /*------------------------------------------------------------*/
        
        
        transacciones.add(new Transaccion(202, 30, null, 2)); // T1
        transacciones.add(new Transaccion(150, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(505, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(430, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(750, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1250, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1450, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2150, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        
        transacciones.add(new Transaccion(200, 30, null, 2)); // T1
        transacciones.add(new Transaccion(110, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(500, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(410, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(740, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1150, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1550, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2250, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        /*400*/
        /*------------------------------------------------------------*/
        
        transacciones.add(new Transaccion(202, 30, null, 2)); // T1
        transacciones.add(new Transaccion(150, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(505, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(430, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(750, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1250, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1450, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2150, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        
        transacciones.add(new Transaccion(200, 30, null, 2)); // T1
        transacciones.add(new Transaccion(110, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(500, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(410, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(740, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1150, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1550, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2250, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        /*500*/
        /*------------------------------------------------------------*/
        
        
        /*otros 500*/
        
        transacciones.add(new Transaccion(202, 30, null, 2)); // T1
        transacciones.add(new Transaccion(150, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(505, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(430, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(750, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1250, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1450, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2150, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        
        transacciones.add(new Transaccion(200, 30, null, 2)); // T1
        transacciones.add(new Transaccion(110, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(500, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(410, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(740, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1150, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1550, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2250, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        /*100*/
        /*------------------------------------------------------------*/
        
        transacciones.add(new Transaccion(202, 30, null, 2)); // T1
        transacciones.add(new Transaccion(150, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(505, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(430, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(750, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1250, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1450, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2150, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        
        transacciones.add(new Transaccion(200, 30, null, 2)); // T1
        transacciones.add(new Transaccion(110, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(500, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(410, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(740, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1150, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1550, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2250, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        /*200*/
        /*------------------------------------------------------------*/
        
        transacciones.add(new Transaccion(202, 30, null, 2)); // T1
        transacciones.add(new Transaccion(150, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(505, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(430, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(750, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1250, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1450, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2150, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        
        transacciones.add(new Transaccion(200, 30, null, 2)); // T1
        transacciones.add(new Transaccion(110, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(500, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(410, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(740, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1150, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1550, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2250, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        /*300*/
        /*------------------------------------------------------------*/
        
        
        transacciones.add(new Transaccion(202, 30, null, 2)); // T1
        transacciones.add(new Transaccion(150, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(505, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(430, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(750, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1250, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1450, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2150, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        
        transacciones.add(new Transaccion(200, 30, null, 2)); // T1
        transacciones.add(new Transaccion(110, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(500, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(410, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(740, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1150, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1550, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2250, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        /*400*/
        /*------------------------------------------------------------*/
        
        transacciones.add(new Transaccion(202, 30, null, 2)); // T1
        transacciones.add(new Transaccion(150, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(505, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(430, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(750, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1250, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1450, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2150, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        
        transacciones.add(new Transaccion(200, 30, null, 2)); // T1
        transacciones.add(new Transaccion(110, 40, null, 1)); // T2
        transacciones.add(new Transaccion(300, 50, null, 1)); // T3
        transacciones.add(new Transaccion(100, 20, null, 0)); // T4
        transacciones.add(new Transaccion(250, 30, null, 2)); // T5
        transacciones.add(new Transaccion(500, 70, null, 2)); // T6
        transacciones.add(new Transaccion(600, 60, null, 1)); // T7
        transacciones.add(new Transaccion(400, 50, null, 1)); // T8
        transacciones.add(new Transaccion(150, 40, null, 0)); // T9
        transacciones.add(new Transaccion(350, 20, null, 2)); // T10
        transacciones.add(new Transaccion(410, 80, null, 3)); // T11
        transacciones.add(new Transaccion(550, 90, null, 1)); // T12
        transacciones.add(new Transaccion(650, 100, null, 2)); // T13
        transacciones.add(new Transaccion(740, 110, null, 0)); // T14
        transacciones.add(new Transaccion(850, 120, null, 1)); // T15
        transacciones.add(new Transaccion(950, 130, null, 2)); // T16
        transacciones.add(new Transaccion(1050, 140, null, 3)); // T17
        transacciones.add(new Transaccion(1150, 150, null, 1)); // T18
        transacciones.add(new Transaccion(1250, 160, null, 2)); // T19
        transacciones.add(new Transaccion(1550, 170, null, 0)); // T20
        transacciones.add(new Transaccion(1450, 180, null, 1)); // T21
        transacciones.add(new Transaccion(1550, 190, null, 2)); // T22
        transacciones.add(new Transaccion(1650, 200, null, 3)); // T23
        transacciones.add(new Transaccion(1750, 210, null, 1)); // T24
        transacciones.add(new Transaccion(1850, 220, null, 2)); // T25
        transacciones.add(new Transaccion(1950, 230, null, 0)); // T26
        transacciones.add(new Transaccion(2050, 240, null, 1)); // T27
        transacciones.add(new Transaccion(2150, 250, null, 2)); // T28
        transacciones.add(new Transaccion(2250, 260, null, 3)); // T29
        transacciones.add(new Transaccion(2350, 270, null, 1)); // T30
        transacciones.add(new Transaccion(2450, 280, null, 2)); // T31
        transacciones.add(new Transaccion(2550, 290, null, 0)); // T32
        transacciones.add(new Transaccion(2650, 300, null, 1)); // T33
        transacciones.add(new Transaccion(2750, 310, null, 2)); // T34
        transacciones.add(new Transaccion(2850, 320, null, 3)); // T35
        transacciones.add(new Transaccion(2950, 330, null, 1)); // T36
        transacciones.add(new Transaccion(3050, 340, null, 2)); // T37
        transacciones.add(new Transaccion(3150, 350, null, 0)); // T38
        transacciones.add(new Transaccion(3250, 360, null, 1)); // T39
        transacciones.add(new Transaccion(3350, 370, null, 2)); // T40
        transacciones.add(new Transaccion(200, 30, null, 2)); // T41
        transacciones.add(new Transaccion(150, 40, null, 1)); // T42
        transacciones.add(new Transaccion(300, 50, null, 1)); // T43
        transacciones.add(new Transaccion(100, 20, null, 0)); // T44
        transacciones.add(new Transaccion(250, 30, null, 2)); // T45
        transacciones.add(new Transaccion(500, 70, null, 2)); // T46
        transacciones.add(new Transaccion(600, 60, null, 1)); // T47
        transacciones.add(new Transaccion(400, 50, null, 1)); // T48
        transacciones.add(new Transaccion(150, 40, null, 0)); // T49
        transacciones.add(new Transaccion(350, 20, null, 2)); // T50
        /*500*/
        /*------------------------------------------------------------*/
        
        
     // Simulación de firma de las transacciones
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        /*100*/
        /*----------------------------------------------------*/
        
        // Simulación de firma de las transacciones
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        /*200*/
        /*----------------------------------------------------*/
        
       
        // Simulación de firma de las transacciones
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        /*300*/
        /*----------------------------------------------------*/
        
        // Simulación de firma de las transacciones
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        /*400*/
        /*----------------------------------------------------*/
        
        // Simulación de firma de las transacciones
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        /*500*/
        /*----------------------------------------------------*/
        
        
        /*otros 500*/
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        /*100*/
        /*----------------------------------------------------*/
        
        // Simulación de firma de las transacciones
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        /*200*/
        /*----------------------------------------------------*/
        
       
        // Simulación de firma de las transacciones
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        /*300*/
        /*----------------------------------------------------*/
        
        // Simulación de firma de las transacciones
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        /*400*/
        /*----------------------------------------------------*/
        
        // Simulación de firma de las transacciones
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
       
        
        transacciones.get(0).agregarFirma();
        transacciones.get(0).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        transacciones.get(1).agregarFirma();
        /*500*/
        /*----------------------------------------------------*/
        /*
         *						
        	1. Valor máximo por bloque: La suma de los valores de las transacciones en un
        	bloque no debe superar 100 satoshis.
        	2. Máximo de transacciones por bloque: Un bloque puede contener como
        	máximo 3 transacciones.
        	3. Prueba de trabajo: La suma de los valores de las transacciones en un bloque
        	debe ser divisible por 10.
         	4. Tamaño máximo de bloque: El tamaño de cada bloque sigue siendo de 1 MB.*/

        
     // Configurar los parámetros del algoritmo
        int maxTamanioBloque = 1000;//1000 KB repesentan 1MB
        int maxValorBloque = 100;//satoshis (moneda opccional)
        int maxTransacciones = 2;
        int maxBloques = 3;//
        
        // Crear una instancia del algoritmo
        AlgoritmoDeBlockchainImp algoritmo = new AlgoritmoDeBlockchainImp();
        

        // Medir el tiempo de ejecución
        Instant start = Instant.now();
        List<List<Bloque>> blockchain = algoritmo.construirBlockchain(transacciones, maxTamanioBloque, maxValorBloque, maxTransacciones, maxBloques);
        Instant end = Instant.now();
        
        
        
        // Imprimir los bloques generados
        System.out.println("Blockchain generada:");
        
        for(int i = 0; i < blockchain.size(); i++) {
        	List<Bloque> bloques = blockchain.get(i);
        	
        	for(int j = 0; j < bloques.size(); j++) {
        		Bloque bloque = bloques.get(j);
        		System.out.print("Bloque: " + (i + 1) + ": ");
        		
        		//la impresion de las transacciones del bloque
        		List<Transaccion> transaccionesBloque = bloque.getTransacciones();
        		
        		for(int k = 0; k < transaccionesBloque.size(); k++ ) {
        			System.out.print("T" + (k + 1));
        			
        			if(k < transaccionesBloque.size() - 1) {
        				System.out.print(";");
        			}
        		}
        		
        		
        		//imprimir los detalles adicionales del bloque
        		System.out.println("(tamaño:" + bloque.getTamanioTotal() + " KB , suma de valores: " + bloque.getValorTotal() + " satoshis, " + transaccionesBloque.size() + " transacciones, prueba de trabajo valida)");
        	}
        }
		
		
        // Calcular y mostrar el tiempo de ejecución
        long durationMillis = Duration.between(start, end).toMillis();
        System.out.println("Tiempo de ejecución aproximado: " + durationMillis + " milisegundos");

	}

}
