package atividades.lista1;

import java.util.Scanner;

public class exercicio_1{
    //Ler dimensões de um retângulo, base, altura.
    //Calcular e escrever a área.
    public static void main(String[] args) {
        System.out.println("Vamos calcular a área de um retângulo!");
        int base;
        int altura;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do retângulo: ");
        base = scanner.nextInt();

        System.out.println("Agora digite a altura do retângulo: ");
        altura = scanner.nextInt();

        int area = base * altura;

        System.out.println("A área do retângulo é: " + area);

    }
}
