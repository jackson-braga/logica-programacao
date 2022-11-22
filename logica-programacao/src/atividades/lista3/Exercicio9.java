package atividades.lista3;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        //9. Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Poderá ser aceito somente valores
        //maiores que 0 para N. Caso o valor informado (para N) não seja maior que 0, imprima “VALOR INVÁLIDO” e solicite para ler
        //o valor de N novamente.

        Scanner scann = new Scanner(System.in);
        System.out.println("Insira um valor:");
        int N = scann.nextInt();

        while(N <= 0){
            System.out.println("Só são válidos valores acima de 0.");
            System.out.println("Insira um novo valor para o processo:");
            N = scann.nextInt();
        }


        for(int i = 0; i <= N; i++){
            System.out.print("" + i + ", ");
        }

    }
}
