package atividades.lista3;

import java.util.Scanner;

/**
 * @author CrisMoura on 20/11/2022
 */
public class Exe5 {
    public static void main(String[] args) {
//        Faça um programa que recebe a altura de um triângulo em um número inteiro e imprima-o utilizando
//        asteriscos. Veja o Exemplo:
//        Entrada: 5
//        *
//        **
//        ***
//        ****
//        *****

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número de linhas desejada.");
            int quantidadeLinhas = scanner.nextInt();


            for(int i = 0; i < quantidadeLinhas ; i++){
                for(int j = i; j > 0; j--){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

    }

