package practice_4_2_a;

public class Student {
	//-------------------------------------------
	
	// Propiedades
	private String fName;
	private String lName;
	private int stuId;
	private boolean stuStatus;
	
	//-------------------------------------------
	
	public Student() {
		
	}
	
	public Student(String fName, String lName, int id, boolean activeStatus) {
		this.fName = fName;
		this.lName = lName;
		this.stuId = id;
		this.stuStatus = activeStatus;
	}
	
	//-------------------------------------------
	
	public void SetFirstName(String fName) {
		this.fName = fName;
	}

	public void SetLastName(String lName) {
		this.lName = lName;
	}
	
	public void SetId(int stuId) {
		this.stuId = stuId;
	}
	
	public void SetActiveStatus(boolean status) {
		this.stuStatus = status;
	}
	
	//-------------------------------------------
	
	public String ToString() {
		String status = stuStatus ? "Active" : "Inactive";
		return (
			"Sudent name:    " + fName + " " + lName + "\n" +
			"Student ID:     " + stuId + "\n" +
			"Student status: " + status
		);
	}
	
	//-------------------------------------------
}
