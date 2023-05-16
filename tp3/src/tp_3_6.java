/*Escribir un programa que mientras el usuario cargue desde
teclado un carácter letra minúscula, llame a un método que
imprime por pantalla la tabla de multiplicar del 9.
1_obtener letra minuscula
2_chequear si es minuscula
3_metodo que imprima tabla del 9 */
import java.util.Scanner;
public class tp_3_6 {
    public static void main(String []args){
        try (Scanner scanner = new Scanner(System.in)) {
            char caracter='0';
                System.out.println("Ingrese letra minuscula");
                caracter = scanner.next().charAt(0);
                if (caracter>='a' && caracter<='z'){
                    System.out.println("Tabla de multiplicar del 9");
                    imprimirTabla9();
                }
                else {
                    System.out.println("Caracter no valido");
                }
        } catch (Exception e) { 
                // TODO: handle exception
            }
                
    }
    
        
       
    
    public static void imprimirTabla9(){ //tabla de multiplicar del nueve
        for (int i= 1; i <=10; i++) { 
            System.out.println(9*i);
        }
    } 
}         
  
