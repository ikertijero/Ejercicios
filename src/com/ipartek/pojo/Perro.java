package com.ipartek.pojo;

public class Perro {

	// Atributos

	private int id;

	private String nombre;
	private String raza;
	private double peso;
	private boolean isVacunado;
	private String historia;

	// constructor

	public Perro() {
		super();

		this.id = 0;
		this.nombre = "sin nombre";
		this.raza = "cruze";
		this.peso = 0;
		this.isVacunado = false;
		this.historia = "";

	}

	public Perro(String nombre) {
		this();// this llama al constructor por defecto

		this.nombre = nombre;

	}

	public Perro(String nombre, String raza, double peso) {
		super();

		this.nombre = nombre;
		this.raza = raza;
		this.peso = peso;
	}

	// Getters y setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso < 0) {
			this.peso = 0;
		} else {
			this.peso = peso;
		}
	}

	public boolean isVacunado() {
		return isVacunado;
	}

	public void setVacunado(boolean isVacunado) {
		this.isVacunado = isVacunado;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", Raza=" + raza;
	}

}
