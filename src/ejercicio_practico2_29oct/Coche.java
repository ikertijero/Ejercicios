package ejercicio_practico2_29oct;

/**
 * Realizar un programa que nos cree una lista de coches, para ello deberá
 * almacenarse dentro de esta lista los objetos de tipo coche que crearemos La
 * clase coche tendrá los siguientes atributos: matricula, marca, modelo, color,
 * potencia, cilindrada Para rellenar la lista se creara un menú que nos
 * solicitara introducir los datos por teclado, y una vez leídos todos, se
 * guardaran en un objeto que se añadirá a la lista y nos pedirá que indiquemos
 * si queremos introducir un vehículo más o no. Una vez que no queramos
 * introducir más coches, nos mostrara todo el contenido en pantalla
 * 
 * @author iker tijero
 *
 */

public class Coche extends Vehiculo {

	// Atributos
	private String marca;
	private String modelo;
	private int potencia;
	private int cilindrada;

	// Constructor
	public Coche() {
		super();
		this.marca = "";
		this.modelo = "";
		this.potencia = 0;
		this.cilindrada = 0;
	}

	public Coche(String color, String matricula, String marca, String modelo, int potencia, int cilindrada) {
		super(color, matricula);
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
	}

	// Getters y Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Marca=" + marca + ", Modelo=" + modelo + super.toString() + ", Potencia=" + potencia + ", Cilindrada="
				+ cilindrada;
	}
}
