package lista3;

import java.util.Scanner;

public class exec3 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
	
		int cont = 0;		
		float [] idades = new float[10];
		
		for (int i = 0; i < idades.length; ++i) {
			System.out.printf("Digite a %dª idade: ", i+1);
			idades[i] = scan.nextFloat();
		}
		
		for (int j = 0; j < idades.length; j++) {
			if (idades[j] >= 18) {
				System.out.print(" " + idades[j]);
				cont ++;
			}	
		}
		
		System.out.println(" ");
		System.out.println("A quantidade de pessoas com idade maior ou igual a 18 é: " + cont);
				
		scan.close();	
	}
}
	
