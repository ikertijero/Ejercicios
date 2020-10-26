package com.ipartek.apps;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.modelo.PerroDAOArrayList;
import com.ipartek.pojo.Perro;

/**
 * App para de una perrera que contiene un menu con diferentes opcines.
 * <ul>
 * <li>Listar datos</li>
 * <li>Crear un Perro</li>
 * <li>Borrar Perro lista</li>
 * <li>Modifiar Perro lista</li>
 * </ul>
 * 
 * @author iker tijero
 * 
 */
public class AppPerrera {

	// Constantes primer menu

	final static String OPCION_1 = "1";
	final static String OPCION_2 = "2";
	final static String OPCION_3 = "3";
	final static String OPCION_4 = "4";
	final static String OPCION_5 = "5";
	final static String SALIR = "s";

	// Constantes menu modificar perro

	final static String NOMBRE = "1";
	final static String RAZA = "2";
	final static String PESO = "3";
	final static String HISTORIA = "4";
	final static String VACUNA = "5";
	final static String SALIR_MODIFICAR = "s";

	// variables globales para esta Clase

	static Scanner sc = null;
	static ArrayList<Perro> lista = new ArrayList<Perro>();
	static String opcion = ""; // opcion seleccionada en el menu por el usuario
	static String opcionModificar = "";
	static private PerroDAOArrayList modelo = new PerroDAOArrayList();

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		boolean salir = true;

		// Bucle que muestra un menu con diferentes opciones
		do {

			System.out.println("***********  APP  PERRERA   **************");

			pintarMenu();

			switch (opcion) {
			case OPCION_1:

				listar();

				break;
			case OPCION_2:

				try {
					crearPerro();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case OPCION_3:

				darDeBaja();
				break;

			case OPCION_4:

				modificarPerro();
				break;

			case OPCION_5:

				perroVacunados();
				break;

			case SALIR:

				salir = false;
				System.out.println("***********  ADIOS, nos vemos pronto   **************");
				break;

			default:

				System.out.println("La opcion seleccionada no existe o es erronea");

				break;
			}

		} while (salir);

		sc.close();

	}// main

	private static void perroVacunados() {

		for (Perro perro : lista) {

			if (perro.isVacunado()) {

				System.out.println(String.format("%s [%s] %sKg", perro.getNombre(), perro.getRaza(), perro.getPeso()));

			} else {
				// TODO controlar este else, que solo se muestre si no hay perros vacunados
				System.out.println("No hay perros vacunados");
				break;
			}

		}

	}

	// metodo que muestra un menu para modificar los datos de un Perro
	private static void modificarPerro() {

		System.out.println("Nombre del perro que quieres modificar:");
		String nombre = sc.nextLine();
		boolean salir = true;

		for (Perro perro : lista) {

			if (perro.getNombre().equalsIgnoreCase(nombre)) {

				do {

					menuModificar();

					switch (opcionModificar) {
					case NOMBRE:

						System.out.println("Introduce el nombre:");
						String nuevoNombre = sc.nextLine();
						perro.setNombre(nuevoNombre);

						break;

					case RAZA:

						System.out.println("Introduce la raza:");
						String nuevaRaza = sc.nextLine();
						perro.setRaza(nuevaRaza);

						break;

					case PESO:

						System.out.println("Introduce el nombre:");
						double nuevoPesoe = Double.parseDouble(sc.nextLine());
						perro.setPeso(nuevoPesoe);

						break;

					case HISTORIA:

						System.out.println("Introduce la historia:");
						String nuevaHistoria = sc.nextLine();
						perro.setHistoria(nuevaHistoria);

						break;

					case VACUNA:

						perro.setVacunado(true);

						break;

					case SALIR_MODIFICAR:

						salir = false;

						break;

					default:

						System.out.println("La opcion seleccionada no existe o es erronea");
						break;
					}

				} while (salir);

			}

		}

	}

	// metodo que elimina un Perro de nuestra lista
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

	// metodo que sirve para crer un nuevo perro y añadirlo a la lista
	private static void crearPerro() throws Exception {

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

		modelo.crear(p);

	}

	// metodo para visualizar la lista de Perros
	private static void listar() {

		ArrayList<Perro> perros = modelo.listar();

		for (Perro perro : lista) {
			// formato para mostrar solo nombre y raza
			System.out.println(String.format("%s [%s] %sKg", perro.getNombre(), perro.getRaza(), perro.getPeso()));
		}

	}

	/**
	 * Inicializar el ArrayList para simular que existen perros.<br>
	 * En un futuro nos conectaremos a una bbdd
	 */

	/*
	 * private static void incializarDatos() { lista.add(new Perro("Bubba"));
	 * lista.add(new Perro("Laika")); lista.add(new Perro("Rintintin"));
	 * lista.add(new Perro("goffy"));
	 *
	 * }
	 */

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
		System.out.println(OPCION_4 + ".- Modificar datos de un perro");
		System.out.println(OPCION_5 + ".- Listar todos los perros vacunados");
		System.out.println(SALIR + " - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");

		opcion = sc.nextLine();

	}

	// metodo que muestra el menu con las opciones que podemos modificar
	private static void menuModificar() {

		System.out.println("************************************");
		System.out.println(NOMBRE + ".-Modificar nombre ");
		System.out.println(RAZA + ".- Modificar raza ");
		System.out.println(PESO + ".-Modificar peso ");
		System.out.println(HISTORIA + ".- Modificar historia");
		System.out.println(VACUNA + ".- Vacunar perro");
		System.out.println(SALIR_MODIFICAR + " - Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");

		opcionModificar = sc.nextLine();

	}

}// AppPerrera
