package ListasDeExercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lista3 {
    public static void main(String[] args) {
//        exec1();
//        exec2();
//        exec3();
        exec4();
//        exec5();
//        exec6();
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
    public static void exec5(){

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
    public static void exec6(){

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
    public static void exec7(){

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
    public static void exec8(){

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
    public static void exec9(){

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

}
