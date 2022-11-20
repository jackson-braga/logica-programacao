package atividades.lista2;

import java.util.Scanner;

public class exercicio_1 {
    //Saber se pode doar sangue (Entre 18 e 67 anos)
    public static void main(String[] args) {
        int idade;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        idade = scanner.nextInt();

        if (idade >= 18 && idade <= 67 ){
            System.out.println("Você pode doar sangue!");
        }else {
            System.out.println("Você não pode doar sangue!");
        }
    }
}
