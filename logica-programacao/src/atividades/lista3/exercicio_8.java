package atividades.lista3;

import java.util.Scanner;

public class exercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sn = "";
        double n1;
        double n2;
        do {
            System.out.println("Digite a sua primeira nota: ");
             n1 = scanner.nextDouble();
            if (n1 < 0 || n1 > 10) {
                System.out.println("Sua nota não é válida!");
            }

            System.out.println("Digite a sua segunda nota: ");
            n2 = scanner.nextDouble();
            if (n2 < 0 || n2 > 10) {
                System.out.println("Sua nota não é válida!");
            }

            double calculo = (n1 + n2) / 2;

            System.out.println("A sua média foi: " + calculo);
            System.out.println("DESEJA FAZER O CÁLCULO NOVAMENTE (S/N)? ");
            sn = scanner.next().toLowerCase();

        } while (sn.equals("s"));
        System.out.println("PROGRAMA ENCERRADO!");

    }
}
