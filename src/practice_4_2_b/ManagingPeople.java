package practice_4_2_b;

public class ManagingPeople {

	/*
	 * ...
	 * 7. Complete la clase de objeto creada por el programador que aparece a continuación.
	 *    Tenga en cuenta las instrucciones de los comentarios.
	 * ...
	 * 8. Complete la siguiente clase de controlador.
	 *    Tenga en cuenta las instrucciones de los comentarios. 
	 */
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Person p1 = new Person("Ariel", 37);
		
		Person p2 = new Person("Joseph", 15);
		
		if(p1.getAge() == p2.getAge()) {
			System.out.println(p1.getName() + " is the same age as " + p2.getName());
		} else {
			System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
		}
	}

}
