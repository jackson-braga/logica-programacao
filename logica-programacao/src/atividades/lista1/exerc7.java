package lista1;

import java.util.Scanner;

public class exerc7 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
				
		float quant = 0;
		do {
			System.out.println("Quantas maçãs compradas?");
			quant = scan.nextFloat();
		} while (quant <= 0);
		
		float custo = 0;
		if (quant < 12) {
			custo = 1.30f; 
		} else { 
			custo = 1f;
			}
				
		float total = quant * custo;
		System.out.printf("O custo total da compra é: R$ %.2f", total);
		
		scan.close();	
	}	
}
