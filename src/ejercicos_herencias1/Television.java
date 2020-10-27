package ejercicos_herencias1;

public class Television extends Electrodomestico {

	private int pulgadas;

	public Television() {
		super();

	}

	public Television(String nombre, double precio, int pulgadas) {
		super(nombre, precio);
		this.pulgadas = pulgadas;

	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public String toString() {
		return super.toString() + "pulgadas=" + pulgadas + ", ";
	}

}
