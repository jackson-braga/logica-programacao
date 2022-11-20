package lista1;

import java.util.Scanner;

public class exerc3 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
		
		int totalEleitores, nulos, brancos = 0;
		do {
			System.out.println("Qual o total de eleitores do município?");
			totalEleitores = scan.nextInt();
		} while (totalEleitores < 0);
		
		do {
			System.out.println("Qual o total de votos brancos no município?");
			brancos = scan.nextInt();
		} while (brancos < 0 || brancos > totalEleitores);
				
		do {
			System.out.println("Qual o total de votos nulos no município?");
			nulos = scan.nextInt();
		} while (nulos < 0 || nulos > totalEleitores);
		
		System.out.println("Percentual de votos brancos é: " + (brancos*100)/totalEleitores + "%");
		System.out.println("Percentual de votos nulos é: " + (nulos*100)/totalEleitores + "%");
		System.out.println("Percentual de votos válidos é: " + ((totalEleitores - brancos - nulos)*100)/totalEleitores + "%");
		
		scan.close();	
	}	
}
