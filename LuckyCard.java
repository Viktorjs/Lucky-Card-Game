
// importing scanner to get user input
import java.util.Scanner;

// main class that contains the functions for starting/ending the game
public class LuckyCard {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		boolean Continue = false;

		// while loop that starts a new game
		while (Continue != true) {

			Game g = new Game();
			g.StartGame();
			String string = scanner.nextLine();

			// press enter to continue and press e to exit game
			if (string.equals("enter")) {
				Continue = false;
			}

			else if (string.equals("e")) {
				System.out.println("Game finished!");
				Continue = true;
			}

		}
	}

}
