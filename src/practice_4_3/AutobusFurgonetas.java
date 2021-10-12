package practice_4_3;

import java.util.Scanner;

public class AutobusFurgonetas {

	/*
	 * 3. Un autobús lleva 45 personas.
	 *    El colegio solo utilizará el autobús si puede llenarlo del todo.
	 *    El resto de personas irá en furgonetas.
	 *    Escriba un programa que registre el número de personas que se han apuntado para ir de viaje.
	 *    Haga que el programa muestre el número necesario de autobuses y, después,
	 *    el número total de personas que tendrá que viajar en furgonetas. 
	 */
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner scan = new Scanner(System.in);
		final int AUTOBUS_MAX = 45;
		int personas;

		System.out.println("1 autobús = 45 personas");
		
		System.out.print("¿Cuántas personas viajan?: ");
		personas = scan.nextInt();
		
		System.out.println("Autobuses necesarios: " + personas / AUTOBUS_MAX);
		System.out.println("Personas que irán en furgonetas: " + personas % AUTOBUS_MAX);
	}

}
