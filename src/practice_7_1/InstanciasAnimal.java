package practice_7_1;

public class InstanciasAnimal {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		
		/*
		 * 3. Escriba el c�digo para crear dos instancias de la plantilla de clase Animal incluida en el
		 * problema n�mero 2. Aseg�rese de utilizar ambos constructores proporcionados. Luego, agregue un
		 * c�digo Java que imprimir� lo siguiente:
		 * 		a. El animal 1 tiene una velocidad de ___.
		 * 		b. El animal 2 tiene una velocidad de ___.
		 * Aseg�rese de que los espacios en blanco se completen autom�ticamente con las velocidades reales.
		 * Utilice los m�todos proporcionados para acceder a las velocidades.
		 */
		
		// Usando primer constructor
		Animal animal1 = new Animal();
		System.out.println("El animal 1 tiene una velocidad de " + animal1.getSpeed());
		
		// Usando segundo constructor
		Animal animal2 = new Animal(60, 5, 1);
		System.out.println("El animal 1 tiene una velocidad de " + animal2.getSpeed());
	}

}
