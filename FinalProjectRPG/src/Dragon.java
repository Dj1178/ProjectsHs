
public class Dragon {
	private int health;
	private int attackDamage;
	private boolean isAlive;
	
	//Constructor
	public Dragon(int h, int a) {
		health=h;
		attackDamage=a;
		isAlive=true;
	}
	
	//Void Mutator Methods
	public void takeDamage(int x) {
		if(health-x<=0) {
			isAlive=false;
			health-=x;
		}else {
			health-=x;
		}
	}
	public void roar() {
		System.out.println("rawr");
	}
	
	//Accessor Methods
	public int getHealth() {
		return health;
	}
	public int getDamage() {
		return attackDamage;
	}
	public boolean isAlive() {
		return isAlive;
	}
}
