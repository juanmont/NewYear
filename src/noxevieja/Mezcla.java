package noxevieja;

public enum Mezcla {
	NARANJA, LIMON, SPRITE, COCACOLA,NINGUNA;
	
	public Mezcla getMezcla(String m){
		m = m.toUpperCase();
		switch(m){
		case "NARANJA":
			return NARANJA;
		case "LIMON":
			return LIMON;
		case "SPRITE":
			return SPRITE;
		case "COCACOLA":
			return COCACOLA;
		}
		return NINGUNA;
	}
	
	public String toString(){
		switch(this){
		case NARANJA:
			return "NARANJA";
		case LIMON:
			return "LIMON";
		case SPRITE:
			return "SPRITE";
		case COCACOLA:
			return "COCACOLA";
		}
		return "NINGUNA";
	}
}
