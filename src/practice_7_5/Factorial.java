package practice_7_5;

public class Factorial {
	//-------------------------------------------
	
	private String textoFactorial = "";
	
	//-------------------------------------------
	
	public int getFactorial(int num) {
		int factorial = 1;
		textoFactorial = "Factorial: " + num + "! = 1";
		
		for(int i = num; i > 0; i--) {
			factorial *= i;
			textoFactorial += i > 1 ? " * " + (num - i + 2) : "";
		}
		textoFactorial += " = " + factorial;
		
		return factorial;
	}
	
	//-------------------------------------------
	
	public String toString() {
		return textoFactorial;
	}
	
	//-------------------------------------------
}
