import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Imprimir numeros en orden decrecientes
		int num1 = 100;
		int num2 = 0; //actuara como un contador en while
		while (num2<=num1) { // num2 tiene 0 y 0 es menor que 100
			System.out.println(num2);
			num2 = num2 + 1;
		}
		
	}
	public static int leeEntero(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(texto);
		int valor = teclado.nextInt();
		return valor;
	}
	public static float leeReal(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(texto);
		float valor = teclado.nextFloat();
		return valor;
	}
	public static String leeCadena(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(texto);
		String valor = teclado.nextLine();
		return valor;
	}
}


