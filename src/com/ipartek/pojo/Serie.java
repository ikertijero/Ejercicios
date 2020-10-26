package com.ipartek.pojo;

/**
 * Una serie de TV consta de los siguientes atributos:
 * 
 * <ul>
 * <li>Nombre</li>
 * <li>numTemporadas</li>
 * <li>duracion (minutos)</li>
 * <li>plataforma(netflix,plex,hbo,moviestar,...)</li>
 * </ul>
 * 
 * El constructor debere pasarse siempre el nombre de forma obligatoria.. El
 * resto de campos se iniciaalzan a 0 y la plataforma especificar "internet"
 * 
 * @author ur00
 *
 */
public class Serie {

	// Atributos clase

	private String nombre;
	private int numTemporada;
	private int duracion;
	private String plataforma;

	// Constructor

	public Serie(String nombre) {

		this.nombre = nombre;
		this.numTemporada = 0;
		this.duracion = 0;
		this.plataforma = "internet";

	}

	// Getters y Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumTemporada() {
		return numTemporada;
	}

	public void setNumTemporada(int numTemporada) {
		this.numTemporada = numTemporada;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

}