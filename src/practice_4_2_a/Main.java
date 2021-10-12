package practice_4_2_a;

public class Main {

	/*
	 * ...
	 * 4. Escriba la sintaxis de una clase de objeto Java simple con el nombre Student y el siguiente formato:
	 * 		Student Name: Lisa Palombo
	 * 		Student ID: 123456789
	 * 		Student Status: Active
	 *    La información del estudiante se almacenará en las siguientes variables:
	 * 		fName, lName, stuId, stuStatus.
	 * 5. Escriba el código para una clase de controlador que cree un objeto Student y muestre la información sobre el objeto en la pantalla.
	 */
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Student objStudent = new Student();
		objStudent.SetFirstName("Lisa");
		objStudent.SetLastName("Palombo");
		objStudent.SetId(123456789);
		objStudent.SetActiveStatus(true);
		
		System.out.println(objStudent.ToString());
	}

}
