package lista1;

import java.util.Scanner;
import java.time.Year;

public class exerc9 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o ano do seu nascimento?");
		int nasc = scan.nextInt();
		
		int anoAtual = Year.now().getValue();
		
		int idade = anoAtual - nasc;
				
		if (idade >= 16) {
			System.out.println("\n Você pode votar!");
		} else {
			System.out.println("\n Você não pode votar!");
		}		
		
		scan.close();	
	}	
}
