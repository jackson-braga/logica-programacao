package atividades.lista2;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a quantidade de lados: ");
        int quantLados = sc.nextInt();
        System.out.println("Entre com o tamanho em centímetros de cada lado: ");

        if (quantLados == 3){
            System.out.println("O objeto é um triângulo: ");
        }



        sc.close();
    }
}
