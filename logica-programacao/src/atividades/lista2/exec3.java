package lista2;

import java.util.Scanner;

public class exec3 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Digite medida do primeiro lado do triângulo: ");
		int L1 = scan.nextInt();
							
		System.out.println("Digite a medida do segundo lado do triângulo: ");
		int L2 = scan.nextInt();
		
		System.out.println("Digite medida do terceiro lado do triângulo: ");
		int L3 = scan.nextInt();
		
		if ((L1 == L2) && (L2 == L3)) {
			System.out.println("Triângulo equilátero");
		} else if ((L1 == L2) || (L2 == L3) || (L1 == L3)){
			System.out.println("Triângulo isóscele");
		} else {
			System.out.println("Triângulo escaleno");
		}
			
		scan.close();	
	}
}
