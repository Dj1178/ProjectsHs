
public class PowerUp {
	private int attackDamageBonus;
	private int healthBonus;
	private int speedBonus;
	
	public PowerUp() {
		attackDamageBonus=10;
		healthBonus=20;
		speedBonus=20;
	}
	
	public void addBoost(String a, Hero h) {
		if(a.equals("s")) {
			h.increaseSpeed(speedBonus);
		}else if(a.equals("h")) {
			h.heal(healthBonus);
		}else if(a.equals("d")) {
			h.increaseAttack(attackDamageBonus);
		}
	}
	
	public int getSpeedBonus() {
		return speedBonus;
	}
	public int getHealthBonus() {
		return healthBonus;
	}
	public int getDamageBonus() {
		return attackDamageBonus;
	}
}
