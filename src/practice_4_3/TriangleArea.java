package practice_4_3;

import java.util.Scanner;

public class TriangleArea {
	
	/*
	 * 1. Escriba un programa que tome la base y altura de un tri�ngulo y calcule y
	 *    muestre la superficie de este utilizando la f�rmula a continuaci�n. 
	 */
	
	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

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
