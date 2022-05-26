
public class Card {
	//Instance Variables
	private String name;
	private int points;
	/* Constructor for a card and sets the instance variables to the parameters given
	 * Pre Condition: Needs to be called in the main file
	 * Post Condition: A card object will be created
	 */
	public Card(String n, int p) {
		name=n;
		points=p;
	}
	/* Returns the name of the card
	 * Pre Condition: Card must be initialized
	 * Post Condition: Returns the name of the card
	 * @return name -the name of the card object
	 */
	public String getName() {
		return name;
	}
	/* Returns the points of the card
	 * Pre Condition: Card must be initialized
	 * Post Condition: Returns the points of the card
	 * @return points -the points of the card object
	 */
	public int getPoints() {
		return points;
	}
}
