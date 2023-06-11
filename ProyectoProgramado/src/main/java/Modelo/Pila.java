package Modelo;

/**
* Proyecto Programado #1
* Alumnos> Gerardo Gael Rojas Ramos - Jeremy Pizarro Chaves 
* Carnet>  			C26860  		- 		C25992
* Profesor> Kenneth Sanchez
* 13/06/2023
*/

import javax.swing.JOptionPane;

public class Pila {
	
	// Atributos de la clase Pila
    private NodoPila pila;
    private int tamaño;

    // Constructor de la clase
    public Pila() {
        pila = null;
    }

    // Verifica si la pila está vacía
    public boolean siVacio() {
        return (this.pila == null);

    }

    // Inserta nodos en la pila
    public void Push(Tarjeta X) {
        NodoPila nuevoNodo = new NodoPila(X);
        
        if(siVacio()){
        nuevoNodo.siguiente = null;
        pila = nuevoNodo;
        } else {
        nuevoNodo.siguiente = pila;
        pila = nuevoNodo;
        }
        tamaño++;
    }

    // Extrae nodos en la pila
   public Tarjeta Pop(){	
	  if (tamaño != 0) {
      NodoPila temporal;
      temporal = pila;
      Tarjeta datoGod = temporal.dato;
      pila = pila.siguiente;
      temporal.siguiente = null;
      tamaño--;
      return datoGod;
	  }
	  return null;
   }
   
   // Muestra los nodos que hay en la pila
   public void Mostrar(){
        if (tamaño != 0) {
            NodoPila temp = pila;
            String str = "";
            for (int i = 0; i < this.tamaño; i++) {
                int suma = (i+1);
                str = str + "\n\nInformacion de la orden N°"+ suma + "\n\n" + temp.dato;
                temp = temp.siguiente;
            }
            JOptionPane.showMessageDialog(null,"ANFI S.A \nPila de ordenes de servicios:" + str);

        }
   }



}
