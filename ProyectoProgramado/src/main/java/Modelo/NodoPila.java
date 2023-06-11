package Modelo;

/**
* Proyecto Programado #1
* Alumnos> Gerardo Gael Rojas Ramos - Jeremy Pizarro Chaves 
* Carnet>  			C26860  		- 		C25992
* Profesor> Kenneth Sanchez
* 13/06/2023
*/

public class NodoPila {
	
	// Atributos de la clase
    public Tarjeta dato;
    public NodoPila siguiente;

    // Constructor de la clase Nodo de la Pila
    public NodoPila(Tarjeta entrada) {
        dato = entrada;
        siguiente = null;
        
    }
}
