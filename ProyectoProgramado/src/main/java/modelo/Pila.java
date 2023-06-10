package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author ikyge
 */
public class Pila {

    private NodoPila pila;
    private int tamaño;

    public Pila() {
        pila = null;
    }

    public boolean siVacio() {
        return (this.pila == null);

    }

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
