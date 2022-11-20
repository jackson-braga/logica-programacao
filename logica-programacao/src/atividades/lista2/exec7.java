package lista2;

import java.util.Scanner;

public class exec7 {

	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite o ano:");
		int ano = scan.nextInt();
		
		int div4 = ano % 4;
		int div400 = ano % 400;
		int div100 = ano % 100;
							
		if ((div4 == 0) || (div400 == 0) && (div100 != 0)) {
			System.out.println("Ano Bissexto");
		} else {
			System.out.println("Ano NÃO é bissexto");
		}		
		scan.close();	
	}		
}
