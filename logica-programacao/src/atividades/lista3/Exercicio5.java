package atividades.lista3;

import java.util.Scanner;

public class Exercicio5 {
	private static final String ALTURA = "Insira o valor da altura do triângulo: ";
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print(ALTURA);
		int altura = entrada.nextInt();
		for(int i = 0; i < altura; i++) {
			System.out.println("*".repeat(i+1));
		}
	}
}