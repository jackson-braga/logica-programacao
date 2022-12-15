package lista1;

import java.util.Scanner;

public class exerc6 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Qual a sua primeira nota?");
		float N1 = scan.nextFloat();
		System.out.println("Qual a sua segunda nota?");
		float N2 = scan.nextFloat();
		System.out.println("Qual a sua terceira nota?");
		float N3 = scan.nextFloat();
		
		float mediaFinal = ((N1 * 2) + (N2 * 3) + (N3 * 5))/10;
		
		System.out.printf("A média final é: %.1f", mediaFinal);
		
		scan.close();	
	}

}
