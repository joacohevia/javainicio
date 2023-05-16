/*Cuando se pide un diseño es hacer el pseudocódigo. En todos los
casos resolver haciendo uso del diseño descendente.
1. Escribir un diseño de programa que mientras que el usuario
ingrese un número distinto de 0, pida ingresar otro número y lo
imprima.
1_ingrese num distinto de cero
2_pueda ingresar otro y lo imprima*/

import java.util.Scanner;

public class tp_3_1 {
    public static void main(String args[]){
        try (Scanner scanner = new Scanner(System.in)) {
            int numero=1;
            while(numero != 0){
                System.out.println("Ingrese numero (0 para salir)");
                numero = scanner.nextInt();
                System.out.println("El numero ingresado es: " + numero);
            }
        }
        System.out.println("El prog a finalizado");
    }
}

