package atividades.lista1;

import java.util.Scanner;

public class exercicio_7 {
    //Calcular e escrever o valor total das maçãs de acordo com as condições
    public static void main(String[] args) {
        int nMacas;
        double valor;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de maçãs que quer comprar: ");
        nMacas = scanner.nextInt();

        if (nMacas < 12){
            valor = nMacas*1.3;
        }else {
            valor = nMacas;
        }
        System.out.println("O custo total da compra é: " + valor + " reais.");
    }
}
