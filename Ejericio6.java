import java.util.Scanner;
public class Ejericio6 {

	public static void main(String[] args) {
		//esta programma imprime en orden creciente
		//definimos las variables
		
		int a , b; // la a sera 0 sera la unidad y en el b el usuario lo va teclear.
		
		//Creamos objeto scanner
		Scanner teclado = new Scanner(System.in);
		// Instalamos el scanner en la variable b
		System.out.println("Introduzca el 1 numero");
		a = teclado.nextInt();
		// Instalamos el scanner en la varible b
		System.out.println("Introduzca el 2 numero");
		b = teclado.nextInt();
		// estrcutura if 
		if (a<b) { // si cumple esto ejectara el while y sino pasar a menor b
			while(a<=b) { // ejecutara el while
				System.out.println(a);
				a = a + 1;// contador para sumar
			}
		}
		else if (b<a) {
			while(b<=a) {
				System.out.println(b);
				b = b + 1; 
			}
		}
			else 
				System.out.println("Los numeros son iguales");
				
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


