package com.krakedev.herencia;

public class Hijo extends Padre {
	
	private int juguetes;
	
	public Hijo(int defectos, int virtudes, int juguetes) {
		super(defectos, virtudes);
		this.juguetes = juguetes;
	}
    
	// Con Override indicamos que sobreescribimos el metodo de padre 
	@Override
	public String toString() {
		return super.toString() + " Juguetes : " + juguetes;
	}
	
	
}
