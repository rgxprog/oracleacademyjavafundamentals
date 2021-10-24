package practice_7_1;

import java.util.Scanner;

public class CardTask {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*
		 * 7. Utilice la clase Carta (Card) de las diapositivas y pruebe el programa para asegurarse
		 *    de que funciona. Agregue una segunda Carta aleatoria.
		 */
		
		/*
		 * 8. Agregue un código a la clase Principal en el ejercicio 7 para hacer lo siguiente:
		 * 		a. Mostrar el valor en puntos total de las dos cartas aleatorias.
		 * 		b. Preguntar al usuario si quisiera otra carta. Si dicen Sí, mostrar la nueva
		 * 		   carta y los puntos para las 3 cartas en su “Mano”.
		 * 		c. Aplique un ciclo para permitir al usuario continuar agregando cartas a la mano
		 * 		   hasta que la cantidad de puntos llegue a 21 o el usuario decida no agregar más
		 * 		   cartas o el total de las cartas sea 5.
		 */
		
		// 7
		int suitNumber = (int)(Math.random() * 4.0 + 1);
		int faceNumber = (int)(Math.random() * 13.0 + 1);
		Card newCard = new Card(suitNumber, faceNumber);
		
		System.out.println(newCard);
		
		suitNumber = (int)(Math.random() * 4.0 + 1);
		faceNumber = (int)(Math.random() * 13.0 + 1);
		Card secondCard = new Card(suitNumber, faceNumber);
		
		System.out.println(secondCard);
		
		// 8
		Scanner sc = new Scanner(System.in);
		Card hand[] = new Card[5];
		hand[0] = newCard;
		hand[1] = secondCard;
		int cantidadCartas = 2;
		boolean continuar;
		String opcion;
		
		System.out.println("Puntaje total: " + getPuntaje(hand, cantidadCartas));
		
		continuar = true;
		while (continuar) {
			System.out.print("¿Quiere otra carta? S/N: ");
			opcion = sc.next();
			
			if (opcion.toUpperCase().compareTo("S") == 0) {
				suitNumber = (int)(Math.random() * 4.0 + 1);
				faceNumber = (int)(Math.random() * 13.0 + 1);
				hand[cantidadCartas] = new Card(suitNumber, faceNumber);
				
				System.out.println(hand[cantidadCartas]);
				cantidadCartas++;
				System.out.println("Puntaje total: " + getPuntaje(hand, cantidadCartas));

				if (getPuntaje(hand, cantidadCartas) >= 21 || cantidadCartas == 5)
					continuar = false;
			} else {
				continuar = false;
			}
		}

		if (getPuntaje(hand, cantidadCartas) > 21)
			System.out.println("Pierde ya que pasó de 21 puntos");
		else if (getPuntaje(hand, cantidadCartas) == 21)
			System.out.println("Ha ganado, obtuvo 21 puntos");
		else if (cantidadCartas == 5)
			System.out.println("No puede continuar, ya tiene 5 cartas");
		else
			System.out.println("Buen intento");

		System.out.println("Puntaje final: " + getPuntaje(hand, cantidadCartas));
		
		sc.close();
	}
	
	//-------------------------------------------
	
	private static int getPuntaje(Card cards[], int cantidadCartas) {
		int puntaje = 0;
		for (int i = 0; i < cantidadCartas; i++) {
			puntaje += cards[i].points;
		}
		
		return puntaje;
	}

}
