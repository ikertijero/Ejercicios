package ejercicio.practico1;

import java.util.Scanner;

/**
 * B) Crear un proyecto en modo consola que nos muestre un menú de 3 opciones
 * <ul>
 * <li>Calcular la letra del dni.</li>
 * <li>Calcular medida de cm a pulgadas.</li>
 * <li>Salir.</li> Hacer que dicho menú se ejecute en bucle hasta que se pulse
 * salir, y si el usuario escoge cada una de las funciones, que permita
 * introducir los datos correspondientes por teclado para poder dar el resultado
 * 
 * @author Iker TIjero
 *
 */

public class EjercicioB {

	// Constantes primer menu

	final static String OPCION_1 = "1";
	final static String OPCION_2 = "2";
	final static String SALIR = "s";
	final static double DIVISOR_PULGADA = 2.54;

	// variables globales

	static Scanner sc = null;
	static String opcion = ""; // opcion seleccionada en el menu por el usuario

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		boolean salir = true;

		// Menu que se muestra en blucle hasta que pulse la opcion de salir
		do {

			pintarMenu();

			switch (opcion) {
			case OPCION_1:

				try {

					String dniCompleto = calcularLetraDni();

					System.out.println("Tu DNI completo es: " + dniCompleto);

				} catch (Exception e) {

					System.out.println("Error, necesitas 8 numeros ");
				}

				break;

			case OPCION_2:

				System.out.println("Introduce el valo en centimetros: ");

				try {
					double centimetros = Double.parseDouble(sc.nextLine());

					double pulgadas = centimetros / DIVISOR_PULGADA;

					System.out.println(centimetros + " cm son " + pulgadas + " pulgadas");

				} catch (Exception e) {
					System.out.println("Valor incorrecto!, introduce un numero");
				}
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

	}

	// Metodo que calcula la letra del DNI
	private static String calcularLetraDni() throws Exception {

		String[] letraDNI = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
				"H", "L", "C", "K", "E" };

		System.out.println("Introduce numeros del DNI:");

		String numeros = sc.nextLine();

		String letra = "";

		if (numeros == null) {
			throw new Exception("No puede ser null");
		}

		if (numeros.length() != 8) {
			throw new Exception("Los numeros de un dni son 8");
		}

		try {

			int resto = Integer.parseInt(numeros) % 23;

			letra = letraDNI[resto];

		} catch (Exception e) {

			System.out.println("No es numero valido");
		}

		return numeros + letra;

	}

	// Metodo que visualiza el menu
	private static void pintarMenu() {

		System.out.println("****************MENU****************");
		System.out.println(OPCION_1 + ".- Calcular letra dni");
		System.out.println(OPCION_2 + ".- Calcular medida de cm a pulgadas");
		System.out.println(SALIR + ".- Salir");
		System.out.println("************************************");

		System.out.println("\n Selecciona una opcion del menu:");

		opcion = sc.nextLine();

	}

}
