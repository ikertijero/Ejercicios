package ejercicios_listas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Crear una lista de jugadores de futbol. En dicha lista se guardaran objetos
 * de la clase Jugador, que tendr� los atributos nombre, de tipo Sting y dorsal
 * de tipo int. Solicitar los datos de los jugadores por teclado, y una vez
 * introducido el primero, se insertara en la lista y se preguntara si se desea
 * introducir otro m�s, para lo cual el usuario escribir� S o N. En caso
 * afirmativo se volver� a pedir otro m�s, hasta que el usuario escriba N
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
