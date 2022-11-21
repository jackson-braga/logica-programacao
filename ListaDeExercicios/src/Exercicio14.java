/* Lista de Exercícios 1
Exercício 14:
Faça um programa para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o
total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se
que:
● Se quantidade <= 5 o desconto será de 2%
● Se quantidade > 5 e quantidade <=10 o desconto será de 3%
● Se quantidade > 10 o desconto será de 5%
 */

import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double quantidade;
        double preco;
        double desconto;
        double montante;
        double valorFinal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do seu produto: ");
        String p = scanner.next();
        System.out.println("Digite a quantidade desejada deste mesmo produto: ");
        quantidade = scanner.nextDouble();
        System.out.println("Digite o preço unitário do produto: ");
        preco = scanner.nextDouble();

        if (quantidade <= 5) {
            montante = quantidade * preco;
            desconto = ((quantidade * preco) / 100) * 2;
            valorFinal = montante - desconto;
            System.out.println("O produto custa " + montante + " reais. \n" + "O desconto é de: " + desconto + " \n" + "O valor total a pagar é R$: " + valorFinal);
        } else if (quantidade > 5 && quantidade <= 10) {
            montante = quantidade * preco;
            desconto = ((quantidade * preco) / 100) * 3;
            valorFinal = montante - desconto;
            System.out.println("O produto custa " + montante + " reais. \n" + "O desconto é de: " + desconto + " reais. \n" + "O valor total a pagar é R$: " + valorFinal);
        } else if (quantidade > 10) {
            montante = quantidade * preco;
            desconto = ((quantidade * preco) / 100) * 5;
            valorFinal = montante - desconto;
            System.out.println("O produto custa: " + montante + " reais. \n" + "O desconto é de: " + desconto + " reais. \n" + "O valor total a pagar é R$: " + valorFinal);


        }
    }
}
