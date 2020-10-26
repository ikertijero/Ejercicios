package ejercicios_listas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear una lista de jugadores de futbol. En dicha lista se guardaran objetos
 * de la clase Jugador, que tendrá los atributos nombre, de tipo Sting y dorsal
 * de tipo int. Solicitar los datos de los jugadores por teclado, y una vez
 * introducido el primero, se insertara en la lista y se preguntara si se desea
 * introducir otro más, para lo cual el usuario escribirá S o N. En caso
 * afirmativo se volverá a pedir otro más, hasta que el usuario escriba N
 *
 * 
 * @author Iker Tijero
 *
 */

public class Ejercico2 {

	static public ArrayList<Jugador> lstJugadores = new ArrayList<Jugador>();
	static public Scanner sc = new Scanner(System.in);
	static String opcion = "";

	public static void main(String[] args) {

		do {

			Jugador j = new Jugador();

			System.out.println("Intruduce nombre del jugador:");
			j.setNombre(sc.nextLine());

			System.out.println("Intruduce el dorsal del jugador:");
			j.setDorsal(Integer.parseInt(sc.nextLine()));

			lstJugadores.add(j);

			System.out.println("Desea continuar?(SI o NO)");
			opcion = sc.nextLine();

		} while (opcion.equalsIgnoreCase("si"));

		sc.close();
	}

}
