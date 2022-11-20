package atividades.lista1;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {

        int qtdMacas;
        float totalCompra;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas maçãs você comprou?");
        qtdMacas = scanner.nextInt();

        if (qtdMacas > 0 && qtdMacas < 12  ) {
            totalCompra = qtdMacas * 1.3f;
            System.out.println("Valor total da compra: R$" + totalCompra + ".");

        } else if (qtdMacas >= 12) {
            totalCompra = qtdMacas * 1.0f;
            System.out.println("Valor total da compra: R$" + totalCompra + ".");

        } else {
            System.out.println("Não foi possível calcular o valor da compra!");

        }

    }

}
