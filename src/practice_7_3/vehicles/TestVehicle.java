package practice_7_3.vehicles;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		System.out.println("Manufacturer: " + Vehicle.MAKE);
		Vehicle.setMake("Seer");
		System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
		
		Vehicle vehicle1 = new Vehicle("Vision");
		//System.out.println(vehicle1.getChassisNo());
		//System.out.println(vehicle1.getModel());
		System.out.println(vehicle1.toString());
		
		Vehicle vehicle2 = new Vehicle("Edict");
		System.out.println(vehicle2.toString());
		
		Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
		System.out.println(vehicle3.toString());
		
		salidaFinal();
	}
	
	//-------------------------------------------
	
	private static void salidaFinal() {
		System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
	}

}
