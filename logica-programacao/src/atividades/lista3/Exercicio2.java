package atividades.lista3;

import java.util.Scanner;

public class Exercicio2 {
	private static final String A = "A";
	private static final String B = "B";
	private static final String C = "C";
	private static final String VALOR = "Insira um valor para %s: ";
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] valores = getValores(entrada);
		exibirValores(valores);
		exibirValores(sortValores(valores));
		exibirValores(unsortValores(valores));
	}
	
	private static int[] getValores(Scanner entrada) {
		int[] valores = new int[3];
		valores[0] = getValor(entrada, A);
		valores[1] = getValor(entrada, B);
		valores[2] = getValor(entrada, C);
		return valores;
	}
	
	private static int getValor(Scanner entrada, String variavel) {
		System.out.printf(VALOR, variavel);
		return entrada.nextInt();
	}
	
	private static void exibirValores(int[] valores) {
		for(int valor : valores) {
			System.out.print(valor + " ");
		}
		System.out.println();
	}
	
	private static int[] sortValores(int[] valores) {
		int menor = 0;
		for(int i = 0; i < valores.length; i++) {
			for(int j = i+1; j < valores.length; j++) {
				if(valores[i] > valores[j]) {
					menor = valores[j];
					valores[j] = valores[i];
					valores[i] = menor;
				}
			}
		}
		return valores;
	}
	
	private static int[] unsortValores(int[] valores) {
		int maior = 0;
		for(int i = 0; i < valores.length; i++) {
			for(int j = i+1; j < valores.length; j++) {
				if(valores[i] < valores[j]) {
					maior = valores[j];
					valores[j] = valores[i];
					valores[i] = maior;
				}
			}
		}
		return valores;
	}
}
