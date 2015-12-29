package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import controladores.Controlador;

public class VentanaPrincipal extends JFrame{
	
	private VentanaTabla vTablaPersonas;
	private VentanaCentral vCentral;
	
	public VentanaPrincipal(Controlador control){
		
		this.setLayout(new BorderLayout());
		String[] s = {"Nombre", "Bebida", "Mezcla"};
		vTablaPersonas = new VentanaTabla(s);
		vTablaPersonas.cargaTabla(control.devuelveListaPersonas());
		
		vCentral = new VentanaCentral(control);
		
		this.add(vTablaPersonas, BorderLayout.WEST);
		this.add(vCentral, BorderLayout.CENTER);
		
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
