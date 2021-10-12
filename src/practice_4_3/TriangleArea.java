package practice_4_3;

import java.util.Scanner;

public class TriangleArea {
	
	/*
	 * 1. Escriba un programa que tome la base y altura de un triángulo y calcule y
	 *    muestre la superficie de este utilizando la fórmula a continuación. 
	 */
	
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner scan = new Scanner(System.in);
		float base, height, area;
		
		System.out.println("Area of a triangle");
		
		System.out.print("Base : ");
		base = scan.nextFloat();
		System.out.print("Height : ");
		height = scan.nextFloat();
		
		area = base * height / 2;
		System.out.println("The area is: " + area);
	}

}
