/*Escriba una aplicación que pida al usuario que escriba dos números, que obtenga los números
del usuario e imprima la suma, producto, diferencia y cociente (división) de los números. Use 
las técnicas que se muestran en la figura 2.7. */
import java.util.Scanner; 

public class Ej15 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("-- A R I T M E T I C A --");
        int num1;
        int num2;
        int suma;
        int producto;
        int diferencia;
        int cociente;

        System.out.print("Ingrese el primer numero entero: ");
        num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        num2 = entrada.nextInt();

        suma = num1 + num2;
        producto = num1 * num2;
        diferencia = num1 % num2;
        cociente = num1 / num2;

        System.out.printf("La suma es %d%n", suma); 
        System.out.printf("La diferencia es %d%n", diferencia); 
        System.out.printf("El producto es %d%n", producto); 
        System.out.printf("El cociente es %d%n", cociente); 
    }
}