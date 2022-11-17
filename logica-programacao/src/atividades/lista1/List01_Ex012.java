package atividades.lista1;

import java.util.Scanner;

public class List01_Ex012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um lado do triângulo: ");
        float lado1 = scan.nextFloat();
        System.out.println("Digite o outro lado do triângulo: ");
        float lado2 = scan.nextFloat();
        System.out.println("Digite o terceiro lado do triângulo: ");
        float lado3 = scan.nextFloat();

        if (lado1 < lado2 + lado3 & lado2 < lado1 + lado3 & lado3 < lado1 + lado2) {
            System.out.println("Com essas medidas, formamos um triângulo");
        }else {
            System.out.println("Não é possível formar um triângulo");
        }
    }
}
