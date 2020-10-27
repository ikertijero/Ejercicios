package ejercicos_herencias1;

import java.util.ArrayList;

/**
 * Realizar el mismo ejercicio que en EjecicioElectrodomesticos, pero esta vez
 * hay que crear nuevos constructores para poder crear instancias con todos los
 * atributos.<br>
 * por ejemplo: <br>
 * 
 * <pre>
 *   
 *      TelevisionPlana tv = new TelevisionPlana("tele", 300, .., ..  );
 * </pre>
 * 
 * @see EjecicioElectrodomesticos
 * @author ur00
 *
 */
public class EjercicioElectrodomesticos2 {

	public static void main(String[] args) {
		ArrayList<Electrodomestico> lista = new ArrayList<>();

		Electrodomestico elec1 = new Electrodomestico("Sony", 550.99);
		Television tv = new Television("LG", 550, 55);
		TelevisionPlana tvp = new TelevisionPlana("Samsung", 650, 42, "LED");

		lista.add(elec1);
		lista.add(tv);
		lista.add(tvp);

		for (Electrodomestico elec : lista) {

		}

	}
}