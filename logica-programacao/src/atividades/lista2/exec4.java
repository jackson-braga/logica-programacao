package lista2;

import java.util.Scanner;

public class exec4 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Atenção - A soma dos ângulos de um triângulo é igual a 180 graus");
		
		int a1, a2, a3;
		do {
			System.out.println("Digite o primeiro ângulo do triângulo: ");
			a1 = scan.nextInt();
		} while ( a1 > 180);
							
		do {
			System.out.println("Digite o segundo ângulo do triângulo: ");
			a2 = scan.nextInt();
		} while ( a1 + a2 > 180);
		
		do {
			System.out.println("Digite o terceiro ângulo do triângulo: ");
			a3 = scan.nextInt();
		} while ( a1 + a2 + a3 > 180);
		
		if (a1 == 90 || a2 == 90 || a3 == 90) {
			System.out.println("Triângulo retângulo");
		} else if (a1 > 90 || a2 > 90 || a3 > 90){
			System.out.println("Triângulo obtusângulo");
		} else {
			System.out.println("Triângulo acutângulo");
		}
			
		scan.close();	
	}

}
