package ejercicos_herencias1;

public class Electrodomestico {

	private String nombre;
	private double precio;

	public Electrodomestico() {

	}

	public Electrodomestico(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Electrodomestico: nombre=" + nombre + ", precio=" + precio + "�, ";
	}

}
