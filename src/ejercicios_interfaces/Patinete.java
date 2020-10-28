package ejercicios_interfaces;

public class Patinete implements IVehiculo {

	private int velocidadActual;
	private boolean estaArrancado;

	public Patinete() {
		super();
		this.velocidadActual = 0;
		this.estaArrancado = false;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean isEstaArrancado() {
		return estaArrancado;
	}

	public void setEstaArrancado(boolean estaArrancado) {
		this.estaArrancado = estaArrancado;
	}

	@Override
	public void arrancar() {

		if (!this.estaArrancado) {

			this.estaArrancado = true;
		}
	}

	@Override
	public void acelerar(int incrementoVelocidad) {

		if (estaArrancado) {

			if (this.velocidadActual + incrementoVelocidad <= VEL_MAX_PATINETE) {

				this.velocidadActual += incrementoVelocidad;

			}

		}

	}

	@Override
	public void freanar(int decrementoVelocidad) {
		if (estaArrancado) {

			if (this.velocidadActual - decrementoVelocidad >= VEL_MIN) {

				this.velocidadActual -= decrementoVelocidad;

			}

		}
	}

	@Override
	public void apagar() {

		if (this.estaArrancado) {

			this.estaArrancado = false;
		}

	}

}
