package atividades.lista3;

import java.util.Scanner;

/*Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média aritmética
2. Média ponderada
3. Sair

Digite a opção desejada:
 Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
 Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
 Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida, mostrando uma mensagem.*/

public class Exercicio6 {
	private static final String MENU = "Menu de opções:\n" +
									   "1. Média aritmética\n" +
									   "2. Média ponderada\n" +
									   "3. Sair\n" +
									   "Selecione a opção desejada: ";
	
	private static final String PESOS = "Insira o valor do peso %d: ";
	private static final String NOTA = "Insira a nota %d: ";
	private static final String INVALIDA = "Soma dos pesos inválida! Tente novamente";
	private static final String RESULTADO = "A média desejada vale %.2f \n";
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print(MENU);
		int opcao = entrada.nextInt();
		execute(opcao, entrada);
		entrada.close();
	}
	
	private static void execute(int opcao, Scanner entrada) {
		switch(opcao) {
			case 1:
				calculaMediaAritmetica(entrada);
				break;
				
			case 2:
				calculaMediaPonderada(entrada);
				break;
				
			default:
				break;
		}
	}
	
	private static void calculaMediaAritmetica(Scanner entrada) {
		double[] notas = new double[2];
		for(int i = 0; i < notas.length; i++) {
			System.out.printf(NOTA, i+1);
			notas[i] = entrada.nextDouble();
		}
		System.out.printf(RESULTADO, (notas[0] + notas[1])/2);
	}
	
	private static void calculaMediaPonderada(Scanner entrada) {
		double[] notas = new double[3];
		int[] pesos = getPesos(entrada);
		for(int i = 0; i < notas.length; i++) {
			System.out.printf(NOTA, i+1);
			notas[i] = entrada.nextDouble();
		}
		System.out.printf(RESULTADO, calculaMediaPonderada(notas, pesos));
	}
	
	private static int[] getPesos(Scanner entrada) {
		int[] pesos = new int[3];
		int soma = 0;
		for(int i = 0; i <pesos.length; i++) {
			System.out.printf(PESOS, i+1);
			pesos[i] = entrada.nextInt();
			soma += pesos[i];
		}
		if(soma != 10) {
			System.out.println(INVALIDA);
			getPesos(entrada);
		}
		return pesos;
	}
	
	private static double calculaMediaPonderada(double[] notas, int[] pesos) {
		double soma = 0D;
		int somaPesos = 0;
		for(int i = 0; i < notas.length; i++) {
			soma += notas[i]*pesos[i];
			somaPesos += pesos[i];
		}
		return soma/somaPesos;
	}
}
