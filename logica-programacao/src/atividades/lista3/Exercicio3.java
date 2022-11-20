package atividades.lista3;

import java.util.Scanner;

public class Exercicio3 {
	private static final String IDADE = "Insira a idade da pessoa %d: ";
	private static final String RESULTADO = "A quantidade de maiores de idade são %d";
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] idades = getIdades(entrada);
		System.out.printf(RESULTADO, getQuantidadeMaiorIgual18(idades));
	}
	
	private static int[] getIdades(Scanner entrada) {
		int[] idades = new int[10];
		for(int i = 0; i < idades.length; i++) {
			System.out.printf(IDADE, i+1);
			idades[i] = entrada.nextInt();
		}
		return idades;
	}
	
	private static int getQuantidadeMaiorIgual18(int[] idades) {
		int maiores = 0;
		for(int idade : idades) {
			System.out.print(idade + " ");
			if(idade >= 18) {
				maiores++;
			}
		}
		return maiores;
	}
}
