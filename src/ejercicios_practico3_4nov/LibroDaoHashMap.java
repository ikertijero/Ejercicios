package ejercicios_practico3_4nov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class LibroDaoHashMap implements LibroDao {

	private HashMap<Integer, Libro> mapaLibros = new HashMap<Integer, Libro>();
	private int indice;
	private static LibroDaoHashMap INSTANCE = null;

	private LibroDaoHashMap() {
		super();

		mapaLibros.put(1, new Libro(1, "Rumble", 200));
		mapaLibros.put(2, new Libro(2, "Ether", 150));
		mapaLibros.put(3, new Libro(3, "BeoWulf", 300));
		indice = 4;

	}

	public static synchronized LibroDaoHashMap getInstance() {

		if (INSTANCE == null) {
			INSTANCE = new LibroDaoHashMap();
		}

		return INSTANCE;
	}

	@Override
	public List<Libro> getAll() {

		/*
		 * ArrayList<Libro> lstLibros = new ArrayList<Libro>();
		 * 
		 * if (mapaLibros != null) {
		 * 
		 * for (Iterator<Integer> it = mapaLibros.keySet().iterator(); it.hasNext();) {
		 * 
		 * Integer key = it.next(); Libro value = mapaLibros.get(key);
		 * lstLibros.add(value); }
		 * 
		 * return lstLibros;
		 * 
		 * }
		 * 
		 * return null;
		 * 
		 */

		return new ArrayList<Libro>(mapaLibros.values());
	}

	@Override
	public Libro getById(int id) {

		Libro libro = null;

		/*
		 * for (Iterator<Integer> it = mapaLibros.keySet().iterator(); it.hasNext();) {
		 * 
		 * Integer key = it.next(); Libro value = mapaLibros.get(key);
		 * 
		 * if (key == id) {
		 * 
		 * libro = value; break; } }
		 */

		if (mapaLibros.containsKey(id)) {

			libro = mapaLibros.get(id);
		}
		return libro;
	}

	@Override
	public boolean delete(int id) {

		boolean resultado = false;

		/*
		 * for (Iterator<Integer> it = mapaLibros.keySet().iterator(); it.hasNext();) {
		 * 
		 * 
		 * Integer key = it.next(); Libro value = mapaLibros.get(key);
		 * 
		 * if (key == id) {
		 * 
		 * mapaLibros.remove(id); resultado = true; break; } }
		 */

		if (mapaLibros.containsKey(id)) {

			mapaLibros.remove(id);
			resultado = true;

		}
		return resultado;
	}

	@Override
	public boolean insert(Libro l) {

		boolean encontrado = false;
		boolean resultado = true;

		for (Iterator<Integer> it = mapaLibros.keySet().iterator(); it.hasNext();) {

			Integer key = it.next();
			Libro value = mapaLibros.get(key);

			if (value.getNombre().equalsIgnoreCase(l.getNombre())) {

				encontrado = true;
				resultado = false;
				break;

			}

		}

		if (encontrado == false) {

			l.setId(indice);
			mapaLibros.put(indice, l);
			indice++;

		}

		return resultado;
	}

}
