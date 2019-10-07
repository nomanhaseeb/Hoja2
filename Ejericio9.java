import java.util.Scanner;

public class Ejericio9 {

	public static void main(String[] args) {
	int num1;
	// num1 alli guardamos en valor por la funcion
	num1 = leeEntero("Introduzca el numero para comprobar si es negativo o positivo");
	if (num1>=0) {
		System.out.println("El numero " + num1 + " es positvo" );		
	}
	else if(num1<0) {
		System.out.println("El numero " +  num1 + " es un numero positvo ");
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
