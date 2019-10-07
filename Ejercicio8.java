import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// un programma que nos permita teclear solo S y N
		String s;
		s = leeCadena("Introduce una S o N mayúscula");
		
		if(s.equals("S")) {
			System.out.println("Has introducido  " + s);
		}
		else if(s.equals("N")) {
			System.out.println("Has introducido " +s);
		}
		else {
			System.out.println("La maquina no accepta otro alfabeto tiene que ser S o N");
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
