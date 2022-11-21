package lista2;

//      5. Faça um programa que verifique se uma letra digitada
//      é vogal ou consoante

import java.util.Objects;
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        // Criar variável da letra a ser digitada pelo usuário

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a letra desejada: ");
        String letra = scan.nextLine();

        if (Objects.equals(letra, "a") || Objects.equals(letra, "A") || Objects.equals(letra, "e") || Objects.equals(letra, "E")
                || Objects.equals(letra, "i") || Objects.equals(letra, "I") || Objects.equals(letra, "o") || Objects.equals(letra, "O")
                || Objects.equals(letra, "u") || Objects.equals(letra, "U")) {
            System.out.println("A letra informada é uma vogal.");
        } else {
            System.out.println("A letra informada é uma consoante.");
        }
    }



}
