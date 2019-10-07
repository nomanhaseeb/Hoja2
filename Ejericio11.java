import java.util.Scanner;

public class Ejericio11 {

	public static void main(String[] args) {
	int unidad = 0;
	
	int num1 = leeEntero("Por favor introduzca un numero");// guardamos el lee Entero en num1
	
	while(unidad<=num1) {
		if(num1 % 2 !=0) {
			System.out.println(unidad);
		}
		unidad = unidad + 1;
	}
	System.out.println("Los numeros impares en total son" + unidad);
	
	
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
