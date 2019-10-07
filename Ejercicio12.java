import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		//Imprimir 1 al 100, suma de los pares y de todos los impares
		int a = 0, b =100, suma = 0, suma_impar=0, total = 0;
		 while(a<=b) {
			 System.out.println(a);
			 total = total + a;
			 if(a % 2 == 0) {
				suma = suma + a;
			 }
			 else if(a % 2 != 0) {
				 suma_impar = suma_impar + a;
			 }
			 a = a + 1 ;
		 }
		 System.out.println("La suma de los pares es  " + suma);
		 System.out.println("La suma de los impares es " + suma_impar);
		System.out.println("La suma total es " + total);

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