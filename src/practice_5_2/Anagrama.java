package practice_5_2;

import java.util.Scanner;

public class Anagrama {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		/*
		 * 4. Un anagrama es una palabra o frase que se forma mediante la transposición de letras de otra palabra o frase, por ejemplo,
		 * "parliament" es el anagrama de "partial men," y "software" es el anagrama de "swear oft". Escriba un programa que descifre si
		 * una cadena es un anagrama de otra cadena. El programa debe ignorar el espacio en blanco y la puntuación.
		 */
		
		Scanner sc = new Scanner(System.in);
		String palabra1, palabra2;
		boolean esAnagrama;
		
		esAnagrama = true;
		
		System.out.print("Primer palabra: ");
		palabra1 = sc.nextLine();
		System.out.print("Segunda palabra: ");
		palabra2 = sc.nextLine();
		sc.close();
		
		palabra1 = palabra1.toLowerCase();
		palabra2 = palabra2.toLowerCase();
		
		for (int i = 0; i < palabra1.length(); i++) {
			if (Character.isLetter(palabra1.charAt(i))) {
				int pos = palabra2.indexOf(palabra1.charAt(i));
				if (pos != -1) {
					palabra2 = palabra2.replaceFirst("(?:" + palabra1.charAt(i) + ")+", " ");
				} else {
					esAnagrama = false;
				}
			}
		}

		if (esAnagrama) {
			System.out.println("Son anagramas");
		} else {
			System.out.println("No son anagramas");
		}
		
	}

}
