package ListasDeExercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lista3 {
    public static void main(String[] args) {
//        exec1();
//        exec2();
//        exec3();
//        exec4();
//        exec5();
//       exec6();
//        exec7();
//        exec8();
//        exec9();

    }
    public static void exec1(){

        int num;
        for (int i = 1000; i < 2001; i++){
            if (i % 11 == 2){
                System.out.println(i);
            }
        }
    }
    public static void exec2(){

        int valorA, valorB, valorC;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        valorA = scan.nextInt();
        System.out.print("Digite o valor B: ");
        valorB = scan.nextInt();
        System.out.print("Digite o valor C: ");
        valorC = scan.nextInt();

        Integer[] array = {valorA, valorB, valorC};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
    public static void exec3(){

        int ano;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        ano = scan.nextInt();

        if ((ano % 4 == 0) && (ano % 100 != 0)) {
            System.out.println("\nAno bissexto");
        }
        else {
            System.out.println("\nNão é bissexto");
        }
    }
    public static void exec4() {

        Scanner scan = new Scanner(System.in);
        Integer[] idades = new Integer[9];
        int f1 = 0, f2 = 0, f3 = 0, f4 = 0, f5 = 0;
        double p1, p2, p3, p4, p5;

        for (int i = 0; i < 9; i++) {
            System.out.print("Digite a " + (i+1) + "º idade: ");
            idades[i] = scan.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            if (idades[i] <= 15) {
                f1++;
            } else if ((idades[i] >= 16) && (idades[i] <= 30)) {
                f2++;
            } else if ((idades[i] >= 31) && (idades[i] <= 45)) {
                f3++;
            } else if ((idades[i] >= 46) && (idades[i] <= 61)) {
                f4++;
            } else {
                f5++;
            }
        }

        p1 = ((f1/10)*100);

        System.out.println("Pessoas de até 15 anos: " + f1 + " pessoa(s) ou " + (f1*10) + "%");
        System.out.println("Pessoas de 16 a 30 anos: " + f2 + " pessoa(s) ou " + (f2*10) + "%");
        System.out.println("Pessoas de 31 a 45 anos: " + f3 + " pessoa(s) ou " + (f3*10) + "%");
        System.out.println("Pessoas de 46 a 60 anos: " + f4 + " pessoa(s) ou " + (f4*10) + "%");
        System.out.println("Pessos acima de 61 anos: " + f5 + " pessoa(s) ou " + (f5*10) + "%");
    }
    public static void exec5() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o tamanho da pirâmide: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
           for (int j = 0; j != i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void exec6(){

        int opcao = 0;
        double[] valor = new double[3];
        double media;
        double[] peso = new double[3];
        Scanner scan = new Scanner(System.in);

        while (opcao != 3)  {
            System.out.println("\nDigite o número referente a uma das opções: ");
            System.out.println("1. Média aritmética");
            System.out.println("2. Média ponderada");
            System.out.println("3. Sair");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 1; i < 3; i++) {
                        System.out.print("Digite a nota " + i + ": ");
                        valor[i] = scan.nextInt();
                    }
                    media = (valor[1] + valor[2])/2;
                    System.out.println("A média aritmética é: " + media);
                    break;

                case 2:
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Digite a nota " + (i + 1) + ": ");
                        valor[i] = scan.nextInt();
                        System.out.print("Digite o peso " + (i + 1) + ": ");
                        peso[i] = scan.nextInt();
                    }
                    media = ((valor[0] * peso[0]) + (valor[1] * peso[1]) + (valor[2] * peso[2])) / (peso[0] + peso[1] + peso[2]);
                    System.out.println("A média ponderada é: " + media);
                    break;

                case 3:
                    break;
            }
        }
    }
    public static void exec7() {

        double valor1 = 0, valor2 = 0;
        double div;
        Scanner scan = new Scanner(System.in);

        while (valor2 == 0) {
            System.out.println("\nDigite o primeiro valor: ");
            valor1 = scan.nextInt();
            System.out.println("Digite o segundo valor: ");
            valor2 = scan.nextInt();
            if (valor2 == 0) {
                System.out.println("VALOR INVÁLIDO");
            }
            else {
                div = valor1 / valor2;
                System.out.println("O resultado da divisão é: " + div);
            }
        }
    }
    public static void exec8() {

        String opcao = "S";
        double valor1, valor2;
        double media;
        Scanner scan = new Scanner(System.in);

        while (opcao.equalsIgnoreCase("S")) {
            System.out.print("Digite a nota 1: ");
            valor1 = scan.nextInt();
            System.out.print("Digite a nota 2: ");
            valor2 = scan.nextInt();
            media = (valor1 + valor2) / 2;
            System.out.println("A média aritmética é: " + media);
            System.out.println("Deseja fazer um novo cálculo (S/N");
            opcao = scan.next();
        }
    }
    public static void exec9() {

        double N = 0;
        Scanner scan = new Scanner(System.in);

        while (N == 0) {
            System.out.println("\nDigite o valor: ");
            N = scan.nextInt();
            if (N == 0) {
                System.out.println("VALOR INVÁLIDO");
            } else {
                for (int i = 1; i <= N; i++) {
                    System.out.println(i);
                }
            }
        }
    }
}
