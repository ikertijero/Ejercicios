package com.ipartek;

/**
 * 
 * Ejercicio para aprender a declarar variables en Java
 * 
 * @author Iker Tijero
 * @version 1.0
 *
 */

public class Variables {

	// metodo main ctrl + spacio

	public static void main(String[] args) {

		String nombre = "iker";
		int edad = 30;
		double sueldo = 1500.4;
		char sexo = 'm';
		
	

		System.out.println("Hola " + nombre);
		System.out.println("Edad " + edad + " años");
		System.out.println("Sueldo " + sueldo + "€");
		System.out.println("Sexo " + sexo);

		switch (sexo) {
		case 'm':
			System.out.println("eres masculino");
			break;

		case 'f':
			System.out.println("eres femenino");
			break;

		default:
			System.out.println("No sabemos lo q eres");
			break;
		}

	}

}
