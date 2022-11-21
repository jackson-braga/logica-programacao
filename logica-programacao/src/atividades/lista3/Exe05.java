package atividades.lista3;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a altura do triângulo?");
        int linhas = scanner.nextInt();

        for(int index = 0; index < linhas; index++) {

            String piramide = new String(new char[index + 1]).replace("\0","*");
            System.out.println(piramide);

        }

    }

}
