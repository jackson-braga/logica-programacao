package lista3;

import java.util.Scanner;

public class exec9 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
		
		float N = -1;
		do {
			System.out.println("Digite um valor N:");
			N = scan.nextFloat();
			if (N <= 0) { 
				System.out.println("Valor Inválido");
			}
		} while (N <= 0);		
		
		for (int i = 1; i <= N; i++) {
			float teste = i * 10;
			float rest = teste % 10;
			if (rest == 0) {
			System.out.print(" " + i);			
			}
		}				
		scan.close();
	}
}
