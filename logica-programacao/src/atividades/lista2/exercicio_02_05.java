//  5. Faça um programa que verifique se uma letra digitada é vogal ou consoante.

import java.util.Scanner;

public class exercicio_02_05 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Digite uma letra do alfabeto: ");
        char letra = scann.next().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("Você digitou uma VOGAL");
        } else {
            System.out.println("Você digitou uma CONSOANTE");
        }
    }
}
