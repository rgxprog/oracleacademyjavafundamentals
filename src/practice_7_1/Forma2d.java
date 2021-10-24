package practice_7_1;

/*
 * 1. Cree una forma de clase simple que representa una forma en 2 dimensiones con segmentos de líneas para los bordes. Debe
 * tener la siguiente variable instancia: numSides (int), regular (booleano). Cree al menos dos constructores y métodos
 * captadores y establecedores.
 */

public class Forma2d {
	
	private int numSides;
	private boolean regular;
	
	//-------------------------------------------
	
	public Forma2d() {
		numSides = 3;
		regular = true;
	}
	
	public Forma2d(int numSides, boolean regular) {
		this.numSides = numSides;
		this.regular = regular;
	}
	
	//-------------------------------------------
	
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	public int getNumSides() {
		return numSides;
	}
	
	//-------------------------------------------
	
	public void setRegular(boolean regular) {
		this.regular = regular;
	}
	public boolean getRegular() {
		return regular;
	}

}
