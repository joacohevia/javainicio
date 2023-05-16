/*Escribir un programa que mientras el usuario cargue desde
teclado un número entero distinto de 0, imprima por pantalla la
suma que se obtiene de invocar un método que calcula la
sumatoria de los primeros 200 números naturales (son números
enteros entre 1 y 200).
1_obtener numero entero mayor a cero
2_Si lo obtengo invoco un metodo
3_ */
import java.util.Scanner;

public class tp_3_7 {
    public static void main(String []args){ 
        try (Scanner input = new Scanner(System.in)) { 
            int entero=0;
            System.out.println("Ingrese numero entero");
            entero = input.nextInt();
            if (entero > 0){
                MetSumar();
            }
            else {
                System.out.println("Numero invalido");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }        
    }
    public static void MetSumar(){
        for (int i=1; i <200; i++){
            System.out.println(1+i);
        }
    }

}
