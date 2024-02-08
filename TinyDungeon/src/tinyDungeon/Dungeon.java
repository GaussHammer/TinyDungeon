package tinyDungeon;

public class Dungeon {
	
	private int numberOfRooms;
	private boolean isEmpty;
	
	Dungeon(int numberOfRooms, boolean isEmpty){
		this.setNumberOfRooms(numberOfRooms);
		this.setIsEmpty(isEmpty);
	}
	
	public int getNumberOfRooms() {
		return this.numberOfRooms;
	}
	public void setNumberOfRooms(int number) {
		this.numberOfRooms = number;
	}

	public boolean getIsEmpty() {
		return isEmpty;
	}

	public void setIsEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
}
