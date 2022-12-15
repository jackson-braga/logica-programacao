package lista2;

import java.util.Scanner;

public class exec2 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite o número de lados do polígono: ");
		int num = scan.nextInt();
							
		System.out.println("Digite a medida do polígono em centímetros: ");
		float medida = scan.nextFloat();
		
		if (num < 3) {
			System.out.println("Não é um polígono!");
		} else {
			switch (num) {
				case 3: double area = (Math.sqrt(3)/4) * (medida*medida);
						System.out.printf("Triângulo com área de %.2f", area, " centímetros");
						break;
				case 4: System.out.printf("Quadrado com área de " + medida*medida + " centímetros");
						break;
				case 5: System.out.println("Pentágono");
						break;
				default: System.out.println("Polígono não identificado!");
						break;
			}
		}
		scan.close();	
	}
}
