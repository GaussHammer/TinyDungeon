package tinyDungeon;

public abstract class Weapon {
	
	private int attackValue;
	Weapon(){
		this.getAttackValue();
	}
	public int getAttackValue() {
		return attackValue;
	}
}
