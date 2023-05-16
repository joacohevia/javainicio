/*Escribir un programa que mientras que el usuario ingrese un
número entero distinto de 0, pida ingresar otro número entero y lo
imprima.*/
import java.util.Scanner;

public class tp_2_3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int numero = 1;
        while (numero != 0){
        System.out.println("Ingrese numero distinto de cero");
        numero = input.nextInt();
        System.out.println("El numero ingresado es: " + numero);
        }
        System.out.println("El programa ha finalizado.");


    }
    
}
