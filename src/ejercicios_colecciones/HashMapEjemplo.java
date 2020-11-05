package ejercicios_colecciones;

import java.util.HashMap;
import java.util.Iterator;

import com.ipartek.pojo.Perro;

public class HashMapEjemplo {

	public static void main(String[] args) {
		// Definir un HashMap
		HashMap<String, String> global = new HashMap<String, String>();

		// Insertar valores "key"-"value" al HashMap
		/*
		 * global.put("Laura", "667895789"); global.put("Pepe", "645895756");
		 * global.put("Abelardo", "55895711"); global.put("Daniel", "667111788");
		 * global.put("Arturo", "667598623");
		 */

		// probar a meter un duplicado
		// global.put("Arturo", "666555444");

		// recuperar el value por la Key
		// String telefonoPepe = global.get("Pepe");

		// obtener todas las Keys
		// Set<String> keys = global.keySet();

		// obtener todos los values
		// Collection<String> values = global.values();

		// Definir Iterator para extraer o imprimir valores

		/*
		 * for (Iterator<String> it = global.keySet().iterator(); it.hasNext();) {
		 * String key = (String) it.next(); String value = (String) global.get(key);
		 * System.out.println("Alumno: " + key + " - " + "Telefono: " + value); }
		 */

		// definir una hashamp con perros la key será su id(int) y el value(Perro)
		HashMap<Integer, Perro> hmPerros = new HashMap<Integer, Perro>();

		// meter 2 perros

		Perro p1 = new Perro("txispi", "Cruce", 34.12);
		Perro p2 = new Perro("Bubba", "Cruce", 25.4);
		Perro p3 = new Perro("Katon", "Cruce", 55.6);

		hmPerros.put(1, p1);
		hmPerros.put(2, p2);
		hmPerros.put(3, p3);

		// recorrer con un Iterator

		for (Iterator<Integer> it = hmPerros.keySet().iterator(); it.hasNext();) {

			Integer key = it.next();
			Perro value = hmPerros.get(key);
			System.out.println("id del perro: " + key + " Perro: " + value);

		}

	}

}
