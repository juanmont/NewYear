package vista;

import java.util.Scanner;

import controladores.Controlador;
import noxevieja.Bebida;
import noxevieja.Mezcla;

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
		
		while(i != 0){
			switch(i){
			case 1:
				for(Bebida b: Bebida.values())
					System.out.println(b.toString()+": "+control.sacaNumeroBebidas(b));
				break;
			case 2:
				for(Mezcla m: Mezcla.values())
					System.out.println(m.toString()+": "+control.sacaNumeroMezcla(m));
				break;
			case 3:
				break;
			case 4:
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
