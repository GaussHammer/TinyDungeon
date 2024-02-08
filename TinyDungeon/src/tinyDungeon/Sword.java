package tinyDungeon;

public class Sword extends Weapon {
	private int attackValue = 12;
	private String name = "Sword";
	Sword(){
		this.getAttackValue();
		this.getName();
	}
	
	public int getAttackValue() {
		return attackValue;
	}

	public String getName() {
		return name;
	}
}
