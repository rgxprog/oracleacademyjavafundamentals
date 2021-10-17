package practice_6_1;

import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		/*
		 * 8. En la clase de Álgebra, aprendemos sobre las arreglas. Aprendemos a sumar, restar y multiplicar
		 *    arreglas de 2x2 y 3x3. A continuación presentamos ejemplos de la clase de Álgebra con sus respuestas:
		 *    		(3 4 + ( 1 0  = (4 4
		 *     		 5 6)   -2 3)    3 9)
		 *     
		 *    		(3 4 - ( 1 0  = (2 4
		 *    		 5 6)   -2 3)    7 3)
		 *     
		 *    		(3 4 * ( 1 0  = (-5 12
		 *    		 5 6)   -2 3)    -7 18)
		 *     Es casi aparente cómo sumar. Debemos sumar la primera posición a la primera arreglo con la primera
		 *     posición en la segunda arreglo. Continuamos con las posiciones correspondientes para obtener la respuesta.
		 *     La resta sigue este mismo método de posición. La multiplicación de arreglas parece ser confusa,
		 *     ya que no sigue el método de posiciones utilizado en la suma y resta.
		 *     Para obtener la respuesta, se toma la fila de la primera arreglo y la columna de la segunda arreglo y se
		 *     multiplican los respectivos valores y, luego, se toma la suma de los resultados.
		 *     La respuesta anterior se obtuvo de la siguiente manera:
		 *     3(1)+4(-2)=-5 3(0)+4(3)=12
		 *     5(1)+6(-2)=-7 5(0)+6(3)=18
		 *     
		 *     Escriba un programa que tome dos arreglas y, luego, permita al usuario elegir sumar, restar o multiplicar
		 *     y mostrar la respuesta. El programa mostrará el siguiente menú:
		 *     		A. Enter Arreglo A
		 *     		B. Enter Arreglo B
		 *     		C. Display A + B
		 *     		D. Display A - B
		 *     		E. Display A * B
		 *     		F. Exit
		 *     El programa debe mostrar un ciclo y permitir al usuario continuar eligiendo diferentes opciones hasta que eligen salir.
		 *     El programa bien escrito colocará en módulos el proceso en métodos diferentes.
		 */
		
		Scanner sc = new Scanner(System.in);
		int arregloA[][] = new int[2][2];
		int arregloB[][] = new int[2][2];
		int arregloR[][] = new int[2][2];
		String opcion = "";
		
		while (opcion.compareTo("F") != 0) {
			opcion = mostrarMenu(sc);
			
			switch (opcion) {
			case "A":
				arregloA = leerArreglo(sc);
				break;
			case "B":
				arregloB = leerArreglo(sc);
				break;
			case "C":
				arregloR[0][0] = arregloA[0][0] + arregloB[0][0];
				arregloR[0][1] = arregloA[0][1] + arregloB[0][1];
				arregloR[1][0] = arregloA[1][0] + arregloB[1][0];
				arregloR[1][1] = arregloA[1][1] + arregloB[1][1];
				mostrarResultado(arregloR);
				break;
			case "D":
				arregloR[0][0] = arregloA[0][0] - arregloB[0][0];
				arregloR[0][1] = arregloA[0][1] - arregloB[0][1];
				arregloR[1][0] = arregloA[1][0] - arregloB[1][0];
				arregloR[1][1] = arregloA[1][1] - arregloB[1][1];
				mostrarResultado(arregloR);
				break;
			case "E":
				arregloR[0][0] = arregloA[0][0] * arregloB[0][0] + arregloA[0][1] * arregloB[1][0];
				arregloR[0][1] = arregloA[0][0] * arregloB[0][1] + arregloA[0][1] * arregloB[1][1];
				arregloR[1][0] = arregloA[1][0] * arregloB[0][0] + arregloA[1][1] * arregloB[1][0];
				arregloR[1][1] = arregloA[1][0] * arregloB[0][1] + arregloA[1][1] * arregloB[1][1];
				mostrarResultado(arregloR);
				break;
			default:
				break;
			}
		}
	}
	
	//-------------------------------------------
	
	private static String mostrarMenu(Scanner sc) {
		String op;
		
		System.out.println("A. Enter Arreglo A");
		System.out.println("B. Enter Arreglo B");
		System.out.println("C. Display A + B");
		System.out.println("D. Display A - B");
		System.out.println("E. Display A * B");
		System.out.println("F. Exit");
		System.out.print("Su opción: ");
		op = sc.next();
		
		return op.toUpperCase();
	}
	
	//-------------------------------------------
	
	private static int[][] leerArreglo(Scanner sc){
		int a[][] = new int[2][2];
		
		System.out.print("[0][0]: ");
		a[0][0] = sc.nextInt();
		System.out.print("[0][1]: ");
		a[0][1] = sc.nextInt();
		System.out.print("[1][0]: ");
		a[1][0] = sc.nextInt();
		System.out.print("[1][1]: ");
		a[1][1] = sc.nextInt();
		
		return a;
	}
	
	//-------------------------------------------
	
	private static void mostrarResultado(int r[][]) {
		System.out.println("(" + r[0][0] + " " + r[0][1] + ")");
		System.out.println("(" + r[1][0] + " " + r[1][1] + ")");
	}

}
