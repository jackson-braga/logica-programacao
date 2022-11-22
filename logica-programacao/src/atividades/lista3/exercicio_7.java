package atividades.lista3;

import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {
        double n1;
        double n2;

        Scanner scaneer = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        n1 = scaneer.nextDouble();

        n2 = 0;
        while (n2 == 0) {
            System.out.println("Digite o segundo valor, ele deve ser diferente de 0");
            n2 = scaneer.nextDouble();
            if (n2 == 0) {
                System.out.println("VALOR INVÁLIDO");
            }
        }

        System.out.println(n1 / n2);
    }
}
