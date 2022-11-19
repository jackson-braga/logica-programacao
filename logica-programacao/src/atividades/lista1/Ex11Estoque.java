package atividades.lista1;

/* 11. Faça um programa para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade
mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade média = quantidade máxima
+ quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a quantidade média, escrever a mensagem
'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.
* */

import java.util.Scanner;

public class Ex11Estoque {

    public static void main(String[] args) {

        int qtMaxEstoque, qtMinEstoque, qtAtualEstoque, qtMedia;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite a quantidade atual em Estoque: ");
        qtAtualEstoque = in.nextInt();
        System.out.print("Digite a quantidade minima em Estoque: ");
        qtMinEstoque = in.nextInt();
        System.out.print("Digite a quantidade máxima em Estoque: ");
        qtMaxEstoque = in.nextInt();

        qtMedia = (qtMinEstoque + qtMaxEstoque)/2;

        if(qtAtualEstoque >= qtMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }


    }
}
