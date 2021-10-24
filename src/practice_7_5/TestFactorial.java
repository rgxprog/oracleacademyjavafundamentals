package practice_7_5;

public class TestFactorial {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*
		 * 4. Sobrescribir el método toString() para la clase más abajo para generar los resultados,
		 * haciendo coincidir con el resultado dado. El método toString() debería imprimir todos los
		 * valores desde 1 al número especificado en num y luego imprimir el valor final usando el
		 * método getFactorial provisto.
		 * Suponga que el num int variable es un valor global público:
		 * 		“Factorial: 10! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800”
		 * 
		 * int getFactorial(){
		 * 		int factorial;
		 * 		for(i = num; num > 0; i--){
		 * 			factorial *= num;
		 * 		}
		 * 		return factorial;
		 * }
		 * 
		 * public String toString() {
		 * 
		 * }
		 */
		
		Factorial fact = new Factorial();
		int number = 10;
				
		System.out.println(number + "! = " + fact.getFactorial(number));
		System.out.println(fact.toString());
	}

}
