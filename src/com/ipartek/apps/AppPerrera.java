package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Perro;

public class AppPerrera {

	// Constantes

	final static String OPCION_1 = "1";
	final static String OPCION_2 = "2";
	final static String OPCION_3 = "3";
	final static String OPCION_4 = "4";
	final static String SALIR = "s";

	// variables globales para esta Clase
	static Scanner sc = null;
	static ArrayList<Perro> lista = new ArrayList<Perro>();
	static String opcion = ""; // opcion seleccionada en el menu por el usuario

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		incializarDatos();

		do {

			System.out.println("***********  APP  PERRERA   **************");

			pintarMenu();

			switch (opcion) {
			case OPCION_1:

				listar();

				break;
			case OPCION_2:

				crearPerro();

				break;

			case OPCION_3:

				darDeBaja();
				break;

			default:
				break;
			}

		} while (!SALIR.equalsIgnoreCase(opcion));

		sc.close();

		System.out.println("***********  ADIOS, nos vemos pronto   **************");

	}// main

	private static void darDeBaja() {

		System.out.println("Nombre del perro que quieres borrar:");
		String nombre = sc.nextLine();

		for (Perro perro : lista) {

			String nomPerro = perro.getNombre();

			if (nomPerro.equalsIgnoreCase(nombre)) {

				lista.remove(perro);
				break;
			}

		} // fin for

	}

	private static void crearPerro() {

		System.out.println("Nombre del perro:");
		String nombre = sc.nextLine();

		System.out.println("Raza del perro:");
		String raza = sc.nextLine();

		System.out.println("Peso del perro:");
		double peso = Double.parseDouble(sc.nextLine());

		Perro p = new Perro();
		p.setNombre(nombre);
		p.setRaza(raza);
		p.setPeso(peso);

		lista.add(p);

	}

	private static void listar() {

		for (Perro perro : lista) {
			// formato para mostrar solo nombre y raza
			System.out.println(String.format("%s [%s] %sKg", perro.getNombre(), perro.getRaza(), perro.getPeso()));
		}

	}

	/**
	 * Inicializar el ArrayList para simular que existen perros.<br>
	 * En un futuro nos conectaremos a una bbdd
	 */
	private static void incializarDatos() {

		lista.add(new Perro("Bubba"));
		lista.add(new Perro("Laika"));
		lista.add(new Perro("Rintintin"));
		lista.add(new Perro("goffy"));

	}

	/**
	 * Se encraga de pintar las pociones del menu.<br>
	 * Fijaros que no aparece {@code @return} porque no retorna nada {@code void}
	 * 
	 */
	private static void pintarMenu() {

		System.out.println("************************************");
		System.out.println(OPCION_1 + ".- Listar todos los perros");
		System.out.println(OPCION_2 + ".- Crear un perro");
		System.out.println(OPCION_3 + ".- Dar de baja un Perro");
		System.out.println(" etc etc ...");
		System.out.println(" ");
		System.out.println(SALIR + " - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");
		try {
			
			opcion = sc.nextLine();
			
		}catch()
		

	}

}// AppPerrera
