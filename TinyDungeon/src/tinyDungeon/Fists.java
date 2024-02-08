package tinyDungeon;

public class Fists extends Weapon {
	private int attackValue = 5;
	
	Fists(){
		this.getAttackValue();
	}

	public int getAttackValue() {
		return attackValue;
	}
}
