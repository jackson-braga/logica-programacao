package lista3;

import java.util.Scanner;
import java.util.Arrays;

public class exec2 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] abc = new int [3];
		System.out.println("Digite o valor de A:");
		abc[0] = scan.nextInt();					
		System.out.println("Digite o valor de B:");
		abc[1] = scan.nextInt();		
		System.out.println("Digite o valor de C:");
		abc[2] = scan.nextInt();		
		
		System.out.println("Ondem de entrada: ");
		System.out.println( abc[0] + " " + abc[1] + " " + abc[2]);
		
		Arrays.sort(abc);
		int [] abcinvert = new int [3];
		int cont = 2;
		System.out.println("Ondem crescente: ");
		for (int i=0; i < abc.length; i++) {
			System.out.print(" " + abc[i]);
			abcinvert[cont] = abc [i];
			cont--;
		}
			
		System.out.println(" ");
		System.out.println("Ondem decrescente: ");
		for (int i= 0; i < abcinvert.length; i++) {
			System.out.print(" " + abcinvert[i]);
		}
		
	//	System.out.println("Digite o valor de A:");
	//	int A = scan.nextInt();					
	//	System.out.println("Digite o valor de B:");
	//	int B = scan.nextInt();		
	//	System.out.println("Digite o valor de C:");
	//	int C = scan.nextInt();		
		
	//	System.out.println("Ondem de entrada " + A + " " + B + " " + C);
		
	//	if (A > B && B > C) {
	//		System.out.println("Ondem crescente " + C + " " + B + " " + A);
	//		System.out.print("Ondem decrescente " + A + " " + B + " " + C);
	//	} else if (A > C && C > B ) {
	//		System.out.println("Ondem crescente " + B + " " + C + " " + A);
	//		System.out.print("Ondem decrescente " + A + " " + C + " " + B);
	//	} else if ( B > A && A > C ) {
	//		System.out.println("Ondem crescente " + C + " " + A + " " + B);
	//		System.out.print("Ondem decrescente " + B + " " + A + " " + C);
	//	} else if ( B > C && C > A ) {
	//		System.out.println("Ondem crescente " + A + " " + C + " " + B);
	//		System.out.print("Ondem decrescente " + B + " " + C + " " + A);
	//	} else if ( C > A && A > B ) {
	//		System.out.println("Ondem crescente " + B + " " + A + " " + C);
	//		System.out.print("Ondem decrescente " + C + " " + A + " " + B);
	//	} else {
	//		System.out.println("Ondem crescente " + B + " " + A + " " + C);
	//		System.out.print("Ondem decrescente " + C + " " + A + " " + B);
	//	}
		
		scan.close();	
	}
}
