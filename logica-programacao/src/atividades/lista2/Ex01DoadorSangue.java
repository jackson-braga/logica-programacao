package atividades.lista2;

import java.util.Scanner;

/* 1. Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte
 a idade de uma pessoa e diga se ela pode doar sangue ou não.
* */
public class Ex01DoadorSangue {

    public static void main(String[] args) {

        int idade;
        Scanner in = new Scanner(System.in);
        System.out.print(" Digite sua idade: ");
        idade = in.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.printf("Como sua idade é %d anos, você pode Doar Sangue.", idade);
        } else {
            System.out.printf("Como sua idade é %d anos, você não pode Doar Sangue.", idade);
        }


    }
}
