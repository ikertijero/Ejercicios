package ejercicios_estructuras_condicionales;

import java.util.Scanner;

/**
 * Realiza un programa que pida un numero por consola. En caso de que el numero
 * sea mayor que 50, o menor que 0, indicar que el numero introducido no es
 * valido
 * 
 * @author iker tijero
 *
 */

public class Ejercicio2 {

	static final int VALOR_MAX = 50;
	static final int VALOR_MIN = 0;

	public static void main(String[] args) {

		/*
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * // Como pedir un numero por consola
		 * 
		 * int num = Integer.parseInt(sc.nextLine());
		 * 
		 * if (num > 50 || num < 0) { System.out.println("numero no valido"); }
		 * 
		 * sc.close();
		 */

		Scanner sc = new Scanner(System.in);
		int num;
		int count = 0;

		do {

			System.out.println("Introduce un numero entre 0 y 50");
			num = Integer.parseInt(sc.nextLine());

			if (count == 3) {
				System.out.println("MAAAAAL");
			}

			count++;

		} while (num > VALOR_MAX || num < VALOR_MIN);

		System.out.println("numero correcto: " + num);
		sc.close();
	}

}
