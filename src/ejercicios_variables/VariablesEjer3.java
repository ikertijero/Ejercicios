package ejercicios_variables;

/**
 * 
 * Realizar un programa que tenga 2 variables enteras, dividendo y divisor.
 * Meterle valores enteros y positivos. Realizar la operación división y mostrar
 * el resultado en pantalla. Repetir el mismo código con estas variaciones:
 * entero y real, real y entero, real y real. Por ultimo, intentar dividir en
 * los cuatro casos anteriores entre 0 y mostrar el resultado en pantalla.
 *
 * @author iker tijero
 *
 */

public class VariablesEjer3 {

	public static void main(String[] args) {

		// valores enteros
		int dividendo = 24;
		int divisor = 12;

		System.out.println("Division= " + dividendo / divisor);

		// valores entero y real
		int dividendo2 = 24;
		float divisor2 = (float) 1.2;

		System.out.println("Division= " + dividendo2 / divisor2);

		// valores real y entero

		float dividendo3 = (float) 2.4;
		int divisor3 = 12;

		System.out.println("Division= " + dividendo3 / divisor3);

		// valor real y rael

		float dividendo4 = (float) 2.4;
		float divisor4 = (float) 1.2;

		System.out.println("Division= " + dividendo4 / divisor4);

		// dividir los 4 casos entre 0

		int dividendo5 = 24;
		int divisor5 = 0;

		System.out.println("Division= " + dividendo5 / divisor5);
	}

}
