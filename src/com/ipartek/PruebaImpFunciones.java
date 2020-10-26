package com.ipartek;

public class PruebaImpFunciones {

	public static void main(String[] args) {

		ImplementacionFunciones imp = new ImplementacionFunciones();
		boolean isError;

		do {
			try {

				isError = false;
				String nombre = imp.pedirNombre();

			} catch (Exception e) {

				System.out.println("Exception: " + e.getMessage());
				isError = true;
			}
		} while (isError);

		try {

			imp.imprimirNumeroLoteria(1);

		} catch (Exception e) {

			System.out.println("Exception: " + e.getMessage());

		}

	}// fin main

}
