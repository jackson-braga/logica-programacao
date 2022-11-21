package lista3;

//      1. Faça um programa que verifique e mostre os números entre 1.000 e 2.000 (inclusive)
//      que, quando divididos por 11 obtem-se resto igual a 2.

public class Questao01 {

    public static void main(String[] args) {

        // Imprimir mensagem inicial
        System.out.println("Estes são os números entre 1000 e 2000 que, quando divididos por 11, têm resto 2:");

        // Calcular e exibir os resultados
        for (int i = 1000; i <= 2000; i++) {
            if (i % 11 == 2) {
                System.out.println(i);
            }
        }
    }
}