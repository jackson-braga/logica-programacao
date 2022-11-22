package atividades.lista1;

import java.util.Scanner;

public class exercicio_11 {
    //Mostrar se precisa de mais estoque a partir da quantidade média do estoque
    public static void main(String[] args) {
        double eMax;
        double eMin;
        double eAtual;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade máxima do produto: ");
        eMax = scanner.nextDouble();
        System.out.println("Digite a quantidade mínima do produto: ");
        eMin = scanner.nextDouble();
        System.out.println("Digite a quantidade atual em estoque do produto: ");
        eAtual = scanner.nextDouble();
        double media = (eMax + eMin) / 2;
        if (eAtual>=media){
            System.out.println("Não efetuar Compra");
        }else {
            System.out.println("Efetuar Compra");
        }

    }
}
