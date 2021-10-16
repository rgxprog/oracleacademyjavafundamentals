package practice_5_1;

import java.util.Scanner;

public class Pintura {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		
		/*
		 * 7. Escriba un programa que calcule el n�mero de botes de pintura necesarios para pintar
		 *    una habitaci�n y el n�mero �ptimo de botes que debe comprar.
		 *    Tiene que preguntar por la altura, el largo y el ancho de la habitaci�n.
		 *    La habitaci�n es rectangular. Tiene que pintar las paredes y el techo pero no el suelo.
		 *    No hay ventanas ni tragaluces. Puede comprar botes de pintura de los siguientes tama�os.
		 *    � El bote de 5 litros cuesta 15 $ y es suficiente para pintar 1500 pies cuadrados.
		 *    � El bote de 1 litro cuesta 4 $ y es suficiente para pintar 300 pies cuadrados
		 */
		
		int altura, largo, ancho;
		int piesCuadrados;
		int botes_5_litros, botes_1_litro;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Altura, largo y ancho en pies");
		System.out.print("Altura: ");
		altura = sc.nextInt();
		System.out.print("Largo: ");
		largo = sc.nextInt();
		System.out.print("Ancho: ");
		ancho = sc.nextInt();
		
		piesCuadrados =
			2 * (largo * altura) +	// 2 paredes: izquierda y derecha
			2 * (ancho * altura) +	// 2 paredes: frente, atr�s
			ancho * largo;			// Techo
		
		System.out.println(piesCuadrados + " pies cuadrados");

		botes_5_litros = piesCuadrados / 1500;
		piesCuadrados = piesCuadrados - botes_5_litros * 1500;
		botes_1_litro = piesCuadrados / 300;
		piesCuadrados = piesCuadrados - botes_1_litro * 300;
		botes_1_litro += piesCuadrados > 0 ? 1 : 0;
		
		System.out.println(botes_5_litros + " botes de 5 litros (15$ c/u), total $" + botes_5_litros * 15 + " (" + botes_5_litros * 1500 + " pies cuadrados)");
		System.out.println(botes_1_litro + " botes de 1 litro (4$ c/u), total $" + botes_1_litro * 15 + " (" + botes_1_litro * 300 + " pies cuadrados)");
	}

}
