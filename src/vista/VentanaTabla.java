package vista;

import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import noxevieja.Persona;

public class VentanaTabla extends JScrollPane{
	private DefaultTableModel tableModel;
	JTable tabla;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public VentanaTabla(String[] s){
		tableModel = new DefaultTableModel(s, 0);
		tabla = new Tabla(tableModel);
		this.setViewportView(tabla);
		this.setVisible(true);
	}
	
	public void cargaTabla(ArrayList<Persona> lista){
		borraTableModel();
		for(Persona p: lista){
			Object[] data = {p.getNombre(), p.getBebida(), p.getMezcla()};
			tableModel.addRow(data);
		}
	}
	
	private void borraTableModel(){
		int filas = tableModel.getRowCount();
		 for (int i = 0;filas>i; i++) {
             tableModel.removeRow(0);
         }
	}
	

}
