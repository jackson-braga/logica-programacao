package lista1;

import java.util.Scanner;

public class exerc4 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Qual o valor do salário?");
		float salario = scan.nextFloat();
		
		System.out.println("Qual o total de vendas?");
		float vendas = scan.nextFloat();
				
		float comissao = vendas * 0.05f;
		
		float total = salario + comissao;
		
		System.out.printf("O total de recebimentos é: R$ %.2f", total);
		
		scan.close();	
	}	
}
