
public class Hero {
	private int health;
	private int attackDamage;
	private String name;
	private int speed;
	private boolean isAlive;
	
	//default constructor
	public Hero(String n) {
		health=100;
		attackDamage=10;
		speed=20;
		isAlive=true;
		name=n;
	}
	
	//Void Mutator Methods
	public void heal(int x) {
		if(x+health>100) {
			health=100;
		}else {
			health+=x;
		}
	}
	public void takeDamage(int x) {
		if(health-x<=0) {
			isAlive=false;
			health=0;
		}else {
			health-=x;
		}
	}
	public void increaseSpeed(int x) {
		speed+=x;
	}
	public void increaseAttack(int x) {
		attackDamage+=x;
	}
	
	//Accessor methods
	public int getHealth() {
		return health;
	}
	public int getDamage() {
		return attackDamage;
	}
	public String getName() {
		return name;
	}
	public int getSpeed() {
		return speed;
	}
	public boolean isAlive() {
		return isAlive;
	}
	
	//Non-Void Mutator Methods
	public String getStats() {
		return "Name "+name+" Health: "+ health+" Attack Damage: "+attackDamage+" Speed: "+speed;
	}
	
	public boolean fight(Dragon drag) {
		for(int i = 0;i<10;i++){
			drag.takeDamage(attackDamage);
			int random = (int)(Math.random()*(10)+1);
			if(random>speed/10) {
				System.out.println("You took damage");
				this.takeDamage(drag.getDamage());
			}else {
				System.out.println("You dodged an attack!");
			}
			if(drag.isAlive()==false&&isAlive==false) {
				return false;
			}
			if(drag.isAlive()==false||isAlive==false) {
				break;
			}
		}
		if(drag.isAlive() && isAlive) {
			System.out.println("The dragon has fled");
			return false;
		}else if(drag.isAlive()&&isAlive==false) {
			return false;
		}else {
			return true;
		}
	}
}