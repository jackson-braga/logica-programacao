package lista1;

import java.util.Scanner;

public class exerc10 {

	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite as horas trabalhadas neste mês: ");
		double horasTrabalhadas = scan.nextInt();
		
		System.out.println("Digite o salário por hora de trabalho: ");
		double ganho = scan.nextInt();
				
		int horasMes = 4 * 40;
		
		double extra = 0;
		if (horasTrabalhadas > horasMes) {
			double horasExtra = horasTrabalhadas - horasMes;
			extra = horasExtra * (ganho * 1.5);
		}
		
		double total = (horasTrabalhadas * ganho) + extra;
		
		System.out.printf("O total de recebimentos é: R$ %.2f", total);
		
		scan.close();	
	}	
	
}
