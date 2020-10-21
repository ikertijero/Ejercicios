package ejercicios_variables;

/**
 * 
 * Realizar un programa que realice la siguiente operación: crear tres variables
 * de tipo Byte, llamadas num1, num2, resultado. Asignar los valores 255 y 223.
 * Sumarlas y guardarlo en resultado. Comprueba si el resultado da 478. Si no lo
 * da, buscar una solución al problema para solucionarlo
 * 
 * @author iker tijero
 *
 */

public class VariablesEjer4 {

	public static void main(String[] args) {

		byte num1 = (byte) 255;
		byte num2 = (byte) 223;
		byte resultado;

		resultado = (byte) (num1 + num2);

		System.out.println(resultado);

	}

}
