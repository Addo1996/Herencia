package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Padre;

public class TestPrivado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hija hija = new Hija();
		
		hija.guardarSecreto();
		
		
		Padre padre = new Padre();
		
		padre.guardarSecreto();

	}

}
