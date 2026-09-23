package com.krakedev.herencia;

public class Hija extends Padre{
	
	public Hija(int defectos, int virtudes) {
		super(defectos, virtudes);
	}
	
	public void ecucharBaddBunny() {
		System.out.println("Escucha musica horrible");
		}

	@Override
	public String toString() {
		return "Defectos : " + getDefectos() + "Virtudes : " + getVirtudes();
	}

}
