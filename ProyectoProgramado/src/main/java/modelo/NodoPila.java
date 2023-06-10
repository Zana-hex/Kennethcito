/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ikyge
 */
public class NodoPila {

    public Tarjeta dato;
    public NodoPila siguiente;

    public NodoPila(Tarjeta entrada) {
        dato = entrada;
        siguiente = null;
        
    }
}
