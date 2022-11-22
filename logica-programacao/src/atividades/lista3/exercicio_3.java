package atividades.lista3;

import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        int idade;
        int contador = 0;
        int i;
        Scanner scanner = new Scanner(System.in);

        for (i = 1; i <= 10; i++) {
            System.out.println("Digite a idade de cada pessoa: ");
            idade = scanner.nextInt();
            if (idade >= 18) {
                contador++;
            }
        }
        System.out.println("O número de pessoas com idade maior ou igual a 18 anos é: " + contador);

    }

}

