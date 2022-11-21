/*Lista de Exercícios 3
Exercício 4:
Faça um programa que receba a idade de 10 pessoas e que calcule e mostre:
a. A quantidade de pessoas em cada faixa etária;
b. A percentagem de pessoas nas faixa etária, com relação ao total de pessoas:
● Até 15 anos
● De 16 a 30 anos
● De 31 a 45 anos
● De 46 a 60 anos
● Acima de 61 anos
 */

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int idade;
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("Digite a idade da pessoa: ");
            idade = scann.nextInt();
            if (idade >= 0 && idade <= 15) {
                cont1 = cont1++;
            } else if (idade > 15 && idade <= 30) {
                cont2 = cont2 + 1;
            } else if (idade > 30 && idade <= 45) {
                cont3 = cont3 + 1;
            } else if (idade > 45 && idade <= 60) {
                cont4 = cont4 + 1;
            } else {
                cont5 = cont5 + 1;
            }
        }
        System.out.println("A quantidade de pessoas até 15 anos é: " + cont1);
        System.out.println("O percentual de pessoas com até 15 anos é de " + cont1 * 10 + " por cento");
        System.out.println("A quantidade de pessoas de 16 a 30 anos é: " + cont2);
        System.out.println("O percentual de pessoas de 16 a 30 anos é de " + cont2 * 10 + " por cento");
        System.out.println("A quantidade de pessoas de 31 a 45 anos é: " + cont3);
        System.out.println("O percentual de pessoas de 31 a 45 anos é de " + cont3 * 10 + " por cento");
        System.out.println("A quantidade de pessoas de 46 a 60 anos é: " + cont4);
        System.out.println("O percentual de pessoas de 46 a 60 anos é de " + cont4 * 10 + " por cento");
        System.out.println("A quantidade de pessoas maiores de 60 anos é: " + cont5);
        System.out.println("O percentual de pessoas maiores de 60 anos é de " + cont5 * 10 + " por cento");
           }
}
