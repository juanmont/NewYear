package vista;

import java.awt.GridLayout;

import javax.swing.JPanel;

import controladores.Controlador;

public class VentanaCentral extends JPanel{
	
	private VentanaTabla vTablaBebida;
	private VentanaTabla vTablaMezcla;
	private VentanaBusqueda vBusqueda;
	private Controlador controlador;
	
	public VentanaCentral(final Controlador control){
		controlador = control;
		vBusqueda = new VentanaBusqueda();
		String[] sBebidas = {"Nombre", "Nº Personas"};
		vTablaBebida = new VentanaTabla(sBebidas);
		String[] sMezclas = {"Nombre", "Nº Personas"};
		vTablaMezcla = new VentanaTabla(sMezclas);
		
		this.setLayout(new GridLayout(3, 1));
		this.add(vBusqueda);
		this.add(vTablaBebida);
		this.add(vTablaMezcla);
		
		this.setVisible(true);
	}

}
