package lista1;

import java.util.Scanner;

public class exerc8 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Qual a sua primeira nota?");
		float N1 = scan.nextFloat();
		System.out.println("Qual a sua segunda nota?");
		float N2 = scan.nextFloat();
		
		float mediaFinal = (N1 + N2)/2;
		
		System.out.printf("A média final é: %.1f", mediaFinal);
		
		if (mediaFinal >= 6) {
			System.out.println("\n APROVADO");
		} else {
			System.out.println("\n REPROVADO");
		}		
		scan.close();	
	}
}
