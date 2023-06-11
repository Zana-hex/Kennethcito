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
import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VistaMenu extends JFrame {

	private static final long serialVersionUID = 1L;

	JPanel contentPane;
	JButton btnCajeros, btnClientes, btnBanco, btnSalir;
	public VistaMenu() {
		// setIconImage(Toolkit.getDefaultToolkit().getImage(VistaMenu.class.getResource("/Vista/imagenes/iconoUser.png")));
		setTitle("Menu Banco");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 569);
		setLocationRelativeTo(null); // Centrar el JFrame
		contentPane = new JPanel();
		contentPane.setBackground(new Color(150, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		//	JLabel fondoMenu = new JLabel(); //Inserta una imagen como fondo del menú principal
		//	fondoMenu.setBounds(0, -25, 730, 569);
		//	fondoMenu.setIcon(new ImageIcon(VistaMenu.class.getResource("/Vista/imagenes/fondo.jpg")));
		

		/**************************
		 * Config. Botones
		 ******************************************************************/

		btnCajeros = new JButton("Ingresar Cajeros");
		btnCajeros.setBounds(242, 107, 210, 50);
		btnCajeros.setFont(new Font("Arial", Font.BOLD, 16));
		btnCajeros.setBackground(new Color(255,255,255));
		// btnIngresar.setIcon(new ImageIcon(VistaMenu.class.getResource("/Vista/imagenes/agregarUser.jpg")));
		contentPane.setLayout(null);
		contentPane.add(btnCajeros);

		btnClientes = new JButton("Clientes");
		btnClientes.setBounds(242, 190, 210, 50);
		btnClientes.setFont(new Font("Arial", Font.BOLD, 16));
		btnClientes.setBackground(new Color(255,255,255));
		// btnActualizar.setIcon(new ImageIcon(VistaMenu.class.getResource("/Vista/imagenes/actualizarUser.png")));
		contentPane.add(btnClientes);

		btnBanco = new JButton("Banco");
		btnBanco.setBounds(242, 273, 210, 50);
		btnBanco.setFont(new Font("Arial", Font.BOLD, 16));
		btnBanco.setBackground(new Color(255,255,255));
		// btnBuscar.setIcon(new ImageIcon(VistaMenu.class.getResource("/Vista/imagenes/buscarUser.png")));
		contentPane.add(btnBanco);

		btnSalir = new JButton("Salir");
		btnSalir.setBounds(242, 439, 210, 50);
		btnSalir.setFont(new Font("Arial", Font.BOLD, 16));
		btnSalir.setBackground(new Color(255,255,255));
		// btnSalir.setIcon(new ImageIcon(VistaMenu.class.getResource("/Vista/imagenes/salir.png")));
		contentPane.add(btnSalir);

		
		// contentPane.add(fondoMenu);
		setVisible(true);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JButton getBtnCajeros() {
		return btnCajeros;
	}

	public JButton getBtnClientes() {
		return btnClientes;
	}

	public JButton getBtnBanco() {
		return btnBanco;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	
	
}