package practice_5_1;

import java.util.Scanner;

public class Universidad {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*
		 * 5. Un programa que decida si un estudiante cumple los requisitos para entrar en la
		 *    Universidad de Mountville. Los estudiantes deben cumplir uno de los criterios siguientes:
		 *    • Haber sido el estudiante con la clasificación más alta o la segunda más alta de
		 *      un instituto con un número de alumnos igual o superior a 1400
		 *    • Tener una nota media igual o superior a 4,0 y una puntuación SAT igual o superior a 1100
		 *    • Tener una nota media igual o superior a 3,5 y una puntuación SAT igual o superior a 1300
		 *    • Tener una nota media igual o superior a 3,0 y una puntuación SAT igual o superior a 1500
		 */
		
		Scanner sc = new Scanner(System.in);
		int cantAlumnos, puntSAT;
		String clasifSN;
		double notaMedia;
		
		System.out.print("Cantidad de alumnos de su institución de procedencia: ");
		cantAlumnos = sc.nextInt();
		System.out.print("Obtuvo clásificación más alta o segunda más alta en su instituto de procedencia S/N: ");
		clasifSN = sc.next();
		System.out.print("Nota media: ");
		notaMedia = sc.nextDouble();
		System.out.print("Puntuación SAT: ");
		puntSAT = sc.nextInt();
		
		if (	(cantAlumnos >= 1400 && (clasifSN.compareTo("S") == 0 || clasifSN.compareTo("s") == 0))
				|| (notaMedia >= 4.0 && puntSAT >= 1100)
				|| (notaMedia >= 3.5 && puntSAT >= 1300)
				|| (notaMedia >= 3.0 && puntSAT >= 1500)
		) {
			System.out.println("Cumple requisistos para entrar a universidad");
		} else {
			System.out.println("No cumple requisistos para entrar a universidad");
		}
	}

}
