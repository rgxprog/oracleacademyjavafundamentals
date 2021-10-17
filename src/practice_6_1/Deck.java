package practice_6_1;

import java.util.Random;

public class Deck {
	Card[] cardArray = new Card[52];
	
	Deck() {
		int suits = 4;
		int cardType = 13;
		int cardCount = 0;
		for(int i = 1; i <= suits; i++)
			for(int j = 1; j <= cardType; j++) {
				cardArray[cardCount] = new Card(i,j);
				cardCount++;
			}
	}
	
	//-------------------------------------------
	
	public void print() {
		for(int i = 0; i < cardArray.length; i++)
			System.out.println(cardArray[i]);
	}
	
	//-------------------------------------------
	
	public void mezclar() {
		Random r = new Random();
		final int LOW = 0;
		final int HIGH = cardArray.length;
		int posCambio;
		
		for (int i = 0; i < cardArray.length; i++) {
			posCambio = r.nextInt(HIGH - LOW);
			Card a = cardArray[i];
			Card b = cardArray[posCambio];
			cardArray[i] = b;
			cardArray[posCambio] = a;
		}
	}
	
	//-------------------------------------------
	
	public Card tomarCarta() {
		Random r = new Random();
		final int LOW = 0;
		final int HIGH = cardArray.length;
		int pos = 0;
		Card card = null;
		
		boolean nextCard = true;
		while (nextCard) {
			pos = r.nextInt(HIGH - LOW);
			card = cardArray[pos];
			nextCard = card.taken ? true : false; 
		}
		
		cardArray[pos].taken = true;
		return card;
	}
	
}
