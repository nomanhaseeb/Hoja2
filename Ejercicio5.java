import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 100, contadorimpar = 0;
		
		while(num1<=num2) {
			if (num1 % 2 != 0) {
				System.out.println(num1);
				contadorimpar = contadorimpar + 1; //contador que contara numeros impares que hay entre 0 a 100
				
			}
			num1 = num1 + 1;// icrementara el valor y comprobara con la condicion
			
		}
		System.out.println("Los numeros impares son "+contadorimpar);
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
