package lista1;

//      11. Faça um programa para ler: quantidade atual em estoque, quantidade
//      máxima em estoque e quantidade mínima em estoque de um produto.
//      Calcular e escrever a quantidade média
//      ((quantidade média = quantidade máxima + quantidade mínima)/2).
//      Se a quantidade em estoque for maior ou igual a quantidade média, escrever
//      a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.

import java.util.Scanner;

public class Questao11 {

    public static void main(String[] args) {

        //      Criar variáveis com o a quantidade de atual, máxima e mínima
        //      de produtos em estoque

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de atual do produto em estoque: ");
        int qtdAtual = scan.nextInt();
        System.out.println("Informe a quantidade de máxima do produto em estoque: ");
        int qtdMax = scan.nextInt();
        System.out.println("Informe a quantidade de mínima do produto em estoque: ");
        int qtdMin = scan.nextInt();

        //      Calcular e exibir a média

        int qtdMedia = (qtdMax + qtdMin) / 2;
        System.out.println("A quantidade média de produtos é de " + qtdMedia);

        //      Calcular se é necessário comprar e exibir mensagem.

        if (qtdAtual >= qtdMedia ) {
            System.out.println("Não efetuar compra.");
        } else {
            System.out.println("Efetuar compra.");
        }
    }
}
