/*9_Escribir un programa que mientras el usuario ingrese un número
entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
ingresado imprima:
a. “letra minúscula” si el carácter es una letra del abecedario en
minúscula;
b. “letra mayúscula” si el carácter es una letra del abecedario
en mayúscula;
c. “dígito” si el caracter corresponde a un número;
d. “otro” para los restantes casos de caracteres.
1-Obtener numero entre 1 y 10 si es asi pedir un caracter sino error
2-Por cada caracter "letra minuscula" si esta en minuscula "letra mayuscula"si esta en mayuscula
3-"digito"si es un numero
4-"otro"para los restantes
while (num>=1, num<=10)si es correcto ingresa caracter.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tp_3_9 {
    public static void main(String []args){
        int numero=0;
        char letra= ' ';
        obtenerUsuario(numero,letra);
        
    }

        public static void obtenerUsuario(int numero, char letra){
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            try {  
              while(numero < 1 || numero > 10) {
                    System.out.println("Ingrese numero");
                    numero = Integer.valueOf(entrada.readLine());
                    System.out.println("Ingrese caracter");
                    letra = entrada.readLine().charAt(0);
                    
                }
            } catch (Exception e) {
                System.out.println("error"+ e);
            } 
            LetraObtenida(letra);
        }
    
        public static void LetraObtenida(char letra){
        if ((letra >='a') && (letra <='z')){
            System.out.println("Es una letra minuscula");
            }
        else if ((letra >= 'A') && (letra <= 'Z')){
            System.out.println("Es una letra mayuscula");
            }
        else if ((letra >= '0') && (letra <= '9')){
                System.out.println("Es un digito");
            }
        else {
            System.out.println("Es especial");
        }    
        
       
        }        
}


