package ejercicios_excepciones;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Persona;

public class Ejercicio4 {

	public static void main(String[] args) {

		ArrayList<Persona> lstPersonas = new ArrayList<Persona>();

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Introduce el nombre:");
			String nombre = sc.nextLine();

			System.out.println("Introduce la edad:");
			int edad = Integer.parseInt(sc.nextLine());

			Persona p = new Persona();
			p.setNombre(nombre);
			p.setEdad(edad);

			lstPersonas.add(p);

		} catch (Exception e) {
			System.out.println(" Excepcion: " + e.getMessage());

		}

	}

}
