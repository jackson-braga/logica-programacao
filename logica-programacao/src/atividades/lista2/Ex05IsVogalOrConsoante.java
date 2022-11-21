package atividades.lista2;

import java.util.Scanner;

/* 5. Faça um programa que verifique se uma letra digitada é vogal ou consoante.
* */
public class Ex05IsVogalOrConsoante {

    public static void main(String[] args) {

        String caractere;
        boolean isVogal = false;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        caractere = in.next().toUpperCase();

        String[] vogais = {"A", "E", "I", "O", "U"};

        for (int i = 0; i < 5; i++) {

            if(caractere.equalsIgnoreCase(vogais[i])) {
                isVogal = true;
            }
        }

        System.out.printf("A letra %s é uma " + (isVogal == true ? "Vogal." : "Consoante."),caractere);



    }
}
