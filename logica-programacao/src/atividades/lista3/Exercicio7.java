package atividades.lista3;

import java.util.Scanner;

public class Exercicio7 {
	private static final String INVALIDA = "Segundo valor inválido! Tente novamente: ";
	private static final String VALOR = "Insira um valor %d: ";
	private static final String RESULTADO = "A divisão vale %.2f \n";
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double[] valores = new double[2];
		System.out.printf(RESULTADO, calcula(valores, entrada));
		entrada.close();
	}
	
	private static double calcula(double[] valores, Scanner entrada) {
		for(int i = 0; i < valores.length; i++) {
			System.out.printf(VALOR, i+1);
			if(i == 0) {
				valores[i] = entrada.nextDouble();
				continue;
			}
			valores[i] = getQuociente(entrada);
		}
		return valores[0]/valores[1];
	}
	
	private static double getQuociente(Scanner entrada) {
		double valor = entrada.nextDouble();
		if(valor == 0) {
			System.out.print(INVALIDA);
			valor = getQuociente(entrada);
		}
		return valor;
	}
}
