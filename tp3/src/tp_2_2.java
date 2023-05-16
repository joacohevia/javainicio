/*Escribir un programa que mientras el usuario ingresa un caracter
distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
si es carácter vocal minúscula.*/

import java.util.Scanner;
public class tp_2_2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        char letra = ' ';
        
        while (letra != '*')
            try {
                System.out.println("Ingrese caracter (0 para salir): ");
                letra = scanner.next().charAt(0);
                if (Character.isDigit(letra)) //sirve para marcar que digito corresponde a casa letra 
                {
                    System.out.println("Es un digito" );
                }
                else if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                 System.out.println("Es una vocal minuscula");   
                }






            } catch (Exception e) {
                // TODO: handle exception
            }

    }
}
