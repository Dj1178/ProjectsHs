import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int fightWin=0;
		Scanner input= new Scanner(System.in);
		System.out.println("Welcome to the best RPG game ever");
		System.out.println("Please enter a name for your hero");
		String name=input.nextLine();
		Hero hero= new Hero(name);
		System.out.println("Enter a s for your hero to have a speed boost, a d for a damage boost, and a h for a health boost.");
		String boost=input.nextLine();
		PowerUp one=new PowerUp();
		if(hero.isAlive()) {
			Dragon drag=new Dragon(25, 5);
			System.out.println("A dragon has appeared! Would you like to try and defeat it? Enter a y if yes and a n if no.");
			System.out.println("Your current stats are: ");
			System.out.println(hero.getStats());
			String f=input.nextLine();
			boolean t=hero.fight(drag);
			if(f.equals("y")) {
				System.out.println(t);
				if(t) {
					System.out.println("Congratulations, you have defeated the dragon!");
					fightWin+=1;
				}else {
					System.out.println("You have been defeated");
				}
			}
			System.out.println("Would you like to use a powerup? Enter a y if yes and a n if no.");
			String use=input.nextLine();
			if(use.equals("y")) {
				one.addBoost(boost, hero);
			}
		}
		
		
		if(hero.isAlive()) {
			Dragon drag1=new Dragon(60, 5);
			System.out.println("A dragon has appeared! Would you like to try and defeat it? Enter a y if yes and a n if no.");
			System.out.println("Your current stats are: ");
			System.out.println(hero.getStats());
			String f=input.nextLine();
			boolean t=hero.fight(drag1);
			if(f.equals("y")) {
				System.out.println(t);
				if(t) {
					System.out.println("Congratulations, you have defeated the dragon!");
					fightWin+=1;
				}else {
					System.out.println("You have been defeated");
				}
			}
		}
		if(hero.isAlive()) {
			System.out.println("Would you like to use a powerup? Enter a y if yes and a n if no.");
			String use=input.nextLine();
			if(use.equals("y")) {
				one.addBoost(boost, hero);
			}
		}
		
		
		if(hero.isAlive()) {
			Dragon drag2=new Dragon(75, 7);
			System.out.println("A dragon has appeared! Would you like to try and defeat it? Enter a y if yes and a n if no.");
			System.out.println("Your current stats are: ");
			System.out.println(hero.getStats());
			String f=input.nextLine();
			boolean t=hero.fight(drag2);
			if(f.equals("y")) {
				System.out.println(t);
				if(t) {
					System.out.println("Congratulations, you have defeated the dragon!");
					fightWin+=1;
				}else {
					System.out.println("You have been defeated");
				}
			}
		}
		if(hero.isAlive()) {
			System.out.println("Would you like to use a powerup? Enter a y if yes and a n if no.");
			String use=input.nextLine();
			if(use.equals("y")) {
				one.addBoost(boost, hero);
			}
		}
		
		
		if(hero.isAlive()) {
			Dragon drag3=new Dragon(100, 8);
			System.out.println("A dragon has appeared! Would you like to try and defeat it? Enter a y if yes and a n if no.");
			System.out.println("Your current stats are: ");
			System.out.println(hero.getStats());
			String f=input.nextLine();
			boolean t=hero.fight(drag3);
			if(f.equals("y")) {
				System.out.println(t);
				if(t) {
					System.out.println("Congratulations, you have defeated the dragon!");
					fightWin+=1;
				}else {
					System.out.println("You have been defeated");
				}
			}
		}
		if(hero.isAlive()) {
			System.out.println("Would you like to use a powerup? Enter a y if yes and a n if no.");
			String use=input.nextLine();
			if(use.equals("y")) {
				one.addBoost(boost, hero);
			}
		}
		
		
		if(hero.isAlive()) {
			Dragon drag4=new Dragon(115, 9);
			System.out.println("A dragon has appeared! Would you like to try and defeat it? Enter a y if yes and a n if no.");
			System.out.println("Your current stats are: ");
			System.out.println(hero.getStats());
			String f=input.nextLine();
			boolean t=hero.fight(drag4);
			if(f.equals("y")) {
				System.out.println(t);
				if(t) {
					System.out.println("Congratulations, you have defeated the dragon!");
					fightWin+=1;
				}else {
					System.out.println("You have been defeated");
				}
			}
		}
		
		if(hero.isAlive()&&fightWin==5) {
			System.out.println("You survived all of your dragon battles! Congratulations!");
		}else {
			System.out.println("You lost after battle "+fightWin+".");
		}
		input.close();
	}
}