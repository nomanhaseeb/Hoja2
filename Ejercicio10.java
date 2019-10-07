import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Introducir un numero si es par o impar
		int numero;
		numero = leeEntero("comprobar si es un numero par o impar");
		
		if (numero % 2 == 0) {
			System.out.println("El numero tecleado es un numero par");
		}
		else if(numero % 2 != 0) {
			System.out.println("El numero tecleado es un numero impar");
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
