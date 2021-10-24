package practice_7_3.vehicles;

public class Vehicle {
	//-------------------------------------------
	
	public static String MAKE = "Augur";
	public static int numVehicles = 0;
	
	private String chassisNo;
	private String model;
	
	//-------------------------------------------
	
	public Vehicle(String model) {
		numVehicles++;
		chassisNo = "ch" + numVehicles;
		this.model = model;
		
		System.out.println("Vehicle manufactured");
	}
	
	//-------------------------------------------
	
	public static class Engine extends Vehicle {
		//---------------------------------------
		
		public static String MAKE = "Predicter";
		public static int CAPACITY = 1600;
		
		//---------------------------------------
		
		public Engine(String model) {
			super(model);
		}
		
		//---------------------------------------
		
		public static String getMake() {
			return MAKE;
		}
		
		public static int getCapacity() {
			return CAPACITY;
		}
		
		//---------------------------------------		
		
		public String toString() {
			return "Vehicle number " + getChassisNo() +
					" is a " + getModel() +
					" and has an engine capacity of " + getCapacity() + "cc";
		}
		
		//---------------------------------------
	} // class Engine
	
	//-------------------------------------------
	
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	
	public String getChassisNo() {
		return chassisNo;
	}
	
	//-------------------------------------------
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	//-------------------------------------------
	
	public static void setMake(String make) {
		MAKE = make;
	}
	
	//-------------------------------------------
	
	public String toString() {
		return "The vehicle is manufactured by: " + MAKE +
				"\nThe model type is: " + model +
				"\nThe chassis number is: " + chassisNo +
				"\nThe engine make is: " + Engine.getMake() +
				"\nThe engine capacity is: " + Engine.getCapacity() + "cc";
	}
	
	//-------------------------------------------
}
