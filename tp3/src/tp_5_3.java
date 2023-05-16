/*Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también.
Crear elemento de caracteres al azar de 10 elementos.
Buscar un elemento especifico y mostrar las posiciones y si no esta cargado tambien*/

import java.util.Random;

public class tp_5_3 {
    public static final char MAX=10;
    public static char[]arrCaracter = new char[MAX];
    public static void main(String []args){
        carga_de_arr(arrCaracter);
        buscador_de_elemento();
    }
    public static void carga_de_arr(char[]arrCaracter){
        Random r = new Random();
        for(int pos=0; pos < MAX; pos++){
            arrCaracter[pos]=(char) (r.nextInt(26)+ 'a');
            System.out.println(arrCaracter[pos]+ " :"+pos);//muestra el arr con la posicion del casillero
        }
        }
    public static void buscador_de_elemento(){
        char carac=' ';
        for(int pos=0; pos < MAX; pos++){
            switch(carac){
                case 'a':System.out.println("abc");break;
                case 'b':System.out.println("abc");break;
                case 'c':System.out.println("abc");break;
            }
        }
    }    
    }


