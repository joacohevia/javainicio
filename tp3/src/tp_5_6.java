import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tp_5_6 {
	
	public static void main(String[] args) {
		final int MAX = 10;
		int[] arreglo = new int[MAX];
		cargar(arreglo, MAX);
		int cant = cantidad_pares(arreglo,MAX);
		System.out.println("La cantidad de pares es: "+cant);
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
	public static int cantidad_pares(int[] arreglo,int MAX) {
		int cant = 0;
		for (int pos = 0; pos < MAX; pos++) {
			if (arreglo[pos] % 2 == 0) {
				cant++;
			}
		}
		return cant;
	}
	public static void imprimir(int[] l,int MAX) {
		for (int i = 0;i < MAX;i++){
			System.out.println("El elemento de la posicion "+i+" es: "+l[i]);
		}
	}
}
