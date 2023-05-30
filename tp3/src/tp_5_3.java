/*Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también.
Crear elemento de caracteres al azar de 10 elementos.
Buscar un elemento especifico y mostrar las posiciones y si no esta cargado tambien*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class tp_5_3 {
    public static final char MAX=10;
    public static char[]arrCaracter = new char[MAX];
    
    public static void main(String []args){
        carga_de_arr(arrCaracter, MAX);
        char carac= ' ';
        carac=pedir_elemento(carac);//el return de la funcion es carac por eso se transforma
        buscador_de_elemento(arrCaracter,carac);
        
    }
    
    public static void carga_de_arr(char[]arrCaracter, char MAX){
        Random r = new Random();
        for(int pos=0; pos < MAX; pos++){
            arrCaracter[pos]=(char) (r.nextInt(26)+ 'a');
            System.out.println(arrCaracter[pos]+ " :"+pos);//muestra el arr con la posicion del casillero
        }
        }
    public static char pedir_elemento(char carac){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese elemento que desee buscar");
            carac=entrada.readLine().charAt(0);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return carac;
    }    

    public static void buscador_de_elemento(char[]arrCaracter,char carac){
        int num=0;
        for(int pos=0;pos<MAX;pos++){
            if(arrCaracter[pos]==carac){
                System.out.println("El elmento se encuentra: "+pos);
                num=1;//si se encuentra el elemento num es 1 y sino es 0 lo cual
                //hace que se ejecute el if==0
            }
        }
        if(num==0){
            System.out.println("No se encontro elemento");
        }
    }    
    }


