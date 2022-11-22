package atividades.lista2;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Exercicio5 {
    public static <string> void main(String[] args) {
        //5. Faça um programa que verifique se uma letra digitada é vogal ou consoante.

        Scanner scann = new Scanner(System.in);
        System.out.println("Informe uma letra.");
        String letra = scann.next();

        String[] vogais = {"a", "e", "i", "o", "u"};
        String[] consoantes = {"b", "c", "d", "f", "g", "h", "i", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};

        for(int i = 0; i < 5; i++){
            if(Objects.equals(letra, vogais[i].toLowerCase())){
                System.out.println("A letra é uma vogal.");
                break;
            }
        }

        for(int i = 0; i < Arrays.toString(consoantes).length()-1; i++){
            if(Objects.equals(letra, consoantes[i].toLowerCase())){
                System.out.println("A letra é uma consoante.");
                break;
            }
        }
    }
}
