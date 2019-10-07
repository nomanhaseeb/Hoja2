import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int suma = 0, num1 = 0;
		while (num1<=100) {
			suma = suma + num1; // sumando
			num1 = num1 + 1; //contador
			
		}
		System.out.println("la suma de todos los numeros de 0 a 100 es " + suma);

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
