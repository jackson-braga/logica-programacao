package atividades.lista3;

import java.util.Scanner;

public class Exercicio4 {
	private static final String[] FAIXAS = {"Até 15 anos: %d", "De 16 a 30 anos: %d",
											"De 31 a 45 anos: %d", "De 46 a 60 anos: %d",
											"Acima de 61 anos: %d"};
	
	private static final String IDADE = "Insira a idade da pessoa %d: ";
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] idades = getIdades(entrada);
		for(int i = 0; i < FAIXAS.length; i++) {
			System.out.printf(FAIXAS[i].concat("\n"), getQuantidade(idades, i));
		}
	}
	
	private static int[] getIdades(Scanner entrada) {
		int[] idades = new int[10];
		for(int i = 0; i < idades.length; i++) {
			System.out.printf(IDADE, i+1);
			idades[i] = entrada.nextInt();
		}
		return idades;
	}
	
	
	
	private static int getQuantidade(int[] idades, int indice) {
		switch(indice) {
			case 0:
				return getQuantidade(idades, 0, 15);
				
			case 1:
				return getQuantidade(idades, 16, 30);
			
			case 2:
				return getQuantidade(idades, 31, 45);
				
			case 3:
				return getQuantidade(idades, 46, 60);
				
			default:
				return getQuantidade(idades, 61, 200);
		}
	}
	
	private static int getQuantidade(int[] idades, int idade1, int idade2) {
		int qtd = 0;
		for(int idade : idades) {
			if(idade >= idade1 && idade <= idade2) {
				qtd++;
			}
		}
		return qtd;
	}
}
