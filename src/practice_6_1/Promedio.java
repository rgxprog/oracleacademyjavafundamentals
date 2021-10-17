package practice_6_1;

import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*
		 * 7. En una clase determinada, existen 5 pruebas que valen 100 puntos cada una.
		 *    Escriba un programa que tome los 5 resultados de las pruebas para el usuario,
		 *    guarde los resultados de las pruebas en un array y, luego, calcule el promedio de los estudiantes.
		 */
		
		Scanner sc = new Scanner(System.in);
		int resultados[] = new int[5];
		int sumatoria;
		double promedio;
		
		for (int i = 0; i < resultados.length; i++) {
			System.out.print("Nota " + (i + 1) + ": ");
			resultados[i] = sc.nextInt();
		}
		
		sumatoria = 0;
		for (int i = 0; i < resultados.length; i++) {
			sumatoria += resultados[i];
		}
		promedio = sumatoria / resultados.length;
		
		System.out.println("Promedio: " + promedio);
	}

}
