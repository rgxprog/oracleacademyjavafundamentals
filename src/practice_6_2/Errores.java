package practice_6_2;

public class Errores {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*
		 * 4. Escriba un segmento de código que tenga:
		 * 		a. Un error de sintaxis.
		 * 		b. Un error lógico.
		 * 		c. Una excepción.
		 */
		
		// a. error de sintaxis
		int x;
		x = "hola";
		
		// b. error lógico
		while(x > 10);
			System.out.println("No estoy dentro del while");
		
		// c. excepción
		try {
			x = 2 / 0;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getMessage());
		}
	}

}
