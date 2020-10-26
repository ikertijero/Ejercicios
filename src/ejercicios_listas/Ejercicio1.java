package ejercicios_listas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear una lista de nombres de alumnos, donde se guardaran con strings.
 * Insertar diez nombres de alumnos en la lista Mostrar los diez nombres
 * recorriendo la lista con un foreach
 *
 * 
 * @author Iker tijero
 *
 */

public class Ejercicio1 {

	public static ArrayList<String> lstAlumnos = new ArrayList<String>();;

	public static void main(String[] args) {

		cargarListaAlumnos();

		visualizarListaAlumnos();

	}

	private static void visualizarListaAlumnos() {

		System.out.println("---------------Alumnos---------------");
		for (String alumnos : lstAlumnos) {

			System.out.println(alumnos);
		}

	}

	private static void cargarListaAlumnos() {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("Intriduce el nombre del alumno Nº" + i + 1);
			lstAlumnos.add(sc.nextLine());
		}
		sc.close();

	}

}
