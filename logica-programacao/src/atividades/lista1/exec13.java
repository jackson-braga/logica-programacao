package lista1;

import java.util.Scanner;

public class exec13 {
	
	public static void main (String args []) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de litros: ");
		double lit = scan.nextDouble();
		
		System.out.println("Escolha o combustível digitando a letra:");
		System.out.println("A - álcool");
		System.out.println("G - gasolina");		
		String comb = scan.next().toUpperCase();
		
		double desc, p, total = 0;		
		switch (comb) {		
			case "A" :
				p = 3.69;
				if (lit > 20) {
					desc = 0.95;
					} else {
						desc = 0.98;
					}	
				total = lit * (p * desc);
				System.out.printf("O valor a ser pago é: R$ %.2f", total);
				break;
			case "G" :		
				p = 4.79;
				if (lit > 20) {
					desc = 0.94;
					} else {
						desc = 0.97;
					}
				total = lit * (p * desc);
				System.out.printf("O valor a ser pago é: R$ %.2f", total);
				break;
			default:
				System.out.println("Opção inválida");	
				break;
		}				
		scan.close();	
	}
}
