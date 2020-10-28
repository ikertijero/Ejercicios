package ejercicios_listas;

import java.util.ArrayList;
import java.util.Random;

/**
 * Crear una lista que contenga las cuarenta cartas de una baraja. Para crear
 * dicha lista se creara una clase de tipo carta, que tendrá un número entero
 * para el valor de la carta, así como un string con el palo de la baraja
 * (copas, espadas, oros, bastos). Crear la baraja con las cartas ordenadas por
 * palos, y luego por números. Barajar dicha baraja y mostrar las cartas.
 *
 * 
 * @author Iker Tijero
 *
 */

public class Ejercicio4 {

	final static int VALOR_LIMITE_CARTAS = 10;
	final static int CANT_CARTAS = 40;

	static public ArrayList<Carta> lstCartas = new ArrayList<Carta>();

	public static void main(String[] args) {

		crearBaraja();

		// barajarBaraja();
		barajarBaraja2();
		visualizarBaraja();
	}

	private static void visualizarBaraja() {

		for (Carta carta : lstCartas) {

			System.out.println(carta);

		}

	}

	private static void barajarBaraja2() {

		Random rnd = new Random();

		for (int i = 0; i < lstCartas.size(); i++) {

			int azar = rnd.nextInt(lstCartas.size());
			Carta c = lstCartas.remove(azar);

			lstCartas.add(c);
		}

	}

	private static void barajarBaraja() {

		ArrayList<Integer> numAleatorios = new ArrayList<Integer>();

		int num = (int) Math.floor(Math.random() * (39 - 0 + 1) + (0));

		for (int i = 0; i < CANT_CARTAS; i++) {

			if (!numAleatorios.contains(num)) {

				numAleatorios.add(num);

			} else {

				i--;
			}
			num = (int) Math.floor(Math.random() * (39 - 0 + 1) + (0));
		}

		for (int i = 0; i < lstCartas.size(); i++) {

			int numRand = numAleatorios.get(i);
			System.out.println(lstCartas.get(numRand));

		}

	}

	private static void crearBaraja() {

		String[] palos = { "Bastos", "Espadas", "Oros", "Copas" };

		for (int p = 0; p < palos.length; p++) {

			for (int i = 0; i < VALOR_LIMITE_CARTAS; i++) {

				Carta c = new Carta();

				c.setPalo(palos[p]);
				c.setValorCarta(i + 1);

				lstCartas.add(c);
			}

		}

	}

}
