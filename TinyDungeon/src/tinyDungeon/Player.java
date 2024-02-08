package tinyDungeon;

public class Player {
	private int playerHealth;
	private int playerMana;
	private int playerAttack;
	private Weapon playerWeapon;
	
	Player(int playerHealth, int playerMana, Weapon playerWeapon){
		this.setPlayerHealth(playerHealth);
		this.setPlayerMana(playerMana);
		this.setPlayerWeapon(playerWeapon);
		this.setPlayerAttack(playerWeapon.getAttackValue());
	}

	public int getPlayerHealth() {
		return playerHealth;
	}

	public void setPlayerHealth(int playerHealth) {
		this.playerHealth = playerHealth;
	}

	public int getPlayerMana() {
		return playerMana;
	}

	public void setPlayerMana(int playerMana) {
		this.playerMana = playerMana;
	}

	public int getPlayerAttack() {
		return playerAttack;
	}

	public void setPlayerAttack(int playerAttack) {
		this.playerAttack = playerAttack;
	}

	public Weapon getPlayerWeapon() {
		return playerWeapon;
	}

	public void setPlayerWeapon(Weapon playerWeapon) {
		this.playerWeapon = playerWeapon;
	}

	
}
