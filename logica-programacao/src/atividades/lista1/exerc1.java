package lista1;

import java.util.Scanner;

public class exerc1 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
		int b = 0;
		do {
			System.out.println("Digite a base do triângulo: ");
			b = scan.nextInt();
		} while (b <= 0);
	
		int h = 0;
		do {
			System.out.println("Digite a altura do triângulo: ");
			h = scan.nextInt();
		} while (h <= 0);
		
		System.out.println("A área do triângulo é: " + b*h);
		
		scan.close();	
	}	
}
