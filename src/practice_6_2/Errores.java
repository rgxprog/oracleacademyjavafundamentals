package practice_6_2;

public class Errores {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

		/*
		 * 4. Escriba un segmento de c�digo que tenga:
		 * 		a. Un error de sintaxis.
		 * 		b. Un error l�gico.
		 * 		c. Una excepci�n.
		 */
		
		// a. error de sintaxis
		int x;
		x = "hola";
		
		// b. error l�gico
		while(x > 10);
			System.out.println("No estoy dentro del while");
		
		// c. excepci�n
		try {
			x = 2 / 0;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getMessage());
		}
	}

}
