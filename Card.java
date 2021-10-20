// creating a public class named Card
public class Card {
	
	private int value;
	private int bonus;
	private String rank;
	private String suit;
	
	
	// taking rank, suit, value and bonus as parameters in the card object
	public Card(String rank, String suit, int value) {
		this.suit = suit;
		this.value = value;
		this.rank = rank;
		this.bonus = bonus;
		
		//bonus values for every type of suit
		if(suit.equals("Hearts")) {
			this.bonus = this.value + 8;
		}
		
		else if(suit.equals("Spades")){
			this.bonus = this.value + 10;
		}
		
		else if(suit.equals("Clubs")){
			this.bonus = this.value + 6;
		}
		
		else{
			this.bonus = this.value + 4;
		}
		
	}
	
	// toString method used for string representation of an object
	public String toString(){
		return this.rank + " of " + this.suit + ". Total score is: " + this.bonus;
		
	}
	
	// returns the total value
	public int totValue(){
		return this.bonus;
	}
	
}
