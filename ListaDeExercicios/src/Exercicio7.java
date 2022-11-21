/*Lista de Exercícios 1
Exercício 7:
As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12.
Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra
 */

import java.util.Scanner;

public class Exercicio7 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de maçãs: ");
        int quantidadeMacas = scan.nextInt();
        double precoMaca;
        if (quantidadeMacas >= 12) {
            precoMaca = quantidadeMacas * 1.0;
        } else if (quantidadeMacas < 12 && quantidadeMacas > 0) {
            precoMaca = quantidadeMacas * 1.3;
        } else {
            System.out.println("Quantidade informada inválida");
            return;
        }
        System.out.println("Você comprou " + quantidadeMacas + " maçãs por " + precoMaca + " reais");
    }


}
