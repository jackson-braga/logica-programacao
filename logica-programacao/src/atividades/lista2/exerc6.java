package lista2;

import java.util.Scanner;

public class exerc6 {
	
	public static void main (String args []) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Digite a primeira nota: ");
		double n1 = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double n2 = scan.nextDouble();				
		
		double media = (n1+n2)/2;
		char conceito;
		
		if (media < 4) {
			conceito = 'E';
		} else if (media < 6) {
			conceito = 'D';
		} else if (media < 7.5) {
			conceito = 'C';
		} else if (media < 9) {
			conceito = 'B';
		} else conceito = 'A';
	
		System.out.println("Primeira nota: " + n1);
		System.out.println("Segunda nota: " + n2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);
		
		if (conceito == 'E' || conceito == 'D') {
			System.out.println("REPROVADO");
		} else {
			System.out.println("APROVADO");
		}
	
		scan.close();	
	}
}
