package ejercicios_interfaces;

public interface IVehiculo {

	final static int VEL_MAX_COCHE = 150;
	final static int VEL_MAX_BICI = 50;
	final static int VEL_MAX_PATINETE = 80;
	final static int VEL_MIN = 0;

	/**
	 * pondrá el atributo estaArrancado a true. Debe estar apagado para poder
	 * arrancarse
	 */
	public void arrancar();

	/**
	 * incrementara la velocidad actual con el valor que se le pasa por parámetro
	 * sin sobrepasar el limite máximo de velocidad. Solo acelerara si el patinete
	 * esta encendido.
	 * 
	 * @param incrementoVelocidad
	 */
	public void acelerar(int incrementoVelocidad);

	/**
	 * decrementara la velocidad actual con el valor que se le pasa por parámetro
	 * sin llegar a bajar de 0. Solo frenara si el patinete esta encendido
	 *
	 * @param decrementoVelocidad
	 */
	public void freanar(int decrementoVelocidad);

	/**
	 * Pondrá el atributo estaArrancado a false, solo si la velocidadActual es 0
	 */

	public void apagar();

}
