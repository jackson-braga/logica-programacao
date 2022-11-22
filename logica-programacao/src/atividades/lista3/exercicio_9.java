package atividades.lista3;

import java.util.Scanner;

public class exercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int contador = 0;

        do {
            System.out.println("Digite um valor maior que 0: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("VALOR INVÁLIDO");
            } else {
                for (int i = 1; i <= n; i++) {
                    System.out.println(i);
                }
                ++contador;
            }
        } while (contador < 1);
    }
}
