package deckOfCards;
import deckOfCards.Card;

public class LinkedDeque implements DequeInterface<Card> {
	private DLNode<Card> firstNode;
	private DLNode<Card> lastNode;
	
	public LinkedDeque()
	{
		firstNode = null;
		lastNode = null;
	}
	
	public LinkedDeque(DeckOfCards d) {
		for (Card c : d) {
			addToBack(c);
		}
	}
	
	private class DLNode<T> {
		private T data;
		private DLNode<T> next;
		private DLNode<T> previous;
		
		DLNode() {
			this(null,null, null);
		}
		DLNode(DLNode<T> prev, T data, DLNode<T> next) {
			this.next = next;
			this.previous = prev;
			this.data = data;
		}
		
		public DLNode<T> getNext() {
			return next;
		}
		public DLNode<T> getPrevious() {
			return previous;
		}
		public void setNext(DLNode<T> n) {
			this.next = n;
		}
		public void setPrev(DLNode<T> p) {
			this.previous = p;
		}
	}


	@Override
	public void addToBack(Card newEntry) {
		DLNode<Card> newNode = new DLNode<Card>(lastNode, newEntry, null);
		
		if (isEmpty())
			firstNode = newNode;
		else
			lastNode.setNext(newNode);
		lastNode = newNode;
	}

	@Override
	public void addToFront(Card newEntry) {
		DLNode<Card> newNode = new DLNode<Card>(null, newEntry, firstNode);
		if (isEmpty())
			lastNode = newNode;
		else
			firstNode.setPrev(newNode);
		firstNode = newNode;
	}


	@Override
	public Card removeFront() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Card removeBack() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Card getBack() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Card getFront() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isEmpty() {
		return (firstNode == null) && (lastNode == null);
	}


	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
