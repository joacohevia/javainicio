/* Escribir un programa que mientras el usuario ingrese un número
entero menor que 100 y mayor a 1, muestre por pantalla si el
número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
valores mencionados en el enunciado deberían ser constantes?.
De a poco habría que definirlos como constantes). */

import java.util.Scanner;

    public class tp_2 {
        public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            int numero = 0;

            while (numero <=1 || numero >=100) {
                System.out.println("Ingrese numero entre 1 y 100");
                numero = input.nextInt();
     
            }
            if (numero % 2 == 0 && numero % 3 ==0) {
                System.out.println("El numero es multiplo de 2 y 3");     
            }
            else {
                System.out.println("El numero no es multiplo");

            }
        }
    }
 
