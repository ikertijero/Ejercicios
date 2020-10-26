package com.ipartek;

import com.ipartek.pojo.Serie;

/**
 * Interfaz para obligar a implementar una serie de metodos.
 * 
 * @author ur00
 *
 */
public interface IFunciones {

	final int LOTERIA_EUROMILLON = 1;
	final int LOTERIA_QUINIELA = 2;
	final int LOTERIA_BONOLOTO = 3;

	/**
	 * pedir nombre por Scanner
	 * 
	 * @throws si el nombre es menor de una letra o contiene numeros
	 * @return nombre escrito
	 */
	String pedirNombre() throws Exception;

	/**
	 * imprime el tipo de Loteria segun el numero que introducen
	 * 
	 * @throws si el tipoLoteria no existe, LOTERIA_EUROMILLON, LOTERIA_QUINIELA,
	 *            LOTERIA_BONOLOTO
	 */
	void imprimirNumeroLoteria(int tipoLoteria) throws Exception;

	/**
	 * calcula las vueltas
	 * 
	 * @param dineroEntregado float
	 * @param precioProducto  float
	 * @return float son las vueltas
	 * @throws Exception si precioProducto > dineroEntregado
	 */
	float calcularVueltas(float dineroEntregado, float precioProducto) throws Exception;

	/**
	 * Pedimos todos los datos de una serie por consola
	 * 
	 * @return Serie
	 */
	Serie pedirDatosPorConsola();

}