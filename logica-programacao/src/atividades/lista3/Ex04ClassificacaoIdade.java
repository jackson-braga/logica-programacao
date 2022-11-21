package atividades.lista3;

import java.util.Scanner;

/* 4. Faça um programa que receba a idade de 10 pessoas e que calcule e mostre:
a. A quantidade de pessoas em cada faixa etária;
b. A percentagem de pessoas nas faixa etária, com relação ao total de pessoas:
        ● Até 15 anos
        ● De 16 a 30 anos
        ● De 31 a 45 anos
        ● De 46 a 60 anos
        ● Acima de 61 anos
* */
public class Ex04ClassificacaoIdade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] idade = new int[10];
        double faixa1 = 0;
        double faixa2 = 0;
        double faixa3 = 0;
        double faixa4 = 0;
        double faixa5 = 0;

        for(int i = 0; i < idade.length; i++) {
            System.out.println("Digite a idade da " + (i + 1) + "ª pessoa");
            idade[i] = scan.nextInt();
            if(idade[i] <= 15)
                faixa1++;
            if(idade[i] > 15 && idade[i] <= 30)
                faixa2++;
            if(idade[i] > 30 && idade[i] <= 45)
                faixa3++;
            if(idade[i] > 45 && idade[i] <= 60)
                faixa4++;
            if(idade[i] > 60)
                faixa5++;
        }
        System.out.printf("Existem %.0f pessoas com até 15 anos a porcentagem é de %.2f%%\n", faixa1, (faixa1 / idade.length * 100));
        System.out.printf("Existem %.0f pessoas entre 16 e 30 anos a porcentagem é de %.2f%%\n", faixa2, (faixa2 / idade.length * 100));
        System.out.printf("Existem %.0f pessoas entre 31 e 45 anos a porcentagem é de %.2f%%\n", faixa3,(faixa3 / idade.length * 100));
        System.out.printf("Existem %.0f pessoas entre 46 e 60 anos a porcentagem é de %.2f%%\n", faixa4,(faixa4 / idade.length * 100));
        System.out.printf("Existem %.0f pessoas acima de 61 anos a porcentagem é de %.2f%%\n", faixa5,(faixa5 / idade.length * 100));

    }
}
