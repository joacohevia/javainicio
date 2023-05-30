import java.io.InputStreamReader;
import java.io.BufferedReader;

public class tp_5_5 {
	public static void main(String[] args) {
		final int MAX = 10;
		int[] arreglo = new int[MAX];
		cargar(arreglo,MAX);
		invertir(arreglo,MAX);
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
	public static void invertir(int[] arreglo,int MAX) {
		int ult = MAX -1;
		int aux;
		for (int ini = 0;ini < MAX/2;ini++) {
			aux = arreglo[ini];
			arreglo[ini]= arreglo[ult];
			arreglo[ult]=aux;
			ult--;
		}
	}
	public static void imprimir(int[] l,int MAX) {
		for (int i = 0;i < MAX;i++){
			System.out.println("El elemento de la posicion "+i+" es: "+l[i]);
		}
	}
}
