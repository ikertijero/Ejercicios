package com.ipartek;

import java.util.Scanner;

import com.ipartek.pojo.Serie;

public class ImplementacionFunciones implements IFunciones {

	@Override
	public String pedirNombre() throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un nombre:");
		String nombre = sc.nextLine();
		sc.close();

		if (nombre.length() < 1) {

			throw new Exception("El nombre no puede contener menos de una letra");

		}

		for (int i = 0; i < nombre.length(); i++) {

			if (Character.isDigit(nombre.charAt(i))) {

				throw new Exception("El nombre no puede contener numeros");

			}

		}

		return null;
	}

	@Override
	public void imprimirNumeroLoteria(int tipoLoteria) throws Exception {

		switch (tipoLoteria) {
		case LOTERIA_BONOLOTO:
			System.out.println("El nuero de la Bonoloto es el siguiente:");
			System.out.println("03-02-32-21-12-25-Estrella:15-Estrella:45");

			break;
		case LOTERIA_EUROMILLON:

			System.out.println("El nuero del Euromillon es el siguiente:");
			System.out.println("5-6-37-15-42-Estrella:3-Estrella:4");

			break;

		case LOTERIA_QUINIELA:
			System.out.println("La conbinacion de la quiniela es el siguiente:");
			System.out.println("x-1-1-x-x-x-2-1-1-2-x-2-2-1-x");

			break;

		default:

			throw new Exception("Tipo de loteria incorrecto");

		}
	}

	@Override
	public float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception {
		if (dineroEntregado < precioProducto) {
			throw new Exception("Dinero insuficiente");
		}
		return dineroEntregado - precioProducto;
	}

	@Override
	public Serie pedirDatosPorConsola() {
		Serie serie = new Serie("");
		Scanner sc = new Scanner(System.in);

		System.out.println("Nombre:");
		serie.setNombre(sc.nextLine());

		System.out.println("Duración en minutos:");
		serie.setDuracion(Integer.parseInt(sc.nextLine()));

		System.out.println("Número de temporadas:");
		serie.setNumTemporada(Integer.parseInt(sc.nextLine()));

		System.out.println("Plataforma en la que esta disponble:");
		serie.setPlataforma(sc.nextLine());

		sc.close();
		return serie;
	}

}
