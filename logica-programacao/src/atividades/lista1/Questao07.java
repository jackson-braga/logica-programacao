package lista1;

//        As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia,
//        e R$ 1,00 se forem compradas pelo menos 12.
//        Escreva um programa que leia o número de maçãs compradas,
//        calcule e escreva o custo total da compra.

import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args) {
        //      Criar variável e receber valor das maçãs compradas

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantas maças serão compradas: ");
        float macasCompradas = scan.nextFloat();

        //      Criar variavel com o custo total da compra, recebendo o resultado
        //      do calculo e exibindo posteriormente.
        if (macasCompradas < 12 && macasCompradas > 0) {
            System.out.printf("O custo total da compra de " + (int)macasCompradas + " maçã(s) é de R$ %.2f", (1.3 * macasCompradas));
        } else if (macasCompradas >= 12) {
            System.out.printf("O custo total da compra de " + (int)macasCompradas + " maçã(s) é de R$ %.2f", macasCompradas);
        } else {
            System.out.println("Número inválido para compra!");
        }
    }
}
