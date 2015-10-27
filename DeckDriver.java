package deckOfCards;

public class DeckDriver {

	public static void main(String[] args) {
		DeckOfCards d = new DeckOfCards();
		LinkedDeque ld = new LinkedDeque(d);
		ld.display();

	}

}
