//Importación de librerias
import java.util.Scanner;

public class PROG1_2022_ACT1_COPA_NICOLE {
    public static void main(String[] args) throws Exception {
/*
------------------------------------------------------------------------------------------------
                                            DESCRIPCIÓN
------------------------------------------------------------------------------------------------
FECHA: 19/04/2022
Asignatura: Programación 1
Alumna: Nicole Copa
Descripción: Programa de hoteleria para empleados (conserjes), con el fin de llevar a cabo un 
registro de habitacionesvendidas, ganancias, etc.
Profesor: Diego Krauthamer
------------------------------------------------------------------------------------------------

------------------------------------------------------------------------------------------------
                                            ANALISIS
------------------------------------------------------------------------------------------------
            ENTRADA                          PROCESO                         SALIDA
------------------------------------------------------------------------------------------------
            hab                              ganancia + 1                    ganancia
                                             cantHab + 1                     cantHab
                                             maximo = hab                    maximo
                                             minimo = hab                    minimo
------------------------------------------------------------------------------------------------
*/
        //Declaración de variables para MENU HOTEL
        int menu = 0;
        //Declaración de variables para HABITACIONES
        int hab = 0;
        //Declaración de variables para REPORTES
            //Contador para habitaciónes vendidas en total
        int cantHab = 0;
            //Acumulador para ganancia final
        int ganancia = 0;
            //Contador para habitación más vendida
        int hab1 = 0;
        int hab2 = 0;
        int hab3 = 0;
        int hab4 = 0;
        int hab5 = 0;
            //Maximo y minimo para habitación más cara vendida
        int maximo = 0;
        int minimo = 7;
        
        //Ingreso de While para proximamente dar por finalizado el MENÚ PRINCIPAL
        while (menu != 3){
            //Ingreso del MENU PRINCIPAL por pantalla, vemos las opciones a elegir
            System.out.println("--------------------------------------");
            System.out.println("            MENÚ HOTEL");
            System.out.println("--------------------------------------");
            System.out.println("1. Registrar una habitacion vendida.");          
            System.out.println("2. Reportes.");
            System.out.println("3. Salir.");
            System.out.println("");
            //Hacemos que el usuario haga una elección
            Scanner entrada = new Scanner(System.in);
            System.out.println("Elija una opción: ");
            menu = entrada.nextInt();
            System.out.println("");

            //Validación de caracteres en MENU PRINCIPAL
            while (menu < 1 || menu > 3){
                //Mostramos mensaje de error
                System.out.println("¡ERROR! Caracter/ Opción invalida - Vuelva a intentar: ");
                System.out.println("");
                //Repetimos opciones de MENU PRINCIPAL
                System.out.println("1. Registrar una habitacion vendida.");          
                System.out.println("2. Reportes.");
                System.out.println("3. Salir.");
                System.out.println("");
                //Hacemos que el usuario haga una elección nuevamente
                System.out.println("Elija una opción: ");
                menu = entrada.nextInt();
                System.out.println("");
            }
            
            //En caso de elegir la opción 1: Hacemos uso de la condicional para desplegar un menu de HABITACIONES
            if (menu == 1){
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
                //Hacemos que el usuario haga una elección
                System.out.println("Ingrese el tipo de habitación que desea registrar: ");
                hab = entrada.nextInt();
                System.out.println("");
                //Hacemos uso del contador para la cantidad de habitaciones vendidas
                cantHab = cantHab + 1;
                //Declaramos los máximos y mínimos
                if (maximo < hab){
                    maximo = hab;
                }
                if (minimo > hab){
                    minimo = hab;
                }
                //Validación de menu HABITACIONES
                while (hab < 1 || hab > 5){
                    //Mostramos mensaje de error
                    System.out.println("¡ERROR! Caracter/ Opción invalida - Vuelva a intentar: ");
                    System.out.println("");
                    //Repetimos opciones del menu de habitaciones
                    System.out.println("1 estrella: $1200");
                    System.out.println("2 estrellas: $1700");
                    System.out.println("3 estrellas: $2200");
                    System.out.println("4 estrellas: $2700");
                    System.out.println("5 estrellas: $3200");
                    System.out.println("");
                    //Hacemos que el usuario haga una elección nuevamente
                    System.out.println("Ingrese el tipo de habitación que desea registrar: ");
                    hab = entrada.nextInt();
                    System.out.println("");

                    //Hacemos uso del contador para la cantidad de habitaciones vendidas
                    cantHab = cantHab + 1;
                }
                //Usamos condicionales para saber que habitacion tuvo más ganancia
                if (hab == 1){
                    // Si la habitación elegida es "x", sumamos su precio correspondiente al acumulador "ganancia"
                    ganancia = ganancia + 1200;  
                    //Además de lo anterior, le sumamos "1" al contador de "habX" por cada habitación vendida y saber cuál es la más vendida
                    hab1 = hab1 + 1;           
                }else if (hab == 2){
                    ganancia = ganancia + 1700;
                    hab2 = hab2 + 1;
                }else if (hab == 3){
                    ganancia = ganancia + 2200;
                    hab3 = hab3 + 1;
                }else if (hab == 4){
                    ganancia = ganancia + 2700;
                    hab4 = hab4 + 1;
                }else{
                    ganancia = ganancia + 3200;
                    hab5 = hab5 + 1;
                }

            //En caso de elegir la opción 2: Declaramos segunda parte del MENU PRINCIPAL (REPORTE)
            }else if (menu == 2){
                //Mostramos por pantalla:
                System.out.println("***********************************************************************");
                //La ganancia total obtenida hasta el momento que se pide (se puede seguir acumulando)
                System.out.println("    Ganancia total: $" + ganancia);
                //La cantidad total de habitaciones vendidas hasta el momento que se pide (se puede seguir sumando)
                System.out.println("    Cantidad de habitaciones vendidas: " + cantHab);
                //Usamos acumuladores para ver cual es el tipo de habitación más vendida y la mostramos por pantalla
                if ((hab1 > hab2) && (hab1 > hab3) && (hab1 > hab4) && (hab1 > hab5)){
                    System.out.println("    Tipo de habitacion más vendida: 1 estrella");
                }else if ((hab2 > hab3) && (hab2 > hab4) && (hab2 > hab5)){
                    System.out.println("    Tipo de habitacion más vendida: 2 estrellas");
                }else if ((hab3 > hab4) && (hab3 > hab5)){
                    System.out.println("    Tipo de habitacion más vendida: 3 estrellas");
                }else if (hab4 > hab5){
                    System.out.println("    Tipo de habitacion más vendida: 4 estrellas");
                }else{
                    System.out.println("    Tipo de habitacion más vendida: 5 estrellas");
                }
                //la habitación vendida más COSTOSA y ECONOMICA
                System.out.println("    La habitación vendida más costosa es de:" + maximo + " estrellas.");
                System.out.println("    La habitación vendida más económica es de:" + minimo + " estrellas.");
                System.out.println("***********************************************************************");
                System.out.println("");
            }
        //Se repite el primer ciclo WHILE hasta que el usuario elija la opción "3. Salir"
        }
        //Finaliza el MENU HOTEL - El usuario seleccionó OPCIÓN 3 (SALIR). Mostramos mensaje de despedida
        System.out.println("- - - - - - - - - - - - - - - - - - - - ");
        System.out.println("                 ¡ADIÓS!");
        System.out.println("- - - - - - - - - - - - - - - - - - - - ");
    }
}

/*
----------------------------------------------------------------------------------------------------------------
                                            PRUEBA DE ESCRITORIO
----------------------------------------------------------------------------------------------------------------
    menu     hab     cantHab     ganancia     tipo1     tipo2     tipo3     tipo4     tipo5     mayor     menor
----------------------------------------------------------------------------------------------------------------
1
      0       0         0           0           0         0         0         0         0         0         0
      1       2         1           1700        0         1         0         0         0         2         2
      1       4         2           4400        0         1         0         1         0         4         2
      1       1         3           5600        1         1         0         1         0         4         1
      2       0         3           5600        1         1         0         1         0         4         1 
      1       2         4           7300        1         2         0         1         0         4         1
      3       0         0           0           0         0         0         0         0         0         0
----------------------------------------------------------------------------------------------------------------
*/