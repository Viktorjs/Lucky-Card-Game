
public class Game {
	
	private Deck d = new Deck();
	
	// initializing makeDeck, points and playAgain
	public void StartGame(){
		shuffleDeck();
		score(getFirstCardValue(), getSecondCardValue(), getThirdCardValue());
		restart();
		
	}
	
	// creates and shuffles the deck
	public void shuffleDeck(){
		System.out.println("Welcome to the LuckyCard Game!\n");
		System.out.println("--- Game Started ---\n");
		d.createDeck();
		d.mix();
		
		
	}
	
	// making cards and comparing to other cards in the game
	public int getFirstCardValue(){	
		System.out.print(" Card 1: ");
		d.pick(1);
		System.out.println(" -------------------------------------------");
		int c = d.compare(1);
		return c;
	}
	public int getSecondCardValue(){	
		System.out.print(" Card 2: ");
		d.pick(2);
		System.out.println(" -------------------------------------------");
		int c = d.compare(2);
		return c;
	}
	public int getThirdCardValue(){	
		System.out.print(" Card 3: ");
		d.pick(3);
		System.out.println(" -------------------------------------------");
		int c = d.compare(3);
		return c;
	}
	
	// if-statement for determining the winner of each game
	public void score(int getFirstCardValue, int getSecondCardValue, int getThirdCardValue){
		if(getThirdCardValue > Math.min(getFirstCardValue, getSecondCardValue) && getThirdCardValue < Math.max(getFirstCardValue, getSecondCardValue)) {
			System.out.println("You win!\n");
		} else {
			System.out.println("You lose!\n");
		}
		
	}
	
	// text saying to the player how to play again or exit the game
	public void restart(){
		System.out.println("Press ENTER to play again or E to exit the game");
	}
	
	
}
