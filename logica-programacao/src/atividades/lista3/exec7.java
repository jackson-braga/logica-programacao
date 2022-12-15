package lista3;

import java.util.Scanner;

public class exec7 {

	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int b = scan.nextInt();
			
		int h = 0;
		do {
			System.out.println("Digite o segundo valor: ");
			h = scan.nextInt();
			if (h == 0) { System.out.println("Valor Inválido");}
		} while (h == 0);
		
		System.out.println("O resultado da divisão é: " + b/h);
				
		scan.close();
	}
}
