package atividades.lista3;

import java.util.Scanner;

public class List03_Ex003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] idade = new int[10];
        int quantPessoas = 0;

        for(int i = 0; i < idade.length; i++) {
            System.out.println("Digite a idade da " + (i + 1) + "ª pessoa");
            idade[i] = scan.nextInt();
            if(idade[i] >= 18)
                quantPessoas++;
        }
        System.out.println("Existem " + quantPessoas + " pessoas maiores de 18 anos");

    }
}
