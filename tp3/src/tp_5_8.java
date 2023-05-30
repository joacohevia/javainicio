/*Implementar un método que realice un corrimiento a izquierda en
un arreglo ordenado de tamaño MAX=10 a partir de una posición. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class tp_5_8 {

	public static void main(String[] args) {
		final int MAX = 10;
		int[] arreglo = new int[MAX];
		cargar(arreglo, MAX);
		correr(arreglo,MAX);
		imprimir(arreglo,MAX);
	}
	public static void cargar(int[] a, int MAX) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			for (int pos = 0; pos < MAX;pos++) {
				System.out.println("Ingrese un numero para la posicion "+pos+ " :");
				int n = Integer.valueOf(input.readLine());
				a[pos] = n;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void correr(int[] arreglo, int MAX) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese la posicion donde quiere insertar un numero:");
			int n = Integer.valueOf(input.readLine());
			for(int pos = n;pos < MAX-1 ;pos++) {
				arreglo[pos] = arreglo[pos+1];
			}//max-1 comienza desde cero, >= hasta la posicion n, pos --
			//para q sea hacia la izquierda
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void imprimir(int[] l,int MAX) {
		for (int i = 0;i < MAX;i++){
			System.out.println("El elemento de la posicion "+i+" es: "+l[i]);
		}
	}
}
