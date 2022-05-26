
public class Deck {
	//Instance Variable
	private Card[] cards;
	
	/* Constructor for a Deck and sets the instance variable to the parameter given
	 * Pre Condition: Needs to be called in the main file
	 * Post Condition: A Deck object will be created
	 */
	public Deck(Card[] c) {
		cards=c;
	}
	/* This function will print all of the cards inside of the deck created
	 * Pre Condition: Deck object must be created.
	 * Post Condition: All of the content in the deck will be printed to the console.
	 */
	public void printDeck() {
		for(int i=0; i<cards.length;i++) {
			System.out.println(cards[i].getName());
		}
	}
	/* Will return the index where the parameter is found inside of the deck object.
	 * Pre Condition: The deck object must be created.
	 * Post Condition: The index of where the card is found will be returned.
	 * @print index -returns the index of the card trying to be found
	 */
	public int findIndexOfCard(String n) {
		for(int i=0; i<cards.length;i++) {
			if(n.equals(cards[i].getName())) {
				return i;
			}
		}
		return -1;
	}
	/* This function will shuffle all of the cards inside of the deck
	 * Pre Condition: The deck object must be created.
	 * Post Condition: A shuffled deck will be returned
	 */
	public void shuffleDeck() {
		int c;
		Card t;
		for(int i=cards.length-1;i>0;i--) {
			c=(int)Math.floor(Math.random()*52);
			t=cards[c];
			cards[c]=cards[i];
			cards[i]=t;
		}
	}
}