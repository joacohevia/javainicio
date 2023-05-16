/*Realizar un programa que dado dos números enteros y un
carácter, todos ingresados por el usuario, muestre por pantalla el
resultado de la operación matemática básica considerando el valor
del carácter. Si ingreso el carácter: ‘a’ la suma, ‘b’ la resta, ‘c’ la
multiplicación y ‘d’ la división entre ambos números.
1 Obtermer dos numeros enteros y un caracter(letra)
2 Si el caracter ingresado es a=+ b=- c=* d=/ 
3 Depende el caracter hace la operacion anterior*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tp_3_8{
     public static void main(String []args){
        int num1=0, num2=0;
        char carac=' ';
        try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un caracter");
            carac = entrada.readLine().charAt(0);
            System.out.println("Ingrese primer numero entero");
            num1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese segundo numero entero");
            num2 = Integer.valueOf(entrada.readLine());
            if((carac== 'a')||(carac== 'b')||(carac=='c')||(carac=='d')) {
                switch(carac){
                    case 'a': suma (num1,num2);break;
                    case 'b': resta (num1,num2);break;
                    case 'c': multiplicacion (num1,num2);break;
                    case 'd': division (num1,num2);break;
                    default : System.out.println("error.");
                }
            }
        }catch (Exception e) {
            System.out.println("Error "+e);
            } 
     }    
          
    public static int suma(int num1, int num2){//Siempre corchete
        int resultado=0;
        resultado = num1+num2;
        System.out.println("El resultado de la suma de "+ num1+ "y"+num2+ "es: "+resultado);
        return resultado;
    }
    public static int resta(int num1, int num2){
        int resultado=0;
        resultado = num1-num2;//La operacion
        System.out.println("El resultado de la resta entre "+num1+ "y"+num2+ " es: "+resultado);
        return resultado;
    }
    public static int multiplicacion(int num1, int num2){
        int resultado=0;
        resultado = num1*num2;//La operacion
        System.out.println("El resultado de la multiplicacion entre "+num1+ "y"+num2+ " es: "+resultado);
        return resultado;
    }
    public static int division(int num1, int num2){
        int resultado=0;
        resultado = num1/num2;//La operacion
        System.out.println("El resultado de la division entre "+num1+ "y"+num2+ " es: "+resultado);
        return resultado;    
    }    
    
}    







/*public static int obtenerNumeroValido(int numero1,int numero2){ 
        try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese primer numero entero");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese segundo numero entero");
            numero2 = Integer.valueOf(entrada.readLine());
              
            } catch (Exception e) {       
              System.out.println("Error "+ e);
              
            }   
                  
    }
        public static void ValoresObtenidos(int numero1, int numero2, char letra){
            if(letra=='a'){
                System.out.println("la suma de "+numero1+" y "+numero2+" es "+(numero1+numero2));    
            }
            if(letra=='b') {
                System.out.println("La resta de "+numero1+" y "+numero2+" es "+(numero1-numero2));
            }
            if(letra=='c'){
                System.out.println("La multiplicacion de "+numero1+" por "+numero2+" es "+(numero1*numero2));
            }
            if(letra=='d'){
                System.out.println("La division de "+numero1+" y "+numero2+" es "+(numero1/numero2));
            }
        }char letra= ' ';
    }    System.out.println("Ingrese un caracter");
                letra = entrada.readLine().charAt(0);

     switch (letra + numero1 + numero2){
                    case 'a':System.out.println("eeee");break;
                    case 'b':System.out.println("dddd");break;
                    case 'c':System.out.println("rrrr");break;
                    case 'd': System.out.println("gggg");break;}
                     int numero1=0;
               
            } catch (Exception e) {
                  System.out.println("Valor incorrecto "+ e);}
        }    
       
        */
 /*public static void obtenerOpcionValida(char carac){
        try {BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            char letra=' ';
            while (letra< 'a' || letra>'d'){ 
            System.out.println("Ingrese una letra entre A y D");
            letra = entrada.readLine().charAt(0);
            
            }
            
           
        } catch (Exception e) {
            System.out.println("Error " + e);
        
        }
        
    }*/
