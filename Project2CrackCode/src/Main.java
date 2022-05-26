import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("-Welcome to crack the code-");
		CodeGame game=new CodeGame();
		while(game.isGameOver()==false) {
			System.out.print("Please enter your guess: ");
			int guess=input.nextInt();
			String gguess= Integer.toString(guess);
			System.out.println("Number of digits correct: "+game.correctSpots(gguess));
		}
		System.out.println("Congratulations!!! You cracked the code in "+game.solvedInGuesses()+" guesses.");
	}
}