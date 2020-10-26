package ejercicio.practico1;

import java.util.Scanner;

/**
 * Realizar un programa en java que realice la siguiente función: Crear un array
 * de 5 notas que almacenara en formato double. Una vez creado dicho array se
 * rellenaran dichos elementos leyéndolo desde el teclado. Una vez creado el
 * contenido, se calculara la media de las notas así como se mostraran las notas
 * más altas y más bajas de dicho array.
 * 
 * 
 * @author Iker Tijero
 *
 */

public class EjercicioA {

	// Variables globales
	static Scanner sc = null;
	static double[] lstNotas = new double[5];

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		rellenaArrayNotas();

		System.out.println("---------------------------------");

		visualizarArrayNotas();

		System.out.println("---------------------------------");

		mediaNotas();

		System.out.println("---------------------------------");

		notaMaxMin();

	}

	// Metodo que visualiza la nota Maxima y Minima del array
	private static void notaMaxMin() {

		double max = 0;
		double min = 1000;

		for (int i = 0; i < lstNotas.length; i++) {

			if (max < lstNotas[i]) {

				max = lstNotas[i];

			}

			if (min > lstNotas[i]) {

				min = lstNotas[i];

			}

		} // fin for

		System.out.println("La nota maxima es " + max + " y la minima " + min);
	}

	// Metodo que calcula la media de las notas del array
	private static void mediaNotas() {

		double media;
		double suma = 0;

		for (int i = 0; i < lstNotas.length; i++) {

			suma += lstNotas[i];

		} // fin for

		media = suma / lstNotas.length;

		System.out.println("La media de las notas es: " + media);

	}

	// Metodo que visualiza las notas del array
	private static void visualizarArrayNotas() {

		System.out.println("Notas Alumno:");

		for (int i = 0; i < lstNotas.length; i++) {

			System.out.println((i + 1) + ".- " + lstNotas[i]);

		} // fin for

	}

	// Metodo que carga el array con 5 notas
	private static void rellenaArrayNotas() {

		System.out.println("Introduce las 5 notas:");

		for (int i = 0; i < lstNotas.length; i++) {

			System.out.println("Intriduce nota numero " + (i + 1));
			try {
				double nota = Double.parseDouble(sc.nextLine());
				lstNotas[i] = nota;

			} catch (NumberFormatException e) {

				System.out.println("Error, introduce un numero");
				i--;

			} catch (Exception e) {

				System.out.println("Valor incorrecto");
				i--;
			}

		} // fin for

	}

}
