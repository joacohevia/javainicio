/*Escribir un programa que mientras que el usuario ingrese un
carácter dígito o carácter letra minúscula, imprima si es carácter
dígito o carácter letra minúscula, y si es letra minúscula imprimir si
es vocal o consonante.
-usuario ingrese digito o letra minuscula
-imprimir que es de las anteriores
-si es minuscula es vocal o consonante?

*/
import java.util.Scanner;

public class tp_2_4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        char carat=0;//declarado para que no tome basura
        while (carat != '*'){//para termiar el prog pulse *
            try {
                System.out.println("Ingrese caracter (ingrese * para salir)");
                carat = scanner.next().charAt(0);
                if ((carat>='0') && (carat<='9')) {
                    System.out.println("El caracter "+carat+" es un digito");    
                }
                else if ((carat>='a') && (carat<='z')){
                    switch (carat) {
                        case 'a':System.out.println("El caracter "+carat+" es una vocal");break;
                        case 'e':System.out.println("El caracter "+carat+" es una vocal");break;
                        case 'i':System.out.println("El caracter "+carat+" es una vocal");break;
                        case 'o':System.out.println("El caracter "+carat+" es una vocal");break;
                        case 'u':System.out.println("El caracter "+carat+" es una vocal");break;
                        default:System.out.println("El caracter "+carat+" es una consonante");break;
                    }
                }

            } catch (Exception exc) {
                System.out.println(exc);
            }
        }


    }       
}       