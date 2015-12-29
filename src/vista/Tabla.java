package vista;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabla extends JTable {
	public Tabla(DefaultTableModel tableModel) {
		super(tableModel);
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
	    return false;  //
	}
}
