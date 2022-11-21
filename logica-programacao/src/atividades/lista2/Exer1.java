package atividades.lista2;

/**
 * @author CrisMoura on 20/11/2022
 */
import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
//Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte a idade de uma pessoa
// e diga se ela pode doar sangue ou não.
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua idade.");
        int idade = input.nextInt();
        if (idade >= 18 && idade <= 67) {
            System.out.println("Pode doar sangue.");
        } else {
            System.out.println("Não pode doar sangue.");
        }

    }
}

