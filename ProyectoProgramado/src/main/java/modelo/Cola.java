/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author ikyge
 */
public class Cola {

    private NodoCola inicio, ultimo;
    private int tamaño;

    public Cola() {

        inicio = null;
        ultimo = null;
        this.tamaño = 0;

    }

    public boolean siVacio() {
        return (this.inicio == null);

    }

    public void Insertar(Cajero dato) {
        NodoCola nuevoNodo = new NodoCola();
        nuevoNodo.dato = dato;
        nuevoNodo.siguiente = null;

        if (siVacio()) {
            inicio = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;
        }
        tamaño++;
    }

    public Cajero Extraer() {
        Cajero dato;

        if (!siVacio()) {
            dato = inicio.dato;
            if (inicio == ultimo) {
                inicio = null;
                ultimo = null;
            } else {
                inicio = inicio.siguiente;
            }
            tamaño--;
            return dato;
        } 
        return null;
        
    }

    public void MostrarCola() {
        if (tamaño != 0) {
            NodoCola temp = inicio;
            String str = "";
            for (int i = 0; i < this.tamaño; i++) {
                int suma = (i+1);
                str = str + "\n\nInformacion de la orden N°"+ suma + "\n\n" + temp.dato;
                temp = temp.siguiente;
            }
            JOptionPane.showMessageDialog(null,"ANFI S.A \nCola de ordenes de servicios:" + str);

        }
    }

    public int getTamaño() {
        return tamaño;
    }

    public NodoCola getInicio() {
        return inicio;
    }

    public NodoCola getUltimo() {
        return ultimo;
    }
    
}
