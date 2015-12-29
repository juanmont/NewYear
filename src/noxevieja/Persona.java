package noxevieja;

public class Persona {
	private String nombre;
	private Bebida bebida;
	private Mezcla mezcla;
	private boolean pagado;
	private String idGrupo;
	
	public Persona(String idG,String n, Bebida b, Mezcla m, boolean pa){
		idGrupo = idG;
		nombre = n;
		bebida = b;
		mezcla = m;
		pagado = pa;
	}
	
	public String getIdG(){
		return idGrupo;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public boolean getPagado(){
		return pagado;
	}
	
	public Bebida getBebida(){
		return bebida;
	}
	
	public Tipo getTipoBebida(){
		return bebida.getTipo();
	}
	
	public Mezcla getMezcla(){
		return mezcla;
	}
	
	public void setNombre(String n){
		nombre = n;
	}
	
	public void setPagado(boolean pa){
		pagado = pa;
	}
	
	public void setBebida(Bebida b){
		bebida = b;
	}
	
	public void setMezcla(Mezcla m){
		mezcla = m;
	}
	
	public String toString(){
		return nombre + "\n" + bebida + "\n";
	}
}
