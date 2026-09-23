package com.krakedev.herencia;

public class Padre {

	private int defectos;
	private int virtudes;
	
	public Padre() {
		
		System.out.println("Soy el constructor vacio del Padre");
	}
	
	
	public Padre(int defectos, int virtudes) {
		this.defectos = defectos;
		this.virtudes = virtudes;
	}
	

	@Override
	public String toString() {
		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
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

	public void imprimir() {
		System.out.println(" Virtudes : " + virtudes);
		System.out.println(" Defectos : " + defectos);
	}
	
	public void guardarSecreto() {
		System.out.println("Este secreto no se comparte");
	}

}
