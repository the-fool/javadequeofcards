package deckOfCards;

import java.util.Iterator;

public class DeckOfCards implements Iterable {
	private static final int SIZE = 52;
	private static final String suits[] = {"spades", "hearts", "diamonds", "clubs"};
	private Card deck[];
	
	DeckOfCards() {
		int index = 0;
		deck = new Card[52];
		for (String suit : suits) {
			for (int i = 1; i <= 13; i++) {
				deck[index] = new Card(suit, i);
			}
		}
	}
	
	
	
	private class Card implements Comparable<Card>{
		private String suit;
		private int value;
		
		Card(String suit, int value) {
			this.suit = suit;
			this.value = value;
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
	}


	@Override
	public Iterator<Card> iterator() {
		return new CardIterator(deck);
	}
	
	private class CardIterator implements Iterator<Card>{
		private int current;
		private Card d[];
		
		CardIterator(Card d[]) {
			this.d = d;
			current = 0;
		}
		
		@Override
		public boolean hasNext() {
			return (current < d.length);
		}

		@Override
		public Card next() {
			return d[current++];
		}
		
	}
}
