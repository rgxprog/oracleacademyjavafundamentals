package practice_7_5;

public class TestFactorial {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

		/*
		 * 4. Sobrescribir el m�todo toString() para la clase m�s abajo para generar los resultados,
		 * haciendo coincidir con el resultado dado. El m�todo toString() deber�a imprimir todos los
		 * valores desde 1 al n�mero especificado en num y luego imprimir el valor final usando el
		 * m�todo getFactorial provisto.
		 * Suponga que el num int variable es un valor global p�blico:
		 * 		�Factorial: 10! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 = 3628800�
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
