package Modelo;

/**
* Proyecto Programado #1
* Alumnos> Gerardo Gael Rojas Ramos - Jeremy Pizarro Chaves 
* Carnet>  			C26860  		- 		C25992
* Profesor> Kenneth Sanchez
* 13/06/2023
*/

import java.util.Date;

public class Tarjeta {

	// Atributos de la clase
	int numeroTarjeta = 0;
	String casaEmisora = "";

	Date fecha;
	String lugarCompra = "";
	double montoCompra = 0;

	// Constructor de la clase
	public Tarjeta() {

	}

//Getters y setters

	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getCasaEmisora() {
		return casaEmisora;
	}

	public void setCasaEmisora(String casaEmisora) {
		this.casaEmisora = casaEmisora;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getLugarCompra() {
		return lugarCompra;
	}

	public void setLugarCompra(String lugarCompra) {
		this.lugarCompra = lugarCompra;
	}

	public double getMontoCompra() {
		return montoCompra;
	}

	public void setMontoCompra(double montoCompra) {
		this.montoCompra = montoCompra;
	}

}
