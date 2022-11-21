package atividades.lista3;

import java.util.Scanner;

public class List03_Ex004 {
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
        System.out.println("Existem " + faixa1 + " pessoas com até 15 anos a porcentagem é de " + (faixa1 / idade.length * 100) + "%" );
        System.out.println("Existem " + faixa2 + " pessoas entre 16 e 30 anos a porcentagem é de " + (faixa2 / idade.length * 100) + "%");
        System.out.println("Existem " + faixa3 + " pessoas entre 31 e 45 anos a porcentagem é de " + (faixa3 / idade.length * 100) + "%");
        System.out.println("Existem " + faixa4 + " pessoas entre 46 e 60 anos a porcentagem é de " + (faixa4 / idade.length * 100) + "%");
        System.out.println("Existem " + faixa5 + " pessoas acima de 61 anos a porcentagem é de " + (faixa5 / idade.length * 100) + "%");

    }
}

