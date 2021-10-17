package practice_6_1;

public class Hand {

	Card handArray[] = new Card[10];
	int cardsCount = 0;
	int puntaje = 0;
	
	Hand() {
		for (int i = 0; i < handArray.length; i++) {
			handArray[i] = null;
		}
	}
	
	//-------------------------------------------
	
	public void AddCard(Card c) {
		handArray[cardsCount] = c;
		puntaje += c.points == 1 ? 11 : c.points;
		cardsCount++;
		
		if (puntaje > 21)
			refinarPuntajePorAses();
	}
	
	//-------------------------------------------
	
	public void print() {
		for(int i = 0; i < cardsCount; i++)
			System.out.println(handArray[i]);
		System.out.println("Puntaje: " + puntaje);
	}
	
	//-------------------------------------------
	
	public void refinarPuntajePorAses() {
		puntaje = 0;
		for (int i = 0; i < cardsCount; i++) {
			puntaje += handArray[i].points;
		}
	}
}
