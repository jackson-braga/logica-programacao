package atividades.lista1;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        double litro = 0, valor_combustivel = 0, valor_desconto = 0;
        String tipo;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite:\n A - Alcool\n G - Gasolina:\n");
        tipo = scan.nextLine();
        tipo = tipo.toUpperCase();

        while ((!tipo.equals("A")) && (!tipo.equals("G"))) {
            System.out.println("Tipo combustível INVÁLIDO!");
            System.out.printf("Digite:\n A - Alcool\n G - Gasolina:\n");
            tipo = scan.nextLine();
            tipo = tipo.toUpperCase();
        }

        System.out.println("Quantidade de litros:");
        litro = scan.nextDouble();
        while (litro <= 0) {
            System.out.println("Quantidade INVÁLIDA!");
            System.out.println("Digite a quantidade de litros:");
            litro = scan.nextDouble();
        }
        if ((tipo.equals("A")) && (litro < 20)) {
            valor_combustivel = (3.69 * litro) - (((3.69 * litro) * 0.02));
        } else if ((tipo.equals("A")) && (litro >= 20)) {
            valor_combustivel = (3.69 * litro) - (((3.69 * litro) * 0.05));
        } else if ((tipo.equals("G")) && (litro < 20)) {
            valor_combustivel = (4.79 * litro) - (((4.79 * litro) * 0.03));
        } else if ((tipo.equals("G")) && (litro >= 20)) {
            valor_combustivel = (4.79 * litro) - (((4.79 * litro) * 0.06));
        }
        System.out.printf("Valor Total R$:%.2f\n", valor_combustivel);
    }
}
