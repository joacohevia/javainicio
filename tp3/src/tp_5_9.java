/*Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, solicite al usuario un número entero y
lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada.
Arr cargado
solicitar numero
correr a la derecha
colocar numero en la pos 0*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class tp_5_9 {
    public static void main(String []args){
        final int MAX = 10;
        int [] arrEnteros = new int[MAX];
        arr_cargado(arrEnteros, MAX);
        mostrar_arreglo(arrEnteros);
        int numero =0;
        numero = solicitar_numero(numero);
        corrimiento_derecha(arrEnteros, MAX, numero);
        mostrar_arreglo_completo(arrEnteros);
        
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
            System.out.println("Ingrese numero para la pos 0");
            numero = Integer.valueOf(input.readLine());
        } catch (Exception e) {
            // TODO: handle exception
        }
       return numero;
    }

    public static void corrimiento_derecha(int []arr_Enteros, int MAX, int numero) {
         for(int pos = MAX-1;pos > MAX;pos--) {
         arr_Enteros[pos] = arr_Enteros[pos-1];
         }
         arr_Enteros[0]=numero;    
        }
    
    public static void mostrar_arreglo_completo(int [] arrEnteros){
            for(int pos = 0; pos < arrEnteros.length; pos++){
                System.out.print(arrEnteros[pos] + " ");
            }
            System.out.println();
        }    
}
