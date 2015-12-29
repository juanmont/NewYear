import controladores.Controlador;
import vista.Consola;
import vista.VentanaPrincipal;

public class Main {

	public static void main(String[] args) {
		/*Consola c = new Consola();
		
		c.inicia();*/
		Controlador control = new Controlador();
		
		VentanaPrincipal ventana = new VentanaPrincipal(control);
	}

}
