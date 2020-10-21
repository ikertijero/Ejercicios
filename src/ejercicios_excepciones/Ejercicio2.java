package ejercicios_excepciones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		boolean isError = true;

		// 1º numero, Bucle para repetir hasta que no haya error
		do {

			System.out.println("Dime el 1º numero entero:");
			try {
				a = Integer.parseInt(sc.nextLine());
				isError = false;
			} catch (Exception e) {
				System.out.println("**error, necesito un numero valido");
			}

		} while (isError);

		// 2º numero, Bucle para repetir hasta que no haya error
		isError = true;
		do {

			System.out.println("Dime el 2º numero entero:");
			try {
				b = Integer.parseInt(sc.nextLine());
				isError = false;
			} catch (Exception e) {
				System.out.println("**error, necesito un numero valido");
			}

		} while (isError);

		System.out.println("Resultado a/b=" + (a / b));

		sc.close();

	}

}
