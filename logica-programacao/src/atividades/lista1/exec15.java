package lista1;

import java.util.Scanner;
import java.time.Year;

public class exec15 {

public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite ano do seu nascimento:");
		int anoNascimento = scan.nextInt();
				
		System.out.println("Digite o ano de ingresso na empresa: ");
		int anoInicial = scan.nextInt();
		
		int anoAtual = Year.now().getValue();
		int idade = anoAtual - anoNascimento;
		int trab = anoAtual - anoInicial;
									
		System.out.println("A sua idade é: " + idade);
		System.out.println("Seu tempo de trabalho é: " + trab);
		
		if (trab >= 30 || idade >= 65 || (idade >= 60 && trab >=25)) {		
			System.out.println("Requerer");
		} 
		else 	{
			System.out.println("Não requerer");
		}
		
		scan.close();	
	}
	
}
