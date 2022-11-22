package atividades.lista3;

import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        int contador = 0;
        int idade;
        double faixa1 = 0;
        double faixa2 = 0;
        double faixa3 = 0;
        double faixa4 = 0;
        double faixa5 = 0;

        Scanner scanner = new Scanner(System.in);
         do {
             System.out.println("Digite a idade de cada pessoa: ");
             idade = scanner.nextInt();
             if (idade <= 15){
                 faixa1++;
             } else if (idade <= 30){
                 faixa2++;
             }else if (idade <= 45){
                 faixa3++;
             }else if (idade <= 60){
                 faixa4++;
             }else {
                 faixa5++;
             }
             contador++;
         } while (contador != 10);
         double p1 = ((faixa1 / 10)*100);
         double p2 = ((faixa2 / 10)*100);
         double p3 = ((faixa3 / 10)*100);
         double p4 = ((faixa4 / 10)*100);
         double p5 = ((faixa5 / 10)*100);

        System.out.println("A quantidade de pessoas com até 15 anos é: "+ faixa1 +", que corresponde a:  " + p1 + "% do total de pessoas");
        System.out.println("A quantidade de pessoas entre 16 e 30 anos é: "+ faixa2 +", que corresponde a:  " + p2 + "% do total de pessoas");
        System.out.println("A quantidade de pessoas entre 31 e 45 anos é: "+ faixa3 +", que corresponde a:  " + p3 + "% do total de pessoas");
        System.out.println("A quantidade de pessoas entre 46 e 60 anos é: "+ faixa4 +", que corresponde a:  " + p4 + "% do total de pessoas");
        System.out.println("A quantidade de pessoas acima de 61 anos é: "+ faixa5 +", que corresponde a:  " + p5 + "% do total de pessoas");
    }

}

