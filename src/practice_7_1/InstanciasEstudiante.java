package practice_7_1;

public class InstanciasEstudiante {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

		/*
		 * 5. Con la clase creada en el n�mero 4, cree tres instancias de la clase Estudiante de la tabla a continuaci�n:
		 * Nombre			Cr�ditos		Puntos de calidad
		 * Mary Jones		14				46
		 * John Stiner		60				173
		 * Ari Samala		31				69
		 */
		
		/*
		 * 6. Con las variables de instancias creadas en el punto 5, agregue 13 cr�ditos y 52 puntos de calidad al estudiante �Ari Samala�.
		 */
		
		Estudiante est01 = new Estudiante("Mary Jones", 14, 46);
		
		Estudiante est02 = new Estudiante("John Stiner", 60, 173);
		
		Estudiante est03 = new Estudiante("Ari Samala", 31, 69);
		
		est03.AddCreditosPuntosCalidad(31, 69);
	}

}
