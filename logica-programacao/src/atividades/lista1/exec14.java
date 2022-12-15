package lista1;

import java.util.Scanner;

public class exec14 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite qual o produto desejado:");
		String prod = scan.next();
				
		System.out.println("Digite o preço unitário do produto: ");
		double pr = scan.nextFloat();
		
		System.out.println("Digite a quantidade adquirida: ");
		double quant = scan.nextFloat();
		
		double d= 0;		
		if (quant <= 5) {		
			d = 0.98;
		} else if (quant <= 10) {
				d = 0.97;
		} else 	d = 0.95;
								
		double total = quant * pr;
		double compraDesconto = total * d;
		double desc = total - compraDesconto;
		
		System.out.printf("\n O valor total da compra de %s é: R$ %.2f", prod, total);
		System.out.printf("\n O valor do desconto é: R$ %.2f", desc);
		System.out.printf("\n O valor final da compra é: R$ %.2f", compraDesconto );
		
		scan.close();	
	}
}
