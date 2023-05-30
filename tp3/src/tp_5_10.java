/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine la primera ocurrencia del número (un número
igual) en el arreglo (si existe). Para ello tendrá que buscar la
posición y si está, realizar un corrimiento a izquierda (queda una
copia de la última posición del arreglo en la anteúltima posición).
arr cargado
solicitar entero
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class tp_5_10 {
    public static void main(String []args){
        final int MAX = 10;
        int [] arrEnteros = new int[MAX];
        arr_cargado(arrEnteros, MAX);
        mostrar_arreglo(arrEnteros);
        int numero =0;
        numero = solicitar_numero(numero);
        numero_igual(arrEnteros,MAX,numero);
        eliminar_numero(arrEnteros,MAX, numero);
    }

    public static void arr_cargado(int[] arrEnteros, int MAX){ 
        Random r = new Random();//para cargar el arreglo de forma aleatoria
        for(int pos=0; pos < MAX; pos++){
            arrEnteros[pos]=(r.nextInt(MAX));
            
        }        
    }

    public static void mostrar_arreglo(int [] arrEnteros){
        for(int pos = 0; pos < arrEnteros.length; pos++){
            System.out.print(arrEnteros[pos] + " ");
        }
        System.out.println();
    }
    public static int solicitar_numero(int numero){
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese numero entero");
            numero = Integer.valueOf(input.readLine());
        } catch (Exception e) {
            // TODO: handle exception
        }
       return numero;
    }

    public static void numero_igual(int []arr_Enteros,int MAX, int numero){
        for(int pos=0;pos<MAX;pos++){
            if(arr_Enteros[pos]==numero){
                
            }
        }
        
    }
    
    public static void eliminar_numero(int []arr_Enteros,int MAX, int numero){
        for(int pos = numero;pos < MAX-1 ;pos--) {
            arr_Enteros[pos] = arr_Enteros[pos+1];
        }//max-1 comienza desde cero, < hasta la posicion n, pos --
        //para q sea hacia la izquierda
        for (int pos = 0;pos < MAX;pos++){
			System.out.println("El elemento de la posicion "+pos+" es: " + arr_Enteros[pos]);
		}
    }
}
