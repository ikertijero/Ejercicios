package ejercicio_practico2_29oct;

/**
 * 
 * Crear clase Vehiculo ( color, matricula )
 * 
 * @author iker tijero
 *
 */

public class Vehiculo implements IConducible {

	// Atributos de la clase
	private String color;
	private String matricula;

	// Contructores
	public Vehiculo() {
		super();
		this.color = "";
		this.matricula = "";
	}

	public Vehiculo(String color, String matricula) {
		super();
		this.color = color;
		this.matricula = matricula;
	}

	// Getters y Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public void arrancar() {

		System.out.println("El coche esta arrancado");

	}

	@Override
	public void parar() {

		System.out.println("El coche esta parado");

	}

	@Override
	public String toString() {
		return ", Color=" + color + ", Matricula=" + matricula;
	}

}
