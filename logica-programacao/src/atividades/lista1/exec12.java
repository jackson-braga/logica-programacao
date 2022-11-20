package lista1;

import java.util.Scanner;

public class exec12 {

	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Medida A: ");
		int a = scan.nextInt();
		System.out.println("Medida B: ");
		int b = scan.nextInt();
		System.out.println("Media C: ");
		int c = scan.nextInt();
					
		if ((a < b+c) && (b < c+a) && (c < a+b)) {
			System.out.println("As medidas formam um triângulo");
		} else {
			System.out.println("As medidas NÃO formam um triângulo");
		}		
		scan.close();	
	}
}
