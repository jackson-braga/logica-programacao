package lista2;

import java.util.Scanner;

public class exec5 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		char letra = scan.next().charAt(0);
		letra = Character.toLowerCase(letra);
		
		char[] vogais = new char[] {'a','e','i','o','u'};
		
		boolean achei = false;
		for (int i = 0; i < vogais.length; i++) {
			if (letra == vogais[i]) {
				System.out.println("A letra é uma vogal");
				achei = true;
				break;
			}
		}
		
		if (achei == false) {
			System.out.println("A letra é uma consoante");
		}	
	
		scan.close();		
	}
}
