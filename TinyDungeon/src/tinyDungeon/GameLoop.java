package tinyDungeon;

import java.util.Random;
import java.util.Scanner;

public class GameLoop {
	Dungeon dungeon = new Dungeon(5,true);
	Fists fists = new Fists();
	Player player = new Player(100, 50, fists );
	Scanner scan = new Scanner(System.in);
	Random diceroll = new Random();
	boolean hasSearched = false;
	boolean hadCombat;
	{
	
	while(dungeon.getNumberOfRooms()>0 && player.getPlayerHealth()>0) {
		
		if(dungeon.getIsEmpty()==true) {
			//reset of the hadCombat variable at the entrance of a new room
			hadCombat = false;
			System.out.println("the room is empty");
			System.out.println("what will you choose?");
			System.out.println("1:Move to the next room");
			System.out.println("2:search the room you're in");
			int choice = scan.nextInt();
		
				if(choice == 1) {
					hasSearched = false;
					System.out.println("you move into the next room");
					dungeon.setNumberOfRooms(dungeon.getNumberOfRooms()-1);
					System.out.println("only "+ dungeon.getNumberOfRooms()+" rooms remaining");

				} else if(choice == 2) {
					
					if (hasSearched==false) {
						
						/*only a sword can be found, can be expanded by including a dice roll giving chances
						 * of obtaining a sword, another item or nothing. So far the player will always
						 * find a sword by default in this case.
						 */
						foundASword(player,scan);
						//using the hasSearched boolean to prevent player spamming the "search room" choice
						hasSearched = true; 
						hadCombat = true;
					}else if(hasSearched==true) {
						System.out.println("you have already searched this room");
					}
				}
			}else if(dungeon.getIsEmpty()==false && hadCombat==false) {
				System.out.println("A goblin appears!");
				Goblin goblin = new Goblin();
				while(goblin.getGoblinHealth()>0 && player.getPlayerHealth()>0) {
					System.out.println("choose your move");
					System.out.println("1:Attack 2:Defend");
					int combat = scan.nextInt();
					if(combat == 1) {
						System.out.println("you attack the goblin");
						goblin.setGoblinHealth(goblin.getGoblinHealth()-player.getPlayerAttack());
						System.out.println("The goblin has "+goblin.getGoblinHealth()+" HP left");	
						System.out.println("The goblin attacks!");
						player.setPlayerHealth(player.getPlayerHealth()-goblin.getGoblinAttack());
						System.out.println("You have "+player.getPlayerHealth()+" HP remaining.");
					} else if(combat == 2) {
						System.out.println("you protect yourself");
						System.out.println("The goblin attacks!");
						player.setPlayerHealth(player.getPlayerHealth() - goblin.getGoblinAttack()/2);
						System.out.println("You have "+player.getPlayerHealth()+" HP remaining.");
						}
				}if(player.getPlayerHealth() <= 0) {
					System.out.println("You died.");
				}else {
				System.out.println("You won the fight!");
				hadCombat = true;
				}
			}
		dungeon.setIsEmpty(diceroll.nextBoolean());
		}
	if(dungeon.getNumberOfRooms() == 0) {
		System.out.println("congratulations, you have vanquished the dungeon!");
	}
	
	}

void foundASword(Player player, Scanner scan) {
	System.out.println("You found a sword!");
	System.out.println("do you want to equip it?");
	System.out.println("1:Yes 2:No");
	Sword sword = new Sword();
	int equip = scan.nextInt();
	if(equip == 1) {
			player.setPlayerWeapon(sword);
			player.setPlayerAttack(sword.getAttackValue());
			System.out.println("your attack power is now "+ player.getPlayerAttack());	
		}
}
}
