package Vista;

/**
* Proyecto Programado #1
* Alumnos> Gerardo Gael Rojas Ramos - Jeremy Pizarro Chaves 
* Carnet>  			C26860  		- 		C25992
* Profesor> Kenneth Sanchez
* 13/06/2023
*/

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class VistaIngCajeros extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	
	JPanel contentPane;
	JButton btnAceptar, btnCancelar;
	JTextField textNomCajero;
	
	public VistaIngCajeros() {
		
		/** Configuración gráfica de la ventana **/
		
		setBackground(new Color(28, 27, 77)); 
		setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		setTitle("Informaci\u00F3n de cajero");
		setBounds(100, 100, 730, 560);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setVisible(true);
		contentPane.setLayout(null);
		

		JPanel Panel = new JPanel();
		Panel.setBackground(new Color(28, 27, 77));
		Panel.setBounds(0, 0, 714, 521);
		contentPane.add(Panel);
		Panel.setLayout(null);
		
		
		
		JLabel datosCajero = new JLabel("Informaci\u00F3n del cajero");
		datosCajero.setFont(new Font("Serif", Font.BOLD, 32));
		datosCajero.setForeground(Color.white);
		datosCajero.setBounds(180, 38, 458, 38);
		Panel.add(datosCajero);	
		
		/** Etiquetas y espacios de ingreso del cajero **/

		Font font = new Font("Arial", Font.BOLD, 14);
		
		JLabel lNomCajero = new JLabel("Nombre del cajero: ");
		lNomCajero.setFont(new Font("Serif", Font.BOLD, 21));
		lNomCajero.setForeground(Color.white);
		lNomCajero.setBounds(97, 150, 136, 28);
		Panel.add(lNomCajero);
		

		textNomCajero = new JTextField();
		textNomCajero.setBounds(348, 140, 248, 37);
		textNomCajero.setHorizontalAlignment(SwingConstants.CENTER);
		textNomCajero.setFont(font);
		Panel.add(textNomCajero);
		
		/** Configuración del botón "Aceptar" **/
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Serif", Font.BOLD, 16));
		btnAceptar.setToolTipText("Aceptar");
		btnAceptar.setBounds(172, 425, 140, 40);
		btnAceptar.setBackground(Color.white);
		btnAceptar.setIcon(new ImageIcon(VistaMenu.class.getResource("/Vista/imagenes/aceptar.jpg")));
		Panel.add(btnAceptar);
		
		/** Configuración del botón cancelar **/
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Serif", Font.BOLD, 16));
		btnCancelar.setToolTipText("Cancelar");
		btnCancelar.setBounds(390, 425, 140, 40);
		btnCancelar.setBackground(Color.white);
		btnCancelar.setIcon(new ImageIcon(VistaMenu.class.getResource("/Vista/imagenes/cancelar.jpg")));
		Panel.add(btnCancelar);
		
		
		
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTextNomCajero() {
		return textNomCajero;
	}

	public JButton getBtnAceptar() {
		return btnAceptar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}
	
	
	
	
}
