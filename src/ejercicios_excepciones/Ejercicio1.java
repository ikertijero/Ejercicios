package ejercicios_excepciones;

/**
 * Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego calcule “a/b”. 
 * Pruebe a introducir b=0 y ver que hace el programa con la división por cero. 
 * Pruebe a introducir b=”Carlos” para ver cómo se comporta el programa. 
 * Añada excepciones para recoger estas excepciones y avisar del problema al usuario.
 *
 * @author Iker Tijero
 * 
 */

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int a;
		int b;
		int resultado;

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Introduce el primer valor:");
			a = Integer.parseInt(sc.nextLine());

			System.out.println("Introduce el segundo valor:");
			b = Integer.parseInt(sc.nextLine());

			resultado = a / b;

			System.out.println("Resultado: " + resultado);

		} catch (NumberFormatException e) {

			System.out.println("No has introducido 2 numeros");

		} catch (ArithmeticException e) {

			System.out.println("No se puede dividir por 0");

		} catch (Exception e) {

			System.out.println("Hemos tenido un problema");

		} finally {

			sc.close();

		}

	}

}
