package atividades.lista1;

import java.util.Scanner;

/**
 * @author CrisMoura on 13/11/2022
 */
public class Exerc3 {
    public static void main(String[] args) {
//        Escreva um programa para ler o número total de eleitores de um município, o número de votos
//        brancos, nulos e válidos.Calcular e escrever o percentual que cada um representa em relação
//        ao total de eleitores.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número total de eleitores!");
        double eleitores = leitor.nextInt();
        System.out.println("Digite o total de votos em branco!");
        int brancos = leitor.nextInt();
        System.out.println("Digite o total de votos nulos!");
        int nulos = leitor.nextInt();
        double validos = eleitores - brancos - nulos;
        validos = validos / eleitores * 100;

        double brancos2 = brancos / eleitores * 100;
        double nulos2 = nulos / eleitores * 100;

        System.out.println("Votos brancos foram % " + brancos2);
        System.out.println("Votos nulos foram % " + nulos2);
        System.out.println("Votos válidos foram % " + validos);




    }
}
