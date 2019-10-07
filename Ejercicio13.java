
public class Ejercicio13 {

	public static void main(String[] args) {
		// Imprimir y contar los números que son múltiplos de 2 o de 3 que hay entre 1 y 100.
		int contador = 1, num2 = 100, M3 = 0, M2=0;
		
		while (contador <=100) {    // IMPRIMIR NUMERO DE 0 A 100
			if (contador % 2 == 0) { // PONEMOS UN IF PARA CALCULAR DIVISIBLES DE 2 Y MOSTRAR LOS
				System.out.println("divisible de 2 " + contador);
				M2 = M2 + 1;
			}
			else if (contador % 3 == 0){ // PONEMOS DENTRO DE MISMO WHILE UNA CONDICION PARA CONTADOR MULTIPLOS DE 3 DE 1 A 100
				System.out.println("divisible de 3 " + contador);
				M3 = M3 + 1;
			}
			contador = contador + 1; // contador para que suma en cada vuelta
		}
		System.out.println("Los multiplos de 2 entre la secuencia de 1 a 100 son " + M2);
		System.out.println("Los multiplos de 3 entre la secuencia de 1 a 100 son " + M3);

	}

}
