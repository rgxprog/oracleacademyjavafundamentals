package practice_5_1;

import java.util.Scanner;

public class ExamenFinal {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*
		 * 6. Un profesor de universidad eximirá a un estudiante de hacer el examen final si se cumple alguno de estos criterios:
		 * • Tiene una media igual o superior al 90 % en clase y ha faltado a un número de clases igual o inferior a 3.
		 * • Tiene una media igual o superior al 80 % en clase y no ha faltado a ninguna clase.
		 * • El programa a continuación determinará si el estudiante queda o no exento de hacer el examen.
		 * • Vuelva a escribir el programa utilizando solo una sentencia if.
		 * 
		 * import java.util.Scanner;
		 * public class FinalExam{
		 * 		public static void main(String[] args) {
		 * 			double average;
		 * 			int daysAbsent;
		 * 			boolean exempt=false;
		 * 			Scanner reader= new Scanner(System.in);
		 * 			System.out.println("This program will determine if you can get out of the final exam.");
		 * 			System.out.println("Please answer the following questions.");
		 * 			System.out.println("What is your average in the class?");
		 * 			average=reader.nextDouble();
		 * 			System.out.println("How class lectures have you missed?");
		 * 			daysAbsent=reader.nextInt();
		 * 			if(average>=90) {
		 * 				if(daysAbsent<=3)
		 * 					exempt=true;
		 * 			} else if(average>=80) {
		 * 				if(daysAbsent<=0)
		 * 					exempt=true;
		 *			}
		 * 			if(exempt)
		 * 				System.out.println("Congratulations! You are exempt from the final exam.");
		 * 			else
		 * 				System.out.println("You are not exempt from the final exam.");
		 * 		}//end of main
		 * }//end of class
		 */
		
		double average;
		int daysAbsent;
		boolean exempt = false;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("This program will determine if you can get out of the final exam.");
		System.out.println("Please answer the following questions.");
		System.out.println("What is your average in the class? ");
		average=reader.nextDouble();
		System.out.println("How class lectures have you missed? ");
		daysAbsent=reader.nextInt();
		
		if(average>=90 && daysAbsent<=3 || average>=80 && daysAbsent<=0) {
			exempt=true;
		}
		
		if(exempt)
			System.out.println("Congratulations! You are exempt from the final exam.");
		else
			System.out.println("You are not exempt from the final exam.");
	}

}
