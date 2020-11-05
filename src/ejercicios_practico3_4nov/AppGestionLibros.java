package ejercicios_practico3_4nov;

import java.util.Scanner;

public class AppGestionLibros extends AppGestion {

	static Scanner sc = null;
	static String opcion = "";
	static private LibroDao modelo = LibroDaoHashMap.getInstance();

	static boolean isError = true;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		boolean salir = true;

		// Bucle que muestra un menu con diferentes opciones
		do {

			System.out.println("***********  APP  LIBRERIA  **************");

			pintarMenu("Libros");

			System.out.println("\n Selecciona una opcion del menu:");

			opcion = sc.nextLine();

			switch (opcion) {
			case OP_LISTAR:

				listar();

				break;
			case OP_CREAR:

				crear();

				break;
			case OP_ELIMINAR:

				eliminar();
				break;

			case OP_MODIFICAR:

				break;

			case OP_SALIR:

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

	private static void eliminar() {

		System.out.println("Introduce el ID del libro que quieres eliminar:");
		int id = Integer.parseInt(sc.nextLine());

		if (modelo.delete(id) == false) {

			System.out.println("No se a podido eliminar, el libro con ID " + id + " no existe");

		} else {

			System.out.println("Libro eliminado correctamente");
		}
	}

	private static void crear() {

		System.out.println("Introduce el nombre del libro:");
		String nombre = sc.nextLine();
		int numPaginas = 0;

		do {
			try {
				System.out.println("Introduce el numero de paginas del libro");
				numPaginas = Integer.parseInt(sc.nextLine());
				isError = false;
			} catch (Exception e) {

				System.out.println("Formato erroneo, introduce un numero");

			}
		} while (isError);

		Libro l = new Libro(nombre, numPaginas);

		if (modelo.insert(l) == false) {

			System.out.println("Error, no se ha podido crera el libro el nombre ya existe");

		} else {

			System.out.println("Libro creado correctamente");
		}
	}

	private static void listar() {

		for (Libro libro : modelo.getAll()) {

			System.out.println(libro);
		}

	}

}
