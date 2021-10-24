package practice_7_2;

public class FishTask {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Fish Amber = new Fish("AngelFish", 5);
		Fish James = new Fish("Guppy", 3);
		
		Fish nicest = nicestFish(Amber, James);
		System.out.println("Nicest fish:\n" + nicest.toString());
	}
	
	//-------------------------------------------
	
	//private static Fish nicestFish(Fish f1, Fish f2) {
	//	return f1.getFriendliness() > f2.getFriendliness() ? f1 : f2;
	//}

	private static Fish nicestFish(Fish ...fishes) {
		Fish temp = fishes[0];
		
		for (Fish fish : fishes)
			if (fish.getFriendliness() > temp.getFriendliness())
				temp = fish;
		
		return temp;
	}
}
