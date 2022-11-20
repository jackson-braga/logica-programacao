package lista1;

import java.util.Scanner;

public class exerc2 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual a sua idade em anos, meses e dias?");
		System.out.print("Anos:");
		int ano = scan.nextInt();
		System.out.print("Meses:");
		int mes = scan.nextInt();
		System.out.print("Dias:");
		int dia = scan.nextInt();
		
		int tempo = dia + (mes * 30) + (ano * 365);
		System.out.println("Você já viveu " + tempo + " dias");
		
		scan.close();	
	}	
	

}
