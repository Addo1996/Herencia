package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Padre padre = new Padre();
		
		padre.ahorrar(100);
		System.out.println(padre.getTotalAhorrado());
		
		padre.setNombre("Carlos");
		System.out.println(padre);
		
		System.out.println("____Hija heredo defectos virtudes nombre y ahorros de padre____");
		Hija hija = new Hija(5, 9 , "Luisa");

		hija.ahorrar(100);
		System.out.println(hija);
		System.out.println(hija.getTotalAhorrado());
		
		
		System.out.println("____Hijo heredo el ahorro____");
		Hijo hijo = new Hijo(9, 5, 3, "Pepe");

		hijo.ahorrar(100);

		System.out.println(hijo.getTotalAhorrado());

	}

}
