package ejercicos_herencias1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realizar las siguientes jerarquías de herencia: tendremos una clase padre que
 * se llamara Electrodoméstico. Dicha clase contara con los atributos nombre y
 * precio. Se realizaran todos los constructores, métodos get y set necesarios
 * Una vez creada dicha clase, se creara una serie de clases hijas. La primera
 * será la clase televisor. Dicha clase contara con el atributo pulgadas, así
 * como con todos los constructores y métodos necesarios para rellenar sus
 * atributos, incluidos los del padre También se creara una clase
 * televisionPlana, que heredara de televisión, tendrá el atributo string tipo
 * de pantalla ( tft, plasma,..) y constructores, métodos get y set para
 * rellenar los datos de los objetos que se creen, incluyendo todos los
 * atributos de los objetos de las clases padres de las que heredan.
 * <p>
 * Una vez creado esta jerarquía de herencia, realizar un programa que nos pida
 * insertar televisiones planas dentro de un array de electrodomésticos. Dicho
 * array constara de 5 electodomesticos, pero lo rellenaremos con objetos de
 * tipo televisiónPlana.
 * </p>
 *
 * 
 * 
 * @author Iker tijero
 *
 */

public class EjercicioHerencia {

	final static int CANT_ELECTRODOMESTICOS = 5;

	static ArrayList<Electrodomestico> lstElectrodomesticos = new ArrayList<Electrodomestico>();

	public static void main(String[] args) {

		cargarArray();

		visualizarArray();

	}

	private static void visualizarArray() {

		for (Electrodomestico elec : lstElectrodomesticos) {

			System.out.println(((Television) elec).getPulgadas() + elec.getNombre());

		}

	}

	private static void cargarArray() {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < CANT_ELECTRODOMESTICOS; i++) {

			TelevisionPlana tp = new TelevisionPlana();

			System.out.println("Introduce la marca:");
			tp.setNombre(sc.nextLine());

			// System.out.println("Precio TV:");
			// tp.setPrecio(Double.parseDouble(sc.nextLine()));

			System.out.println("Introduce las pulgadas:");
			tp.setPulgadas(Integer.parseInt(sc.nextLine()));

			// System.out.println("Tipo de pantalla:");
			// tp.setTipoPantalla(sc.nextLine());

			lstElectrodomesticos.add(tp);
		}

		sc.close();

	}

}
