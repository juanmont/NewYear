package controladores;

import java.util.ArrayList;

import noxevieja.Bebida;
import noxevieja.Mezcla;
import noxevieja.Persona;
import noxevieja.Principal;

public class Controlador {
	private Principal principal;
	
	public Controlador(){
		principal = new Principal();
	}
	
	public int sacaNumeroBebidas(Bebida b){
		return principal.calculaBotellas(b);
	}
	
	public int sacaNumeroMezcla(Mezcla m){
		return principal.calculaMezcla(m);
	}
	
	public ArrayList<Persona> devuelveListaPersonas(){
		return principal.getListaPersonas();
	}
	
	public ArrayList<Persona> devuelveListaBuscada(String buscado, boolean grupo){
		return principal.buscarPersonaOGrupo(buscado, grupo);
	}
}
