package atividades.lista2;

/**
 * @author CrisMoura on 20/11/2022
 */
import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
//5. Faça um programa que verifique se uma letra digitada é vogal ou consoante.

        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma Letra.");
        char letra = input.next().toUpperCase().charAt(0);
        if (Character.isLetterOrDigit(letra)) {
            if (letra != 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U') {
                if (Character.isDigit(letra)) {
                    System.out.println("Não é uma letra");
                } else {
                    System.out.println("CONSOANTE!");
                }
            } else {
                System.out.println("VOGAL!");
            }
        } else {
            System.out.println("Não é um caracter válido.");
        }

    }
}