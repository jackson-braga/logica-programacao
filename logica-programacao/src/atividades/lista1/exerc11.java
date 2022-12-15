package lista1;

import java.util.Scanner;

public class exerc11 {

	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Quantidade atual de estoque: ");
		int e = scan.nextInt();
		System.out.println("Quantidade máxima de estoque: ");
		int eMax = scan.nextInt();
		System.out.println("Quantidade mínima de estoque: ");
		int eMin = scan.nextInt();
		
		int media = (eMax + eMin) /2;
		
		System.out.println("A quantidade média de estoque é: " + media);
		
		if (e > media) {
			System.out.println("\n NÃO EFETUAR COMPRA");
		} else {
			System.out.println("\n EFETUAR COMPRA");
		}		
		scan.close();	
	}
}
