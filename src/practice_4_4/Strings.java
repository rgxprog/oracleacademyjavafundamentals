package practice_4_4;

public class Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

		/*
		 * 1. Escriba tres formas diferentes de declarar e instanciar un objeto de cadena llamado �myString� que contenga �abc�.
		 */

		// 1
		String myString_a;
		myString_a = "abc";
		
		// 2
		String myString_b = "abc";
		
		// 3
		String myString_c = new String("abc");
		
		System.out.println("myString_a = " + myString_a);
		System.out.println("myString_b = " + myString_b);
		System.out.println("myString_c = " + myString_c);
		
		
		/*
		 * 3. Declare e instancie dos objetos de cadena independientes; a continuaci�n,
		 *    concat�nelos y as�gneles un tercer objeto de cadena arbitrario.
		 */
		
		String string_a = "string_a ";
		String string_b = "string_b";
		String concat_a_b = string_a + string_b + " string_c";
		
		System.out.println(concat_a_b);
	}

}
