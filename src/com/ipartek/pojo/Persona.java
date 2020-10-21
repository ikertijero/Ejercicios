package com.ipartek.pojo;

public class Persona {

	final static int EDAD_MIN = 0;
	final static int EDAD_MAX = 120;

	private String nombre;
	private int edad;

	public Persona() {

		this.nombre = "";
		this.edad = 0;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {

		if (edad < EDAD_MIN || edad > EDAD_MAX) {

			// TODO mirar como aplicar formato String

			// throw new Exception(new String("La edad esta fuera de rango entre %s %s ",
			// EDAD_MIN, EDAD_MAX));
			throw new Exception(String.format("La edad esta fuera de rango entre %s y %s", EDAD_MIN, EDAD_MAX));

		} else {

			this.edad = edad;

		}

	}

}
