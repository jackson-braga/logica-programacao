package atividades.lista1;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int eleitor = 0, branco = 0, nulo = 0, voto = 0;
        System.out.println("Digite a quantidade de Eleitores do Municipio:");
        eleitor = scan.nextInt();
        while (eleitor <= 0) {
            System.out.println("Número de Eleitor INVÁLIDO:");
            System.out.println("Digite a quantidade de Eleitor do Municipio:");
            eleitor = scan.nextInt();
        }
        System.out.println("Voto em BRANCO:");
        branco = scan.nextInt();
        while (branco < 0) {
            System.out.println("Número de Voto em BRANCO INVÁLIDO:");
            System.out.println("Digite a quantidade de Voto em Branco:");
            branco = scan.nextInt();
        }
        System.out.println("Voto NULOS:");
        nulo = scan.nextInt();
        while (nulo < 0) {
            System.out.println("Número de Voto NULO INVÁLIDO:");
            System.out.println("Digite a quantidade de Voto NULO:");
            nulo = scan.nextInt();
        }
        System.out.println("Voto Valido:");
        voto = scan.nextInt();
        while (voto < 0) {
            System.out.println("Número de Voto Válido  INVÁLIDO:");
            System.out.println("Digite a quantidade de Voto Válido:");
            nulo = scan.nextInt();
        }
        double porc_branco = 0, porc_nulo = 0, porc_voto = 0;
        porc_branco =((branco*100)/eleitor);
        porc_nulo =((nulo*100)/eleitor);
        porc_voto =((voto*100)/eleitor);

        System.out.println("Brancos:"+ porc_branco + "%");
        System.out.println("Nulos:" + porc_nulo + "%");
        System.out.println("Válidos:" + porc_voto + "%");

    }
}