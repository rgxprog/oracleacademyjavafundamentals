package practice_7_2;

public class Fish {
	//-------------------------------------------
	
	private String typeOfFish;
	private int friendliness;
	
	//-------------------------------------------
	
	public Fish() {
		typeOfFish = "Unknow";
		friendliness = 3;
	}
	
	public Fish(String t, int f) {
		typeOfFish = t;
		friendliness = f;
	}
	
	//-------------------------------------------
	
	public int getFriendliness() {
		return friendliness;
	}
	
	//-------------------------------------------
	
	public String toString() {
		return "Type of fish: " + typeOfFish + "\nFriendliness: " + friendliness;
	}
	
	//-------------------------------------------
}
