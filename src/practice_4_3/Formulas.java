package practice_4_3;

public class Formulas {

	/*
	 * 2. Escriba las siguientes f�rmulas matem�ticas en Java.
	 *    Tendr� que usar m�todos de la clase Math as� como una incrustaci�n de m�todos y par�ntesis
	 *    para forzar el orden de las operaciones y calcular correctamente la respuesta.
	 *    Suponga que todas las variables de las f�rmulas ya se han declarado e inicializado. 
	 */
	
	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		
		int x, y, z;
		
		x = 2;
		y = 3;
		z = 4;
		
		// a.
		double a = Math.sqrt(Math.pow(x, 5) - 6) / 4;
		
		// b.
		double b = Math.pow(x, y) - Math.pow(6, x);
		
		// c.
		double c = 4 * Math.cos(z / 5) - Math.pow(Math.sin(x), 2);
		
		// d.
		double d = Math.pow(x, 4) - Math.sqrt(6 * x - Math.pow(y, 3));
	
		// e.
		double e = 1 / (y - 1 / (x - Math.pow(2, y)));
		
		// f.
		double f = 7 * Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3 * x - 4))));
	}

}
