package practice_6_1;

import java.util.Scanner;

public class DeckTask {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*
		 * 9. Escriba el código y prueba. Añadir las siguientes características.
		 * 		A. Agregue un método para mezclar a la clase Deck. Llame al método desde la
		 * 		   clase Main (principal) para verificar que el mazo esté verdaderamente mezclado.
		 * 		B. Agregue una clase Hand (mano) que contenga un array de 5 referencias de cartas.
		 * 		   Haga al programa repartir dos cartas por mano y mostrarlas al usuario. Indique al
		 * 		   usuario cuántos puntos tiene y pregunte a dicho usuario si quiere otra carta o no.
		 * 		   Continúe y permítale al jugador agregar cartas hasta llegar a 5 cartas o hasta que
		 * 		   el total sea mayor a 21.
		 * 		C. Ajuste la clase Card (carta) para permitir a los Ases que cuenten como 11 para
		 * 		   comenzar. Si la clase Hand tiene un valor mayor a 21, haga que la clase Hand verifique
		 * 		   los Ases y reduzca el valor de puntos a 1.
		 * 		D. Haga al programa crear una Mano del crupier contra la cual pueda jugar el usuario.
		 * 		   El usuario debe tratar de acercarse lo más posible a 21 sin pasarse para vencer al Crupier.
		 * 		   Si el Crupier tiene 16 o más, éste deberá dejar de tomar cartas.
		 */

		Scanner sc = new Scanner(System.in);
		Deck d = new Deck();
		Hand handPlayer = new Hand();
		Hand handCpu = new Hand();
		boolean continuar;
		String otraCarta;
		
		d.mezclar();

		handPlayer.AddCard(d.tomarCarta());
		handPlayer.AddCard(d.tomarCarta());
		
		continuar = true;
		while (continuar) {
			handPlayer.print();
			System.out.print("¿Otra carta? S/N: ");
			otraCarta = sc.next();
			
			if (otraCarta.toUpperCase().compareTo("S") == 0) {
				handPlayer.AddCard(d.tomarCarta());
				if (handPlayer.puntaje > 21 || handPlayer.cardsCount == 5)
					continuar = false;
			} else {
				continuar = false;
			}
		}

		System.out.println("Su mano final: ");
		handPlayer.print();
		if (handPlayer.puntaje == 21)
			System.out.println("Ha ganado, tiene 21");
		else if (handPlayer.puntaje > 21)
			System.out.println("Ha perdido, se pasó de 21");
		else {
			
			continuar = true;
			while (continuar) {
				handCpu.AddCard(d.tomarCarta());
				
				if (handCpu.puntaje > handPlayer.puntaje || handCpu.cardsCount == 5 || handCpu.puntaje > 16) {
					continuar = false;
				}
			}
			
			System.out.println("Mano final de la casa:");
			handCpu.print();
			
			if (handCpu.puntaje > 21)
				System.out.println("Usted gana, la casa se pasó de 21");
			else if (handCpu.puntaje > handPlayer.puntaje)
				System.out.println("La casa gana con " + handCpu.puntaje + " puntos, usted obtuvo menos puntos: " + handPlayer.puntaje);
			else if (handCpu.puntaje == handPlayer.puntaje)
				System.out.println("Empate, nadie gana");
			else
				System.out.println("Usted gana con " + handPlayer.puntaje + " puntos");
		}
	
		//d.print();	// Mostrar todo el Deck
		sc.close();
	}

}
