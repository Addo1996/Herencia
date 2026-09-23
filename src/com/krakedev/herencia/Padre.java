package com.krakedev.herencia;

public class Padre {

	private int defectos;
	private int virtudes;
	private double totalAhorrado;
	private String nombre;

	public Padre() {

		System.out.println("Soy el constructor vacio del Padre");
	}

	public Padre(int defectos, int virtudes, String nombre) {
		this.defectos = defectos;
		this.virtudes = virtudes;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + ", Total Ahorrado =" + totalAhorrado
				+ ", nombre=" + nombre + "]";
	}

	public int getDefectos() {
		return defectos;
	}

	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}

	public int getVirtudes() {
		return virtudes;
	}

	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}

	public double getTotalAhorrado() {
		return totalAhorrado;
	}

	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void ahorrar(double monto) {
		totalAhorrado += monto;
	}

	public void imprimir() {
		System.out.println(" Virtudes : " + virtudes);
		System.out.println(" Defectos : " + defectos);
	}

	public void guardarSecreto() {
		System.out.println("Este secreto no se comparte");
	}

}
