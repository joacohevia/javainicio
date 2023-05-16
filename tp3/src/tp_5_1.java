/*Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado.
1_Arreglo de 15 casilleros que debe cargar el usuario
2_valores entre 1 y 12 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tp_5_1 {
    public static void main(String []args){
        final int MAXelement= 15;
        int numero=0;
        int [] arrNumber = new int [MAXelement];
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            for(int pos = 0; pos <MAXelement; pos ++){
                System.out.println("Ingrese numero entre 1 y 12: "+pos+ ":" );//El +pos+ me marca que casillero va
                numero = Integer.valueOf(entrada.readLine());//guardo lo q ingresa el usuario en una var 
                while(numero<1 || numero>12){
                System.out.println("Numero incorrecto, ingrese otro");
                numero= Integer.valueOf(entrada.readLine());
                }
                arrNumber[pos]=numero;/*arrNumber es el nombre del arreglo.
                [pos] es la posición del arreglo que se está asignando.
                numero, es el valor que se está asignando a la posición [pos] del arreglo. */
            }
            for (int pos = 0; pos < MAXelement; pos++){
                System.out.println("arrNumber["+pos+"]"+arrNumber[pos]);//Este ultimo for es para mostrar como queda
            }
        
        } 
        catch (Exception e) {
            // TODO: handle exception
        }
    }
}
