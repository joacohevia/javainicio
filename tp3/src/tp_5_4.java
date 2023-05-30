/*Hacer un programa que dado un arreglo de caracteres de tamaño
10 que se encuentra cargado, invierta el orden del contenido. Este
intercambio no se debe realizar de manera explícita, hay que
hacer un método que incluya una iteración de intercambio.
cargar arreglo desde el usuario de tamaño 10,invertit el orden del 
contenido */


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class tp_5_4 {
    public static final int MAX=10;
    public static char[]ArrCaracter = new char[MAX];
    public static void main(String []args){
        Cargar_arreglo(ArrCaracter,MAX);
        mostrar_arreglo(ArrCaracter);
    }

    public static void Cargar_arreglo(char[]ArrCaracter, int MAX){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            for(int pos=0; pos<ArrCaracter.length; pos++){
                System.out.println("Ingrese elementos del arr: "+(pos+1));//el ultimo pos muestra casillero
                ArrCaracter[pos]=entrada.readLine().charAt(0);
        
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    public static void mostrar_arreglo(char [] ArrCaracter){
        for(int pos =0; pos < ArrCaracter.length; pos++){ 
            System.out.println("El arreglo es: "+ArrCaracter[pos]+" :"+pos);
        }
        
    }
}
