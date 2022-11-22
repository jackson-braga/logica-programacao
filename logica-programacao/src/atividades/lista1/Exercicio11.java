package atividades.lista1;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        //11. Faça um programa para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque
        //de um produto. Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2).
        //Se a quantidade em estoque for maior ou igual a quantidade média, escrever a mensagem 'Não efetuar compra', senão
        //escrever a mensagem 'Efetuar compra'.

        Scanner scann = new Scanner(System.in);

        System.out.println("Informe quantidade atual do estoque.");
        int quantAtual = scann.nextInt();

        System.out.println("Informe quantidade máxima do estoque.");
        int quantMax = scann.nextInt();

        System.out.println("Informe quantidade mínima do estoque.");
        int quantMin =  scann.nextInt();

        double quantMedia =  (quantMax+quantMin)/2.0;

        System.out.println(quantMedia);
        if(quantAtual < quantMedia){
            System.out.println("Efetuar compra.");
        }else {
            System.out.println("Não efetuar compra.");
        }
    }
}
