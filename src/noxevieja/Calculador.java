package noxevieja;

public class Calculador {
	public int calculaBotellasAlcoholOMezcla(int personas, boolean mezcla){
		double calculo = 0.66;
		if(mezcla)
			calculo = 0.75;
		int numB = (int) (personas*calculo);
		if(personas > 0 && numB == 0)
			numB = 1;
		return numB;
	}
}
