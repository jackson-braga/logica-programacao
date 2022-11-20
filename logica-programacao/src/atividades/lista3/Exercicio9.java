package atividades.lista3;

import java.util.Scanner;

public class Exercicio9 {
	private static final String INVALIDA = "Valor inválido! Tente novamente: ";
	private static final String N = "Insira um valor N: ";
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print(N);
		int n = entrada.nextInt();
		while(n <= 0) {
			System.out.print(INVALIDA);
			n = entrada.nextInt();
		}
		exibeNumeros(n);
	}
	
	private static void exibeNumeros(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}
