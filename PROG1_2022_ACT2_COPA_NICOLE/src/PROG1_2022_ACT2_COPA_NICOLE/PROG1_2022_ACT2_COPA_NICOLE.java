package PROG1_2022_ACT2_COPA_NICOLE;

import java.util.Scanner;

public class PROG1_2022_ACT2_COPA_NICOLE{    
    // ************ I N I C I O  P R O G R A M A  P R I N C I P A L ************
    public static void main(String[] args) {
        inicio();
    }
    // *************** F I N  P R O G R A M A  P R I N C I P A L ***************

    /******************************* M O D U L O S /*******************************/
    /* ------------------------------- I N I C I O -------------------------------
        Descripción: Funcionamiento y contenedor del programa principal con 
        lógica aplicada
	    Tipo: Procedimiento
	    Párametros de entrada: ninguno
	    Páramentros de salida: ninguno
       ----------------------------------------------------------------------------*/
    public static void inicio(){
        //Declaración de variables
        int menu = 0;
        //Delcaramos las variables de los parametros
        int pHabitacion = 0, pcantHabitaciones = 0, pminimo = 7, pmaximo = 0, pganancia = 0;
        //Usamos un condicional para las diferentes opciones del menu
        while (menu != 3){
            menu(); //Llamo al procedimiento menu
            menu = elegir_menu(); //Llamo a la función elegir_menu;
            //Sigo con el flujo en caso de elegir opcion 1 o 2
            if(menu == 1){
                opciones_hab();
                pHabitacion = elegir_hab();
            }
            if(menu == 2){
                pganancia = ganancia(pHabitacion);
                pcantHabitaciones = cantidad_hab(pHabitacion);
                pmaximo = maximo(pHabitacion);
                pminimo = minimo(pHabitacion);
                reporte(pganancia, pcantHabitaciones, pminimo, pmaximo, pHabitacion);
            }
        }
        //Mostramos mensaje de despedida
        System.out.println(" -------------- A D I O S -------------- ");
    }
    /* --------------------------------- M E N U ---------------------------------
        Descripción: Muestra en pantalla un menu de opciones principal
	    Tipo: Procedimiento
	    Párametros de entrada: ninguno
	    Páramentros de salida: ninguno
       ----------------------------------------------------------------------------*/
    
    public static void menu(){
        //Ingreso del MENU PRINCIPAL por pantalla, vemos las opciones a elegir
            System.out.println("--------------------------------------");
            System.out.println("            MENÚ HOTEL");
            System.out.println("--------------------------------------");
            System.out.println("1. Registrar una habitacion vendida.");          
            System.out.println("2. Reportes.");
            System.out.println("3. Salir.");
            System.out.println("");
    }
    /* ----------------------- I N G R E S A R  O P C I O N -----------------------
        Descripción: Permite al usuario la eleccion de la opcion del menu
	    Tipo: Procedimiento
	    Párametros de entrada: ninguno
	    Páramentros de salida: pMenu
       ----------------------------------------------------------------------------*/
    public static int elegir_menu(){
        //Declaración de objetos
        Scanner entrada = new Scanner(System.in);
        //Declaración de variables locales
        int pMenu = 0;
        //El usuario hace una elección y validamos
        System.out.println("Elija una opción: ");
        pMenu = entrada.nextInt();
        while (pMenu < 1 || pMenu > 3){
            System.out.println("¡ERROR! Caracter/ Opción invalida - Vuelva a intentar: ");//Mostramos mensaje de error
            System.out.println("Elija una opción: ");
            pMenu = entrada.nextInt();
        }
        //Devuelvo un parámetro
        return pMenu;
    }
    /* -------------------------- H A B I T A C I O N E S -------------------------
        Descripción: Muestra en pantalla un menu para la eleccion de habitaciones
	Tipo: Procedimiento
	Párametros de entrada: ninguno
	Páramentros de salida: ninguno
       ----------------------------------------------------------------------------*/
    public static void opciones_hab(){
        //Mostramos menu de HABITACIONES con los precios por estrellas.
        System.out.println("--------------------------------------");
        System.out.println("            HABITACIONES");
        System.out.println("--------------------------------------");
        System.out.println("1 estrella: $1200");
        System.out.println("2 estrellas: $1700");
        System.out.println("3 estrellas: $2200");
        System.out.println("4 estrellas: $2700");
        System.out.println("5 estrellas: $3200");
        System.out.println("");
    }
    /* ----------------- O P C I O N E S  D E  H A B I T A C I O N ----------------
        Descripción: Permite al usuario la elección de una opción de habitacion
	    Tipo: Funcion
	    Párametros de entrada: ninguno
	    Páramentros de salida: pHabitacion
       ----------------------------------------------------------------------------*/
    public static int elegir_hab(){
        //Declaración de objetos
        Scanner entrada = new Scanner(System.in);
        //Declaración de variables locales
        int pHabitacion = 0;
        //Hacemos que el usuario haga una elección y validamos
        System.out.println("Ingrese el tipo de habitación que desea registrar: ");
        pHabitacion = entrada.nextInt();
        while (pHabitacion < 1 || pHabitacion > 5){
            System.out.println("¡ERROR! Caracter/ Opción invalida - Vuelva a intentar: "); //Mostramos mensaje de error
            System.out.println("Elija una opción: ");
            pHabitacion = entrada.nextInt();
        }
        //Devuelvo un parámetro
        return pHabitacion;
    }
    
    /* -------------- C A N T I D A D  D E  H A B I T A C I O N E S ---------------
        Descripción: Permite realizar un contador de las habitaciones vendidas
	    Tipo: Funcion
	    Párametros de entrada: pHabitacion
	    Páramentros de salida: pcantHabitaciones
       ----------------------------------------------------------------------------*/
    public static int cantidad_hab(int pHabitacion){
        //Contador para habitaciones vendidas en total

        int pcantHabitaciones = 0;   
        if (pHabitacion > 0){
            pcantHabitaciones = pcantHabitaciones + 1;
        }
        return pcantHabitaciones;
    }
    /* -------------------------------- M I N I M O --------------------------------
        Descripción: Permite realizar un condicional para saber cual es la habitación
        elegida con el precio más económico
	Tipo: Funcion
	Párametros de entrada: pHabitacion
	Páramentros de salida: pminimo
       ----------------------------------------------------------------------------*/
    public static int minimo(int pHabitacion){
        //Declaración de variables locales

        int pminimo = 7;
        //Declaramos el minimo de "habitaciones"
        if (pminimo > pHabitacion){
            pminimo = pHabitacion;
        }
        return pminimo;
    }
    /* -------------------------------- M A X I M O --------------------------------
        Descripción: Permite realizar un condicional para saber cual es la habitación
        elegida con el precio más costoso
	Tipo: Funcion
	Párametros de entrada: pHabitacion
	Páramentros de salida: pmaximo
       ----------------------------------------------------------------------------*/
    public static int maximo(int pHabitacion){
        //Declaración de variables locales

        int pmaximo = 0;
        //Declaramos maximos y minimos de habitaciones
        if (pmaximo < pHabitacion){
            pmaximo = pHabitacion;
        }
        return pmaximo;
    }
    /* -------------- D E T E R M I N A C I O N  D E  G A N A N C I A --------------
        Descripción: Permite realizar un acumulador con los precios de las
        habitaciones vendidas
	Tipo: Funcion
	Párametros de entrada: pHabitacion
	Páramentros de salida: pganancia
       ----------------------------------------------------------------------------*/
    public static int ganancia(int pHabitacion){
        //Declaración de variables locales
        int pganancia = 0; //Acumulador para ganancia finaL
        //Usamos condicionales para saber que habitacion tuvo más ganancia
        if (pHabitacion > 0 && pHabitacion < 2){
            pganancia = pganancia + 1200;  // Si la habitación elegida es "x", sumamos su precio correspondiente al acumulador "ganancia"
        }else if (pHabitacion == 2){
            pganancia = pganancia + 1700;
        }else if (pHabitacion == 3){
            pganancia = pganancia + 2200;
        }else if (pHabitacion == 4){
            pganancia = pganancia + 2700;
        }else{
            pganancia = pganancia + 3200;
        }
        return pganancia;
    }
    /* -------------------------------- M A X I M O --------------------------------
        Descripción: Muestra en pantalla un "reporte" de la ganancia total, la cantidad
        de habitaciones vendidas, la habitación mas economica y costosa
	Tipo: Procedimiento
	Párametros de entrada: pganancia, pcantHabitaciones, pminimo, pmaximo, pHabitacion 
	Páramentros de salida: ninguno
       ----------------------------------------------------------------------------*/
    public static void reporte(int pganancia, int pcantHabitaciones, int pmaximo, int pminimo, int pHabitacion){
        System.out.println("Ganancia total: " + pganancia);
        System.out.println("Cantidad de habitaciones vendidas: " + pcantHabitaciones);
        System.out.println("La habitación vendida más costosa es de:" + pmaximo + " estrellas.");
        System.out.println("La habitación vendida más económica es de:" + pminimo + " estrellas.");
    }
}