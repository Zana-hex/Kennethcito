package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
* Proyecto Programado #1
* Alumnos> Gerardo Gael Rojas Ramos - Jeremy Pizarro Chaves 
* Carnet>  			C26860  		- 		C25992
* Profesor> Kenneth Sanchez
* 13/06/2023
*/

import Modelo.*;
import Vista.*;

public class Controlador implements ActionListener{
	
	VistaMenu vMenu = new VistaMenu();
	ArrayList<Cajero> Cajeros = new ArrayList<Cajero>();
	
	// Constructor
	public Controlador() {		
		
		// Se agregan los actionlisteners a cada boton
		vMenu.getBtnCajeros().addActionListener(this);
		vMenu.getBtnClientes().addActionListener(this);
		vMenu.getBtnBanco().addActionListener(this);
		vMenu.getBtnSalir().addActionListener(this);
	}

	public void actionPerformed(ActionEvent Menu) { // Empieza listener de la ventana de Menu
		
		if(Menu.getSource() == vMenu.getBtnCajeros()) { // Empieza funcion del boton "Ingresar Cajeros"
			
			final VistaIngCajeros vCajero = new VistaIngCajeros();
			
			ActionListener listenerIngresoCaj = new ActionListener() { // Empieza listener de la ventana de Cajero

				
				public void actionPerformed(ActionEvent ing) { // Empieza método accionamiento la ventana de Cajero
					
					if (ing.getSource() == vCajero.getBtnAceptar()) { // Empieza funcion del boton Aceptar de la ventana de Cajero
						int contador = 1;
						
						while (contador == 10) {
						if (vCajero.getTextNomCajero().getText().equals("")) {
							JOptionPane.showMessageDialog(null, "¡No ha ingresado todos los datos", "Advertencia",
									JOptionPane.WARNING_MESSAGE);
						} else {
							
							Cajero caj = new Cajero();
							caj.setNomCaj(vCajero.getTextNomCajero().getText());
							Cajeros.add(caj);
							
							contador++;
							vCajero.dispose();
							
						}
						}
					} // Termina funcion del boton Aceptar de la ventana de Cajero
					
					if (ing.getSource() == vCajero.getBtnCancelar()) { // Empieza funcion del boton Cancelar de la ventana de Cajero
						int a = JOptionPane.showConfirmDialog(vCajero, "¿Está seguro de que desea cancelar el proceso?", "Confirmación",
								JOptionPane.YES_NO_OPTION);
						if (JOptionPane.YES_NO_OPTION == a) {
							
							vCajero.dispose();
						}
					} // Termina funcion del boton Cancelar de la ventana de Cajero

				} // Termina metodo accionamiento de la ventana de Cajero

			}; // Termina listener de la ventana de Cajero
			
			// Agregar los actionlistener a cada boton
			vCajero.getBtnAceptar().addActionListener(listenerIngresoCaj);
			vCajero.getBtnCancelar().addActionListener(listenerIngresoCaj);
			
		} // Terminas funcion del boton "Ingresar Cajeros"
		
	} // Termina listerner de la ventana de Menu
}
