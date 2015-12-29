package noxevieja;

import java.util.ArrayList;

public class Principal {
	private ArrayList<Persona> listaPersonas;
	private Calculador calculadora;
	Lector l;
	
	public Principal(){
		listaPersonas = new ArrayList<Persona>();
		calculadora = new Calculador();
		l = new Lector();
		listaPersonas = l.leerExcel();
	}
	
	/**
	 * Calcula el numero de botellas para la mezcla indicada
	 * @param b: botella de alcohol a buscar
	 * @return: numero de botellas;
	 */
	public int calculaBotellas(Bebida b){
		int numeroPersonas = 0;
		for(Persona p: listaPersonas){
			if(b==p.getBebida()) 
				numeroPersonas++;
		}
		return calculadora.calculaBotellasAlcoholOMezcla(numeroPersonas, false);
	}
	
	/**
	 * Calcula el numero de botellas para la mezcla indicada
	 * @param m: mezcla a buscar
	 * @return: numero de botellas;
	 */
	public int calculaMezcla(Mezcla m){
		int numeroPersonas = 0;
		for(Persona p: listaPersonas){
			if(m==p.getMezcla()) 
				numeroPersonas++;
		}
		return calculadora.calculaBotellasAlcoholOMezcla(numeroPersonas, true);
	}
	
	/**
	 * Este metodo busca grupos o personas con un nombre determinado
	 * @param buscado: nombre buscado
	 * @param grupo: indica si hay que buscar un grupo o a personas
	 * @return: lista de las personas encontradas
	 */
	public ArrayList<Persona> buscarPersonaOGrupo(String buscado, boolean grupo){
		ArrayList<Persona> listaBuscada = new ArrayList<Persona>();
		for(Persona p: listaPersonas){
			if(grupo){
				if(p.getIdG().equalsIgnoreCase(buscado)) 
					listaBuscada.add(p);
			}
			else{
				if(p.getNombre().equalsIgnoreCase(buscado)) 
					listaBuscada.add(p);
			}
		}
		return listaBuscada;

	}

	public ArrayList<Persona> getListaPersonas() {
		// TODO Auto-generated method stub
		return listaPersonas;
	}
}
