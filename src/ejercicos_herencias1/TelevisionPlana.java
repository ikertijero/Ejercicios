package ejercicos_herencias1;

public class TelevisionPlana extends Television {

	private String tipoPantalla;

	public TelevisionPlana() {
		super();

	}

	public TelevisionPlana(String nombre, double precio, int pulgadas, String tipoPantalla) {
		super(nombre, precio, pulgadas);
		this.tipoPantalla = tipoPantalla;
	}

	public String getTipoPantalla() {
		return tipoPantalla;
	}

	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}

	@Override
	public String toString() {
		return super.toString() + "tipoPantalla=" + tipoPantalla;
	}

}
