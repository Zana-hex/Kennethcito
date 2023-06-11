package Modelo;

/**
* Proyecto Programado #1
* Alumnos> Gerardo Gael Rojas Ramos - Jeremy Pizarro Chaves 
* Carnet>  			C26860  		- 		C25992
* Profesor> Kenneth Sanchez
* 13/06/2023
*/

public class Cajero extends Banco{
	
	// Atributos de la clase Cajero
	protected String nomCaj = "";
	protected double montoRecaudado = 0;
	protected Cola colaClientes;
	
	// Constructor de la clase
	public Cajero() {
		
	}

	public String getNomCaj() {
		return nomCaj;
	}

	public void setNomCaj(String nomCaj) {
		this.nomCaj = nomCaj;
	}

	public double getMontoRecaudado() {
		return montoRecaudado;
	}

	public void setMontoRecaudado(double montoRecaudado) {
		this.montoRecaudado = montoRecaudado;
	}

	public Cola getColaClientes() {
		return colaClientes;
	}

	public void setColaClientes(Cola colaClientes) {
		this.colaClientes = colaClientes;
	}
	
	
	// Getters y Setters de la clase Cajero
	
	
}
