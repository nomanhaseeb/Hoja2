import java.util.Scanner;
public class Ejericio7 {

	public static void main(String[] args) {
		// Intrdocuir un texto las veces que queramos
		int contador = 0;
		String frase = leeCadena("Por favor Introduzca el texto");
		
		while (frase.length()>0) {
			frase = leeCadena("Introduzca la frase");
			contador = contador + 1;
		}
		System.out.println("Frase tecleado  " + contador);
	}
	
	
	//fucniones
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
