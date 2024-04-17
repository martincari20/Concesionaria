package ar.edu.unju.fi.test;

import ar.edu.unju.fi.model.Automovil;
import ar.edu.unju.fi.model.constantes.Colores;

public class TestCrearAutomovil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil automovil = new Automovil();
		automovil.setMarca("Renault");
		automovil.setColor(Colores.NEGRO);
		
		System.out.println("Marca: "+automovil.getMarca());
		System.out.println("Color: "+automovil.getColor());
	}

}
