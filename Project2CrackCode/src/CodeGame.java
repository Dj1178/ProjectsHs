import java.util.Random;

public class CodeGame {
	private int numberOfGuesses;
	private String secretCode;
	private boolean gameOver;
	
	public CodeGame() {
		Random rand = new Random();
		double rn = rand.nextDouble();
		int random = (int)(rn*88888+11111);
		secretCode = Integer.toString(random);
		numberOfGuesses=0;
	}
	public int correctSpots(String guess) {
		int correct= 0;
		if(guess.charAt(0)==secretCode.charAt(0)) {
			correct +=1;
		}
		if(guess.charAt(1)==secretCode.charAt(1)) {
			correct +=1;
		}
		if(guess.charAt(2)==secretCode.charAt(2)) {
			correct +=1;
		}
		if(guess.charAt(3)==secretCode.charAt(3)) {
			correct +=1;
		}
		if(guess.charAt(4)==secretCode.charAt(4)) {
			correct +=1;
		}
		if(correct==5) {
			gameOver=true;
		}
		numberOfGuesses+=1;
		return correct;
	}
	public boolean isGameOver() {
		return gameOver;
	}
	public int solvedInGuesses() {
		return numberOfGuesses;
	}
}
