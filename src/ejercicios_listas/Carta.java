package ejercicios_listas;

public class Carta {

	// Atruibutos clase
	private int valorCarta;
	private String palo;

	// Constructor
	public Carta() {

	}

	// Getters y Setters
	public int getValorCarta() {
		return valorCarta;
	}

	public void setValorCarta(int valorCarta) {
		this.valorCarta = valorCarta;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	// Metodo toString()
	@Override
	public String toString() {
		return "Carta: " + valorCarta + " de " + palo;
	}

}
