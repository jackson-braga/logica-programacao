package lista3;

import java.util.Scanner;

public class exec8 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
		
		String resp = "S";
		do {		
			float n1 = 0;
			do {
				System.out.println("Digite a nota da 1ª avaliação: ");
				n1 = scan.nextFloat();
				if (n1 < 0 || n1 > 10) { 
					System.out.println("Valor Inválido");
				}
			} while (n1 < 0 || n1 > 10);		
			float n2 = 0;
			do {
				System.out.println("Digite a nota da 2ª avaliação: ");
				n2 = scan.nextFloat();
				if (n1 < 0 || n1 > 10) { 
					System.out.println("Valor Inválido");
				}
			} while (n1 < 0 || n1 > 10);		
			System.out.println("A média é:" + (n1+n2)/2);		
			System.out.println("Novo cálculo (S/N)?");	
			resp = scan.next().toUpperCase();			
		} while (resp.substring(0,1).equals("S"));
					
		System.out.println("Fim");			
		scan.close();
	}
}
