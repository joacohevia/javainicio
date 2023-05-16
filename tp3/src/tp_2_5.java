/*Escribir un programa que mientras que el usuario ingrese un
número entero entre 1 y 10 inclusive, lleve la suma de los
números ingresados. Finalmente, cuando sale del ciclo muestre
por pantalla el resultado de la suma. ¿En qué casos termina?
1usuario debe ingresar un numero entero entre 1 y 10.
2lleve la suma de los numeros ingresados
3resultado de la suma, en q caso termina*/

import java.util.Scanner;

public class tp_2_5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int numero=0;
        int suma=0;
        while(numero !=-1){//para termiar el prog pulse -1   
        try {
            System.out.println("Ingrese numero del 1 al 10 (pulse -1 para salir)");
            numero = input.nextInt();
            if (numero>=1 && numero<=10){ 
            suma += numero;//la suma de ambos numeros ingresados
            }
            else {
                System.out.println("El numero no es valido");
            }
        
        System.out.println("La suma de los numeros es: "+ suma);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    }    
}
