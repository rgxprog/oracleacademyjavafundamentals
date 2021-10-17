package practice_5_2;

import java.util.Scanner;

public class Secreto {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*
		 * 1. Suponga que se le pide decodificar un mensaje secreto. El mensaje codificado se encuentra en números y cada número
		 *    representa una letra específica. Descubre lo suficiente del código secreto para decodificar el mensaje actual. Hasta ahora,
		 *    sabe lo siguiente:
		 *    • 1 representa “D”
		 *    • 2 representa “W”
		 *    • 3 representa “E”
		 *    • 4 representa “L”
		 *    • 5 representa “H”
		 *    • 6 representa “O”
		 *    • 7 representa “R”
		 *    Escriba programa que pida al usuario 10 números, uno a la vez, e imprima el mensaje decodificado. Si el usuario ingresa
		 *    un número que no se encuentra entre esos números ya descifrados, pídale un nuevo número. Pruebe el código con la
		 *    siguiente entrada: 5 3 4 4 6 2 6 7 4 1
		 */
		
		Scanner sc = new Scanner(System.in);
		int numero;
		boolean continuar;
		String mensaje;
		
		System.out.println("Digite el código (números de 1 a 7) seguido de [ENTER] por cada número");
		System.out.println("Para finalizar digite un número diferente de 1 a 7");
		
		continuar = true;
		mensaje = "";
		while (continuar) {
			System.out.print("[1..7]: ");
			numero = sc.nextInt();
			
			switch (numero) {
				case 1:
					mensaje += "D";
					break;
				case 2:
					mensaje += "W";
					break;
				case 3:
					mensaje += "E";
					break;
				case 4:
					mensaje += "L";
					break;
				case 5:
					mensaje += "H";
					break;
				case 6:
					mensaje += "O";
					break;
				case 7:
					mensaje += "R";
					break;

				default:
					continuar = false;
			}
		}
		
		System.out.println(mensaje);
	}

}
