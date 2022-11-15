package atividades.lista1;

import java.util.Scanner;

/**
 * @author CrisMoura on 14/11/2022
 */
public class Exerc12 {
    public static void main(String[] args) {
//        Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo.
//        OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        int ladoA = leitor.nextInt();
        System.out.println("Digite o valor de B");
        int ladoB = leitor.nextInt();
        System.out.println("Digite o valor de C");
        int ladoC = leitor.nextInt();

        int somalados = ladoA +ladoB;
        if(ladoC < somalados){
            System.out.println("Formam um Triângulo.");
        }else{
            System.out.println("Não Formam um Triângulo.");
        }
    }
}
