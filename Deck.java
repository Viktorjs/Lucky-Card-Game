import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	// creating an array list containing 52 different cards in the deck
	private ArrayList<Card> Deck = new ArrayList<Card>();

	public void createDeck() {
		String[] suit = { "Hearts", "Spades", "Clubs", "Diamonds" };
		String[] value = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		// for loop that iterates through every card
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < value.length; j++) {
				Deck.add(new Card(value[j], suit[i], j + 2));
			}
		}
	}

	// compares the three different cards that are displayed
	public int compare(int compare) {
		return Deck.get(compare).totValue();
	}

	// this method shuffles the deck. Collections is imported
	public void mix() {
		Collections.shuffle(Deck);
	}

	// method for picking card. Also prints the card. Connecting to Game
	public void pick(int pick) {
		System.out.println(Deck.get(pick));
	}

}
