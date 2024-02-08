package tinyDungeon;

public class Goblin {
	private String goblinName = "goblin";
	private int goblinHealth = 50;
	private int goblinAttack = 6;
	
	Goblin(){
		this.getGoblinName();
		this.getGoblinHealth();
		this.getGoblinAttack();
	}

	public String getGoblinName() {
		return goblinName;
	}

	public int getGoblinHealth() {
		return goblinHealth;
	}
	public void setGoblinHealth(int health) {
		this.goblinHealth = health;
	}

	public int getGoblinAttack() {
		return goblinAttack;
	}
	
}
