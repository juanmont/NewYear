package vista;

import java.util.Scanner;

import controladores.Controlador;
import noxevieja.Bebida;
import noxevieja.Mezcla;
import noxevieja.Persona;

public class Consola {
	private Controlador control;
	Scanner in;
	
	public Consola(){
		control = new Controlador();
		 in = new Scanner(System.in);
	}
	
	public void inicia(){
		System.out.println("1- muestra botellas alcohol");
		System.out.println("2- muestra botellas mezcla");
		System.out.println("3- muestra lista personas");
		System.out.println("4- buscar");
		System.out.print("Introduce una opcion (0 para salir):");
		int i = in.nextInt();
		int j;
		while(i != 0){
			j = 0;
			switch(i){
			case 1:
				for(Bebida b: Bebida.values())
					System.out.println(++j + "- " + b.toString()+": "+control.sacaNumeroBebidas(b));
				break;
			case 2:
				for(Mezcla m: Mezcla.values())
					System.out.println(++j + "- " + m.toString()+": "+control.sacaNumeroMezcla(m));
				break;
			case 3:
				for(Persona p: control.devuelveListaPersonas())
					System.out.println(++j + "- " + p.toString());
				break;
			case 4:
				System.out.println("¿buscas un grupo S/N?");
				String nombre, c = in.next();
				System.out.print("introduce el nombre: ");
				nombre = in.next();
				for(Persona p: control.devuelveListaBuscada(nombre, c.equalsIgnoreCase("S")))
					System.out.println(++j + "- " + p.toString());
				break;
			}
			System.out.println("1- muestra botellas alcohol");
			System.out.println("2- muestra botellas mezcla");
			System.out.println("3- muestra lista personas");
			System.out.println("4- buscar");
			System.out.print("Introduce una opcion (0 para salir):");
			i = in.nextInt();
		}
	}
	
}
