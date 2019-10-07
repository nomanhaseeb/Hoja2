import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 100;
		//Hacemos con la estructura while
		
		while(num1<=num2) {
			if(num1 % 2 == 0) {
				System.out.println(num1);
			}
			num1 = num1 + 1; //en este caso hemos puesto el contador a num1
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
