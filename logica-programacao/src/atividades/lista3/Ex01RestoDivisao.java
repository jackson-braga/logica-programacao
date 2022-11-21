package atividades.lista3;

/* 1. Faça um programa que verifique e mostre os números entre 1.000 e 2.000 (inclusive) que, quando divididos por 11 obtém-se
resto igual a 2.
* */
public class Ex01RestoDivisao {
    public static void main(String[] args) {

        for(int numero = 1000; numero <= 2000; numero++){
            if (numero % 11 == 2)
                System.out.println(numero);
        }

    }
}
