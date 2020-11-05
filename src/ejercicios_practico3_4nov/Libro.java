package ejercicios_practico3_4nov;

public class Libro implements Comparable<Libro> {

	private int id;
	private String nombre;
	private int numPaginas;

	public Libro(String nombre, int numPaginas) {
		super();
		this.id = 0;
		this.nombre = nombre;
		this.numPaginas = numPaginas;
	}

	public Libro(int id, String nombre, int numPaginas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numPaginas = numPaginas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "Libro [ id=" + id + ", nombre=" + nombre + ", numPaginas=" + numPaginas + "]";
	}

	@Override
	public int compareTo(Libro o) {
		return this.nombre.compareTo(o.nombre);
		// return this.paginas - o.paginas;
	}

}
