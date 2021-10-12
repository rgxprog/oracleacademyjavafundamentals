package practice_4_3;

import java.util.Scanner;

public class AutobusFurgonetas {

	/*
	 * 3. Un autob�s lleva 45 personas.
	 *    El colegio solo utilizar� el autob�s si puede llenarlo del todo.
	 *    El resto de personas ir� en furgonetas.
	 *    Escriba un programa que registre el n�mero de personas que se han apuntado para ir de viaje.
	 *    Haga que el programa muestre el n�mero necesario de autobuses y, despu�s,
	 *    el n�mero total de personas que tendr� que viajar en furgonetas. 
	 */
	
	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

		Scanner scan = new Scanner(System.in);
		final int AUTOBUS_MAX = 45;
		int personas;

		System.out.println("1 autob�s = 45 personas");
		
		System.out.print("�Cu�ntas personas viajan?: ");
		personas = scan.nextInt();
		
		System.out.println("Autobuses necesarios: " + personas / AUTOBUS_MAX);
		System.out.println("Personas que ir�n en furgonetas: " + personas % AUTOBUS_MAX);
	}

}
