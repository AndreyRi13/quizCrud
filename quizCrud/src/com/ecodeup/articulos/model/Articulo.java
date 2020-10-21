package com.ecodeup.articulos.model;


public class Articulo {

	private int id;
	
	private String placa;
	
	private String marca;

	private String modelo;

	private String anio;
	
	private String cilindraje;
	
	
	public Articulo() {}


	public Articulo( String placa, String marca, String modelo, String anio, String cilindraje) {
				
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.cilindraje = cilindraje;
		
	}


	public Articulo(int id, String placa, String marca, String modelo, String anio, String cilindraje) {
		
		this.id = id;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.cilindraje = cilindraje;
		
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
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

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}
	

	public String getCilindraje() {
		return cilindraje;
	}



	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}	
}
