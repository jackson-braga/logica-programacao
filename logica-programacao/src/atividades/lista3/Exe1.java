package atividades.lista3;

/**
 * @author CrisMoura on 20/11/2022
 */
public class Exe1 {
    public static void main(String[] args) {
//        Faça um programa que verifique e mostre os números entre 1.000 e 2.000 (inclusive) que,
//        quando divididos por 11 obtém-se resto igual a 2.

        for (int i = 1000; i <=2000; i++){
            if (i % 11 == 2){
                System.out.println(i);
            }
        }
    }
}
