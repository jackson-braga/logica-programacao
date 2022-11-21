package atividades.lista3;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int idade = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Idade:");
            idade = scan.nextInt();
            while (idade <= 0) {
                System.out.println("Idade INVÁLIDA!");
                System.out.println("Digite Idade:");
                idade = scan.nextInt();
            }
            if (idade <= 15) {
                cont1++;
            } else if ((idade >= 16) && (idade <= 30)) {
                cont2++;
            } else if ((idade >= 31) && (idade <= 45)) {
                cont3++;
            } else if ((idade >= 46) && (idade <= 60)) {
                cont4++;
            } else {
                cont5++;
            }
        }
        double media1 = (cont1 * 100) / 10;
        double media2 = (cont2 * 100) / 10;
        double media3 = (cont3 * 100) / 10;
        double media4 = (cont4 * 100) / 10;
        double media5 = (cont5 * 100) / 10;

        System.out.println("Até 15 anos: " + cont1 + " pessoas " + media1 + "%");
        System.out.println("De 16 a 30 anos: " + cont2 + " pessoas " + media2 + "%");
        System.out.println("De 31 a 45 anos: " + cont3 + " pessoas " + media3 + "%");
        System.out.println("De 46 a 60 anos: " + cont4 + " pessoas " + media4 + "%");
        System.out.println("Acima de 61 anos: " + cont5 + " pessoas " + media5 + "%");
    }
}
