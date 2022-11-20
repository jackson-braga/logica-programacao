package lista3;

import java.util.Scanner;

public class exec6 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Menu de opções:");
		System.out.println("1. Média Aritmética");
		System.out.println("2. Média Ponderada");
		System.out.println("3. Sair");
		System.out.println("Digite a opção desejada:");
		int op = scan.nextInt();
		
		switch (op) {
		case 1: 
			System.out.println("Digite a primeira nota:");
			float not1 = scan.nextFloat();
			System.out.println("Digite a segunda nota:");
			float not2 = scan.nextFloat();
			System.out.println("A média aritmética é:" + (not1+not2)/2);
			break;
		case 2:
			float [] n = new float [3];
			float [] peso = new float [3];
			float divisor = 0, dividendo = 0;
			for (int i = 0; i < n.length; i++) {
				System.out.print("Digite a "+ (i+1) + "ª nota: ");
				n[i] = scan.nextFloat();
				System.out.print(" Digite o peso da nota: ");
				peso[i]= scan.nextInt();
				divisor +=  peso [i];
				dividendo += n[i]*peso[i];
			}				
			System.out.println("A média ponderada é:" + dividendo/divisor);
			break;
		case 3:
			System.out.println("Fim");
			break;
		}
		
		scan.close();
	}
}
