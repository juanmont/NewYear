package vista;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaBusqueda extends JPanel{
	
	private JTextField texto;
	private JButton boton;
	
	public VentanaBusqueda(){
		texto = new JTextField();
		boton = new JButton("Buscar");
		//this.setLayout(new GridLayout(1, 2));
		texto.setPreferredSize(new Dimension(300, 50));
		boton.setPreferredSize(new Dimension(100, 50));
		this.add(texto);
		this.add(boton);
		this.setVisible(true);
	}

}
