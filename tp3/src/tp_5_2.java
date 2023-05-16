/*Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola.
Primero declare como global el arreglo y el maximos de casilleros de dicho arreglo
luego en main hice dos metodos y una */

import java.util.Random;

public class tp_5_2 {
    public static final int MAX = 10;
    public static int [] arrEnteros = new int[MAX];
    public static void main(String []args){
        carga_de_arreglo(arrEnteros);
        mostrar_arreglo();
        calculo_promedio();
                  
    }
   

    public static void carga_de_arreglo(int[] arrEnteros){ 
        Random r = new Random();//para cargar el arreglo de forma aleatoria
        for(int pos=0; pos < MAX; pos++){
            arrEnteros[pos]=(r.nextInt(MAX));
            
        }        
    }
    public static void mostrar_arreglo(){
        for(int pos = 0; pos < arrEnteros.length; pos++){
            System.out.print(arrEnteros[pos] + " ");
        }
        System.out.println();
    }
    public static int calculo_promedio() {
        
        int suma = 0;//va acumulando la suma de los elementos
        for (int pos = 0; pos < MAX; pos++){//reocrre el arr
        suma+=arrEnteros[pos];//va acumulando la suma de los n del arr 
        }
        int promedio = suma/MAX;
        System.out.println("El promedio es: "+promedio);
        
        int contador=0;
        for(int pos=0;pos<MAX;pos++){
            if(arrEnteros[pos]>promedio){
                contador++;
            }
        }
        System.out.println("Resultado: "+contador);
        return promedio;
    }
}        /*Con el mismo arreglo del ejercicio anterior informe por pantalla
cuantos elementos del mismo están por encima del promedio
calculado.
Inicializar una variable contador en 0 para llevar la cuenta de los elementos por encima del promedio.
Recorrer el arreglo y, para cada elemento:
Comparar si el elemento es mayor que el promedio.
Si es mayor, incrementar el contador en 1.
Al finalizar el recorrido, imprimir el valor del contador, que representa la cantidad de elementos por encima del promedio. */  
   
