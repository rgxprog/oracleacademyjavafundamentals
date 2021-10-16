package practice_5_1;

import java.util.Scanner;

public class PesoEnPlaneta {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		/*
		 * 4. Escriba un programa que determine su peso en otro planeta.
		 *    El programa debe pedir el peso del usuario en la Tierra y, después, mostrar un menú con otros
		 *    planetas del sistema solar. El usuario debe seleccionar uno de los planetas del menú.
		 *    El programa deberá mostrar la siguiente frase: “Your weight on Mars is 55 lbs.”.
		 *    Use los siguientes factores de conversión:
		 *    Planeta		Factor de conversión (multiplique su peso en la Tierra poreste número para determinar su peso en este planeta)
		 *    Mercurio		0.38
		 *    Venus			0.91
		 *    Marte			0.38
		 *    Júpiter		2.36
		 *    Saturno		0.92
		 *    Urano			0.89
		 *    Neptuno		1.13
		 */

		double pesoEnTierra, pesoEnPlaneta;
		int opcPlaneta;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Su peso en la Tierra (lbs.): ");
		pesoEnTierra = sc.nextDouble();
		
		System.out.println("1. Mercurio");
		System.out.println("2. Venus");
		System.out.println("3. Marte");
		System.out.println("4. Júpiter");
		System.out.println("5. Saturno");
		System.out.println("6. Urano");
		System.out.println("7. Neptuno");
		System.out.print("Seleccione un planeta: ");
		opcPlaneta = sc.nextInt();
		
		switch (opcPlaneta) {
		case 1:
			pesoEnPlaneta = pesoEnTierra * 0.38;
			break;
		case 2:
			pesoEnPlaneta = pesoEnTierra * 0.91;
			break;
		case 3:
			pesoEnPlaneta = pesoEnTierra * 0.38;
			break;
		case 4:
			pesoEnPlaneta = pesoEnTierra * 2.36;
			break;
		case 5:
			pesoEnPlaneta = pesoEnTierra * 0.92;
			break;
		case 6:
			pesoEnPlaneta = pesoEnTierra * 0.89;
			break;
		case 7:
			pesoEnPlaneta = pesoEnTierra * 1.13;
			break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcPlaneta);
		}
		
		System.out.println("Your weight on Mars is " + pesoEnPlaneta + " lbs.");
	}

}
