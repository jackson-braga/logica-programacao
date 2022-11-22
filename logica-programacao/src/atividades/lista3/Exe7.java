package atividades.lista3;

import java.util.Scanner;

/**
 * @author CrisMoura on 20/11/2022
 */
public class Exe7 {
    public static void main(String[] args) {
//    Escreva um programa para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um
//    novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado
//    da divisão do primeiro valor lido pelo segundo valor lido. Acrescentar uma mensagem de 'VALOR INVÁLIDO'
//    no exercício caso o segundo valor informado seja ZERO.
        Scanner input = new Scanner(System.in);
        System.out.println(" Digite o primeiro Valor: ");
        double valor1 = input.nextInt();
        double valor2 = 0;

        do {
            System.out.println("Digite o segundo Valor: ");
            valor2 = input.nextInt();

            if ( valor1 != 0 && valor2 !=0){
                double resultado = valor1 / valor2;
                System.out.println("Resultado da Divisão : " + resultado);
            }
            else if (valor2 == 0){
                System.out.println("VALOR INVÁLIDO\n");
            }

        }while (valor2 == 0);


    }

}
