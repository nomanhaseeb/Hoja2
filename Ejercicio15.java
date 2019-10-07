import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		int num1 = leeEntero("Introduzca el  1º numero");
		int num2 = leeEntero("Introduzca el 2º numero");
		
		int suma = 0, contadorpar = 0; // utilizaremos en el ejercicio
		
		
		if (num1>num2) {
			while (num2<=num1) {
				System.out.println(num2);
				if (num2 % 2 == 0) { // if para par
					contadorpar = contadorpar + 1; //contara los pares en la secuencia
				}
				
				
				if(num2 % 2 !=0) { // if para impar
					suma = suma + num2;
				}
				num2 = num2 + 1;
			}
			} // cierre de if
		
		
		else if (num1<num2) {
			while (num1<=num2) {
				System.out.println(num1);
				if (num1 % 2 == 0) { // if para par
					contadorpar = contadorpar + 1; //contara los pares en la secuencia
				}
				
				
				if(num1 % 2 !=0) { // if para impar
					suma = suma + num1;
				}
				num1 = num1 + 1;
			}
			}
		
		
		
		System.out.println("los numeros pares en la secuencia son " + contadorpar);
		System.out.println("La suma de impares en la secuencia es " +suma);
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
