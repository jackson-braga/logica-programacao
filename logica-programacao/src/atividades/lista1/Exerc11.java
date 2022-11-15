package atividades.lista1;

import java.util.Scanner;

/**
 * @author CrisMoura on 14/11/2022
 */
public class Exerc11 {
    public static void main(String[] args) {
//        Faça um programa para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque
//        de um produto. Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2).
//        Se a quantidade em estoque for maior ou igual a quantidade média, escrever a mensagem 'Não efetuar compra', senão
//        escrever a mensagem 'Efetuar compra'.

        Scanner leitor = new Scanner(System.in);

        System.out.println("Estoque Atual.");
        int estoqueAtual = leitor.nextInt();
            System.out.println("Estoque Máximo.");
            int estoqueMax = leitor.nextInt();
                System.out.println("Estoque Mínimo.");
                int estoqueMin = leitor.nextInt();

        int qtdMedia = (estoqueMax + estoqueMin) / 2;

        if(estoqueAtual >= qtdMedia){
            System.out.println("Não Efetuar Compra!");
        }else{
            System.out.println("Efetuar Compra!");
        }
    }
}
