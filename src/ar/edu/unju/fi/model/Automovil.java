package ar.edu.unju.fi.model;

import ar.edu.unju.fi.model.constantes.Colores;

public class Automovil {
	private String patente;
	private String marca;
	private String modelo;
	private Short año;
	private Double precio;
	private Colores color;
	
	public Automovil() {
		// TODO Auto-generated constructor stub
	}

	public Automovil(String patente, String marca, String modelo, Short año, Double precio, Colores color) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.precio = precio;
		this.color = color;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Short getAño() {
		return año;
	}

	public void setAño(Short año) {
		this.año = año;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Colores getColor() {
		return color;
	}

	public void setColor(Colores color) {
		this.color = color;
	}
}
