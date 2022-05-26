public class Main {
	public static void main(String[] args) {
		Card[] cardArray = new Card[52];
		int count = 0;
		/* 
		 * The first for loop goes through 4 times to get each suit of a card while the second goes through 9 times 
		 * to get all of the card number (2-10)
		 */
		for(int i=1;i<=4;i++) {
			for(int a=2;a<11;a++) {
				
				if(i==1) {
					Card c = new Card(a+" of Hearts", a);
					cardArray[count]=c;
					count++;
				}
				if(i==2) {
					Card c = new Card(a+" of Spades", a);
					cardArray[count]=c;
					count++;
				}
				if(i==3) {
					Card c = new Card(a+" of Diamonds", a);
					cardArray[count]=c;
					count++;
				}
				if(i==4) {
					Card c = new Card(a+" of Clubs", a);
					cardArray[count]=c;
					count++;
				}
			}
			/*
			 * This will create every hearts card that is not a numeric value
			 */
			if(i==1) {
				Card c = new Card("Ace of Hearts", 1);
				cardArray[count]=c;
				count++;
				Card b = new Card("Jack of Hearts", 11);
				cardArray[count]=b;
				count++;
				Card a = new Card("Queen of Hearts", 12);
				cardArray[count]=a;
				count++;
				Card d = new Card("King of Hearts", 13);
				cardArray[count]=d;
				count++;
			}
			/*
			 * This will create every Spades card that is not a numeric value
			 */
			if(i==2) {
				Card c = new Card("Ace of Spades", 1);
				cardArray[count]=c;
				count++;
				Card b = new Card("Jack of Spades", 11);
				cardArray[count]=b;
				count++;
				Card a = new Card("Queen of Spades", 12);
				cardArray[count]=a;
				count++;
				Card d = new Card("King of Spades", 13);
				cardArray[count]=d;
				count++;
			}
			/*
			 * This will create every Diamonds card that is not a numeric value
			 */
			if(i==3) {
				Card c = new Card("Ace of Diamonds", 1);
				cardArray[count]=c;
				count++;
				Card b = new Card("Jack of Diamonds", 11);
				cardArray[count]=b;
				count++;
				Card a = new Card("Queen of Diamonds", 12);
				cardArray[count]=a;
				count++;
				Card d = new Card("King of Diamonds", 13);
				cardArray[count]=d;
				count++;
			}
			/*
			 * This will create every Clubs card that is not a numeric value
			 */
			if(i==4) {
				Card c = new Card("Ace of Clubs", 1);
				cardArray[count]=c;
				count++;
				Card b = new Card("Jack of Clubs", 11);
				cardArray[count]=b;
				count++;
				Card a = new Card("Queen of Clubs", 12);
				cardArray[count]=a;
				count++;
				Card d = new Card("King of Clubs", 13);
				cardArray[count]=d;
				count++;
			}
		}
		Deck one = new Deck(cardArray);
		one.printDeck();
		System.out.println();
		one.shuffleDeck();
		one.printDeck();
		System.out.println(one.findIndexOfCard("King of Clubs"));
	}
}
