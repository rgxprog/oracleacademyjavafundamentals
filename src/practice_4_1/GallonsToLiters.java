package practice_4_1;

import java.util.Scanner;

public class GallonsToLiters {

	/*
	 * ...
	 * 2. En la lección se ha descripto el pseudocódigo utilizado para convertir galones a litros.
	 *    Escriba el código para el programa.
	 *    El programa convertirá una cantidad específica de galones a litros y luego mostrará el resultado. 
	 * 3. Modifique el código escrito en el paso 2 para indicar al usuario la cantidad de galones que se deben calcular.
	 */
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

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
