package practice_5_1;

import java.util.Scanner;

public class Operacion {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*
		 * 2. Escriba un programa que pida al usuario que introduzca dos números con coma flotante (double)
		 *    y un operador ( *, +, /, %, -). Imprima los resultados de la operación en cuestión.
		 *    Para leer la línea de comandos utilice la clase Scanner. Escriba el programa utilizando primero
		 *    la lógica switch y, a continuación, vuelva a escribir el programa utilizando la lógica if/else.
		 */
		
		double num1, num2, resultado;
		String operador;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Primer número: ");
		num1 = sc.nextDouble();
		System.out.print("Segundo número: ");
		num2 = sc.nextDouble();
		System.out.print("Operador: ");
		operador = sc.next();
		
		// Con switch
		switch (operador) {
			case "*":
				resultado = num1 * num2;
				break;
			case "+":
				resultado = num1 + num2;
				break;
			case "/":
				resultado = num1 / num2;
				break;
			case "%":
				resultado = num1 % num2;
				break;
			case "-":
				resultado = num1 - num2;
				break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + operador);
		}
		
		System.out.println("Resultado, usando switch: " + resultado);
		
		// Con if
		if (operador.compareTo("*") == 0)
			resultado = num1 * num2;
		else if (operador.compareTo("+") == 0)
			resultado = num1 + num2;
		else if (operador.compareTo("/") == 0)
			resultado = num1 / num2;
		else if (operador.compareTo("%") == 0)
			resultado = num1 % num2;
		else if (operador.compareTo("-") == 0)
			resultado = num1 - num2;
		else
			throw new IllegalArgumentException("Unexpected value: " + operador);
		
		System.out.println("Resultado, usando if/else: " + resultado);
	}

}
