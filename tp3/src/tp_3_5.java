/*Hacer un método que dado un número entero con valor inicial 1,
haga una iteración incrementando el número de a uno hasta un
valor MAX = 4 (constante). Mientras itera deberá imprimir el
número. Luego invocarlo desde el programa principal y cuando
termina imprimir por pantalla “terminó”.
1_Metodo sumando 1
2_Interacion incrementar hasta el max4 constante
3_Imprimir numero
4_Imprimir "termino" */


public class tp_3_5 {
    public static final int MIN= 1;//variables constantes y globales
    public static final int MAX= 4;
    public static void main(String args[]){
        System.out.println("Incrementando numero");
        incrementoDe1();
        System.out.println("terminó");

    }
    public static void incrementoDe1(){
        for (int i = MIN; i <= MAX; i++){
            System.out.println(i);
        }
    }
}
