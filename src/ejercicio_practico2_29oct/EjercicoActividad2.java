package ejercicio_practico2_29oct;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicoActividad2 {

	// Constantes
	final static String OPCION_VALIDA = "si";

	// Variables globales
	static Scanner sc = null;
	static ArrayList<Coche> lstCoches = new ArrayList<Coche>();
	static String opcion = "";
	static boolean isErrorPo = true; // isErro potencia
	static boolean isErrorCi = true; // isError cilindrada

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		cargarLista();
		mostrarLista();

	}

	private static void mostrarLista() {

		System.out.println("-----------------------Lista Coches--------------------");
		for (Coche coche : lstCoches) {

			System.out.println(coche.toString());
		}

	}

	private static void cargarLista() {

		int potencia = 0;
		int cilindrada = 0;

		do {

			System.out.println("-----------------------Datos Coche--------------------");

			System.out.println("Introduce la marca del coche:");
			String marca = sc.nextLine();

			System.out.println("Introduce el modelo:");
			String modelo = sc.nextLine();

			System.out.println("Introduce la matricula:");
			String matricula = sc.nextLine();

			System.out.println("Introduce el color del coche:");
			String color = sc.nextLine();

			do {
				try {

					System.out.println("Introduce la potencia:");
					potencia = Integer.parseInt(sc.nextLine());

					isErrorPo = false;
				} catch (Exception e) {
					System.out.println("Formato del numero incorrecto");
				}
			} while (isErrorPo);

			do {
				try {

					System.out.println("Introduce la cilindrada:");
					cilindrada = Integer.parseInt(sc.nextLine());

					isErrorCi = false;
				} catch (Exception e) {
					System.out.println("Formato del numero incorrecto");
				}
			} while (isErrorCi);

			Coche c = new Coche(color, matricula, marca, modelo, potencia, cilindrada);
			lstCoches.add(c);

			System.out.println("-------------------------------------------------------");

			System.out.println("Desea continuar introduciendo coches?");
			opcion = sc.nextLine();

		} while (opcion.equalsIgnoreCase(OPCION_VALIDA));
		sc.close();
	}

}
