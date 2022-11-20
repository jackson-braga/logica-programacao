package atividades.lista3;

import java.util.Scanner;

public class Exercicio8 {
	private static final String NOTA = "Insira a nota %d: ";
	private static final String RESULTADO = "A média vale %.2f Continuar? (S/N): ";
	
	public static void main(String[] args) {
		boolean finalizar = true;
		execute(finalizar);
	}
	
	private static void execute(boolean finalizar) {
		Scanner entrada = new Scanner(System.in);
		while(finalizar) {
			double media = getMedia(entrada);
			System.out.printf(RESULTADO, media);
			String resposta = new Scanner(System.in).nextLine();
			finalizar = resposta.length() == 1 && resposta.toUpperCase().equals("S");
		}
		entrada.close();
	}
	
	private static double getMedia(Scanner entrada) {
		double[] notas = new double[2];
		double soma = 0D;
		for(int i = 0; i < notas.length; i++) {
			notas[i] = validaValor(entrada, i);
			soma += notas[i];
		}
		return soma/notas.length;
	}
	
	private static double validaValor(Scanner entrada, int indice) {
		System.out.printf(NOTA, indice+1);
		double nota = entrada.nextDouble();
		nota = nota <= 10 ? nota : validaValor(entrada, indice);
		return nota;
	}
}