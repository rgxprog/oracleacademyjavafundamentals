package practice_4_1;

import java.util.Scanner;

public class GallonsToLiters {

	/*
	 * ...
	 * 2. En la lecci�n se ha descripto el pseudoc�digo utilizado para convertir galones a litros.
	 *    Escriba el c�digo para el programa.
	 *    El programa convertir� una cantidad espec�fica de galones a litros y luego mostrar� el resultado. 
	 * 3. Modifique el c�digo escrito en el paso 2 para indicar al usuario la cantidad de galones que se deben calcular.
	 */
	
	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

		Scanner scan = new Scanner(System.in);
		float gallons, liters;
		final float galToLits = 3.78541f;
		
		System.out.print("Galones: ");
		gallons = scan.nextFloat();
		
		liters = gallons * galToLits;
		System.out.println(gallons + " gallons = " + liters + " liters");
		
		scan.close();
	}

}
