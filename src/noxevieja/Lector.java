package noxevieja;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Lector {
	private Workbook  workbook;
	private Sheet sheet;
	private int numFilas;
	
	public Lector(){
		try {
			workbook = Workbook.getWorkbook(new File("prueba.xls"));
			sheet = workbook.getSheet(0);
			numFilas = sheet.getRows();
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			System.err.println("NO SE HA PODIDO ABRIR EL EXCEL");
			e.printStackTrace();
		}
	}
	
	public ArrayList<Persona> leerExcel(){
		Cell a1;
		Cell a2, a3, a5;
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		//VARIABLES PARA LA PERSONA
		Bebida b = Bebida.NINGUNA;
		Mezcla m = Mezcla.NINGUNA;
		Boolean pagado = false;
		Persona p = null;
		//////////////////////////
		String nombre= "";
		String[] s;
		int i = 0;
		a1 = sheet.getCell(0,0);
		nombre = a1.getContents();
		while(!nombre.equalsIgnoreCase("") && i < numFilas){
			s = nombre.split("\\(");
			nombre = s[0];
			s = s[1].split("\\)");
			int numPersonas = Integer.parseInt(s[0]);
			for(int j = 1;j <= numPersonas;j++){
				a1 = sheet.getCell(0,j); //NOMBRE

				a2 = sheet.getCell(1,j); //BEBIDA
				b = b.parseaBebida(a2.getContents());

				a3 = sheet.getCell(2,j); //MEZCLA
				m = m.getMezcla(a3.getContents());

				a5 = sheet.getCell(4,j); //PAGADO
				if(a5.getContents().equalsIgnoreCase("PAGADO"))
					pagado = true;

				p = new Persona(nombre,a1.getContents(), b, m, pagado);
				listaPersonas.add(p);
				i++;
			}
			i += 3;
			if(i < numFilas){
				a1= sheet.getCell(0,i);
				nombre = a1.getContents();
			}
		}
		
		for(Persona p2: listaPersonas){
			System.out.println(p2.toString());
		}
		return listaPersonas;
	}
	
}
