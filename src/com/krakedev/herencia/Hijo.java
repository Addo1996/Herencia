package com.krakedev.herencia;

public class Hijo extends Padre {
	
	private int juguetes;
	
	public Hijo(int defectos, int virtudes, int juguetes) {
		super(defectos, virtudes);
		this.juguetes = juguetes;
	}
	
	// Calcular el 50% del ahorro del padre
	@Override
	public void ahorrar(double monto) {
		super.ahorrar(monto * 0.5);
	}
    
	// Con Override indicamos que sobreescribimos el metodo de padre 
	@Override
	public String toString() {
		return super.toString() + " Juguetes : " + juguetes;
	}
	
	
}
