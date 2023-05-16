/*Escribir un programa que mientras el usuario ingrese un
caracter letra minúscula, acumule la cantidad de vocales que
ingresó. Finalmente muestre por pantalla dicha cantidad.
1ingrese carac letra minuscula
2acumule la cantidad de vocales que ingreso
3mostrar cantidad*/

import java.util.Scanner;

public class tp_2_6 {
    public static void main(String args[]){
        try (Scanner scanner = new Scanner(System.in)) {
            int suma = 0;
            char caracter = '0';
            while (caracter != '*'){
                
                    System.out.println("Ingrese letra minuscula, (* para finalizar)");
                    caracter = scanner.next().charAt(0);
                    if (caracter>='a' && caracter<='z'){
                        switch (caracter){
                            case 'a': case 'e':case 'i':case 'o':case 'u':
                            suma++; //se aumenta en 1 la variable 
                            break; 
                           default: 
                           break;
                           
                        }       
                    }
                    else {
                        System.out.println("El caracter no es valido");
                    }
                    System.out.println("La total de las vocales es: "+ suma);
            }

        }catch (Exception e) {
        System.out.println("Error" + e); }
            
    }
}
            
        
        

