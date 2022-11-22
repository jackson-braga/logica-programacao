package atividades.lista3;

public class Exercicio1 {
    public static void main(String[] args) {
        //1. Faça um programa que verifique e mostre os números entre 1.000 e 2.000 (inclusive) que, quando divididos por 11 obtém-se
        //resto igual a 2.

        System.out.println("Estes são os números entre 1.000 e 2.000 que divididos por 11 resultam em 2:");
        for(int i = 1000; i <= 2000; i++){
            if(i % 11 == 2){
                System.out.print( ""+ i + ", ");
            }
        }
    }
}
