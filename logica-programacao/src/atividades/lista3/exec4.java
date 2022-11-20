package lista3;

import java.util.Scanner;

public class exec4 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
	
		float f1 = 0,f2 = 0,f3 = 0,f4 = 0,f5 = 0;		
		float [] idades = new float[10];
		
		for (int i = 0; i < idades.length; ++i) {
			System.out.printf("Digite a %dª idade: ", i+1);
			idades[i] = scan.nextFloat();
		}
		
		for (int j = 0; j < idades.length; j++) {
			if (idades[j] <= 15) {
				f1++;
			} else if (idades[j] <= 30) {
				f2++;			
			} else if (idades[j] <= 45) {
				f3++;
			} else if (idades[j] <= 60) {
				f4++;
			} else {
				f5++;
			}
		}
		
		System.out.println("A quantidade de pessoas com idade menor ou igual a 15 anos é: " + f1);
		System.out.println("A percentagem de pessoas nesta faixa etária é: " + (f1*100)/10 + "%");
		System.out.println("A quantidade de pessoas com idade entre 16 e 30 anos é: " + f2);
		System.out.println("A percentagem de pessoas nesta faixa etária é: " + (f2*100)/10 + "%");
		System.out.println("A quantidade de pessoas com idade entre 31 e 45 anos é: " + f3);
		System.out.println("A percentagem de pessoas nesta faixa etária é: " + (f3*100)/10 + "%");
		System.out.println("A quantidade de pessoas com idade entre 45 e 60 anos é: " + f4);
		System.out.println("A percentagem de pessoas nesta faixa etária é: " + (f4*100)/10 + "%");
		System.out.println("A quantidade de pessoas com idade acima de 61 anos é: " + f5);
		System.out.println("A percentagem de pessoas nesta faixa etária é: " + (f5*100)/10 + "%");
		
		scan.close();	
	}
}
