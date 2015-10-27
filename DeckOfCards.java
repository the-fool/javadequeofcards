package deckOfCards;

import java.util.Iterator;

public class DeckOfCards implements Iterable<Card> {
	private static final int SIZE = 52;
	private static final String suits[] = {"spades", "hearts", "diamonds", "clubs"};
	private Card deck[];
	
	DeckOfCards() {
		int index = 0;
		deck = new Card[52];
		for (String suit : suits) {
			for (int i = 1; i <= 13; i++) {
				deck[index++] = new Card(suit, i);
			}
		}
	}


	@Override
	public Iterator<Card> iterator() {
		return new CardIterator();
	}
	
	private class CardIterator implements Iterator<Card>{
		private int current;
		
		CardIterator() {
			current = 0;
		}
		
		@Override
		public boolean hasNext() {
			return (current < deck.length);
		}

		@Override
		public Card next() {
			return deck[current++];
		}
		
	}
}

class Card implements Comparable<Card>{
	private String suit;
	private int value;
	
	Card(String suit, int value) {
		this.suit = suit;
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}
	@Override
	public int compareTo(Card c) {
		if (this.value > c.value) {
			return  1;
		}
		else if (this.value < c.value) {
			return -1;
		}
		else {
			return this.suit.compareTo(c.suit);
		}
	}
	
	public String toString() {
		return value + " of " + suit;
	}
}
