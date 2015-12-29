package noxevieja;

public enum Bebida {
	BARCELO(Tipo.RON), BRUGAL(Tipo.RON), BEFEATER(Tipo.GINEBRA), DYC(Tipo.WIHSKY), PUERTODEINDIAS(Tipo.GINEBRA),NINGUNA;
	private Tipo t;
	Bebida(Tipo t){
		this.t = t;
	}
	Bebida(){
		;
	}
	
	public Tipo getTipo(){
		return t;
	}
	
	public Bebida parseaBebida(String bebida){
		bebida = bebida.toUpperCase();
		switch(bebida){
		case "BARCELO":
			return BARCELO;
		case "BRUGAL":
			return BRUGAL;
		case "BEFEATER":
			return BEFEATER;
		case "DYC":
			return DYC;
		case "PUERTODEINDIAS":
			return PUERTODEINDIAS;
		}
		return NINGUNA;
	}
	
	public String toString(){
		switch(this){
		case BARCELO:
			return "BARCELO";
		case BRUGAL:
			return "BRUGAL";
		case BEFEATER:
			return "BEFEATER";
		case DYC:
			return "DYC";
		case PUERTODEINDIAS:
			return "PUERTODEINDIAS";
		}
		return "NINGUNA";
	}
}
