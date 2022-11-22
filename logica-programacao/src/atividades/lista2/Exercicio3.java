package atividades.lista2;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //3. Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno.
        //Sendo que:
        //● Triângulo Equilátero: possui os 3 lados iguais.
        //● Triângulo Isóscele: possui 2 lados iguais.
        //● Triângulo Escaleno: possui 3 lados diferentes.
        Scanner scann = new Scanner(System.in);
        System.out.println("Informe o primeiro lado.");
        int lado1 = scann.nextInt();
        System.out.println("Informe o segundo lado.");
        int lado2 = scann.nextInt();
        System.out.println("Informe o terceiro lado.");
        int lado3 = scann.nextInt();

        if(lado1 == lado2 && lado1 == lado3){
            System.out.println("É um Equilátero.");
        }
        else if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) || (lado2 == lado3 && lado2 != lado1)) {
            System.out.println("É um Isósceles.");
        }
        else if (lado1 != lado2 && lado1 != lado3) {
            System.out.println("É um Escaleno.");
        }

    }
}
