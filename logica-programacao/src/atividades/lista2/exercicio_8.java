package atividades.lista2;

import java.util.Scanner;
//1. Telefonou para a vítima?
//2. Esteve no local do crime?
//3. Mora perto da vítima?
//4. Devia para a vítima?
//5. Já trabalhou com a vítima?
public class exercicio_8 {
    public static void main(String[] args) {
        String r1, r2, r3, r4, r5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Você Telefonou para a vítima? - (S) ou (N)");
        r1 = scanner.next().toUpperCase();
        System.out.println("Você Esteve no local do crime? - (S) ou (N)");
        r2 = scanner.next().toUpperCase();
        System.out.println("Você Mora perto da vítima? - (S) ou (N)");
        r3 = scanner.next().toUpperCase();
        System.out.println("Você Devia para a vítima? - (S) ou (N)");
        r4 = scanner.next().toUpperCase();
        System.out.println("Você Já trabalhou com a vítima? - (S) ou (N)");
        r5 = scanner.next().toUpperCase();

        int c1, c2, c3, c4, c5;

        if (r1.equals("S")){
            c1 = 1;
        }else {
            c1 = 0;
        }
        if (r2.equals("S")){
            c2 = 1;
        }else {
            c2 = 0;
        }
        if (r3.equals("S")){
            c3 = 1;
        }else {
            c3 = 0;
        }
        if (r4.equals("S")){
            c4 = 1;
        }else {
            c4 = 0;
        }
        if (r5.equals("S")){
            c5 = 1;
        }else {
            c5 = 0;
        }
        int contador = c1 + c2 + c3 + c4 + c5;
        if (contador == 5){
            System.out.println("Você foi classificado como Assassino!");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Você foi classificado como Cúmplice!");            
        } else if (contador == 2) {
            System.out.println("Você foi considerado Suspeito!");
        }else {
            System.out.println("Você foi considerado Inocente!");
        }
    }
}
