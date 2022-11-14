package atividades.lista3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class ExerciciosLista3 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        exercicio1();
//        exercicio2();
//        exercicio3();
        exercicio4();
    }

    private static void exercicio1() {
        for (int numero = 1000; numero <= 2000; numero++) {
            if (numero % 11 == 2) {
                System.out.print(" " + numero + " -");
            }
        }
    }

    private static void exercicio2() {
        int[] numeros = new int[3];

        System.out.println("Informe o valor de A: ");
        numeros[0] = scan.nextInt();
        System.out.println("Informe o valor de B: ");
        numeros[1] = scan.nextInt();
        System.out.println("Informe o valor de C: ");
        numeros[2] = scan.nextInt();
        System.out.println("Ordem lida: \nValor A: " + numeros[0] + "\nValor B: " + numeros[1] + "\nValor C: " + numeros[2]);
        System.out.println("Ordem crescente");
        ordemCrescente(numeros);
        System.out.println("Ordem decrescente");
        ordemDecrescente(numeros);
    }

    private static void ordemCrescente(int[] numeros) {
        boolean controle;
        int auxiliar;

        for (int i = 0; i < numeros.length; i++) {
            controle = true;
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                    controle = false;
                }
            }
            if (controle) {
                break;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    private static void ordemDecrescente(int[] numeros) {
        boolean controle;
        int auxiliar;

        for (int i = 0; i < numeros.length; i++) {
            controle = true;
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] < numeros[j+1]) {
                    auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                    controle = false;
                }
            }
            if (controle) {
                break;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    private static void exercicio3() {
        Random random = new Random();
        int[] idades = new int[10];
        int quantidade = 0;

        for (int i = 0; i < idades.length; i++) {
            idades[i] = random.nextInt(10, 30);
//            System.out.println(idades[i]);
        }

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] >= 18) {
                quantidade++;
            }
        }
        System.out.println("A quantidade de pessoas com idade maior ou igual a 18 anos é: " + quantidade);
    }

    private static void exercicio4() {
        Random random = new Random();
        int[] idades = new int[10];
        int quantidade = 0;
        int primeiraFaixaEtaria = 0, segundaFaixaEtaria = 0, terceiraFaixaEtaria = 0, quartaFaixaEtaria = 0, quintaFaixaEtaria = 0;

        for (int i = 0; i < idades.length; i++) {
            idades[i] = random.nextInt(10, 31);
//            System.out.print(idades[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] <= 15) {
                primeiraFaixaEtaria++;
            } else if (idades[i] > 15 && idades[i] <= 30) {
                segundaFaixaEtaria++;
            } else if (idades[i] > 30 && idades[i] <= 45) {
                terceiraFaixaEtaria++;
            } else if (idades[i] > 45 && idades[i] <= 60) {
                quartaFaixaEtaria++;
            } else {
                quintaFaixaEtaria++;
            }
        }
        System.out.printf("Quantidade de pessoas com idade menor ou igual 15: %d - Representando %d porcento do total \n", primeiraFaixaEtaria, (primeiraFaixaEtaria*100/idades.length));
        System.out.printf("Quantidade de pessoas com idade maior do que 15 e menor ou igual 30: %d - Representando %d porcento do total \n", segundaFaixaEtaria, (segundaFaixaEtaria*100/idades.length));
        System.out.printf("Quantidade de pessoas com idade maior do que 30 e menor ou igual 45: %d - Representando %d porcento do total \n", terceiraFaixaEtaria, (terceiraFaixaEtaria*100/idades.length));
        System.out.printf("Quantidade de pessoas com idade maior do que 45 e menor ou igual 60: %d - Representando %d porcento do total \n", quartaFaixaEtaria, (quartaFaixaEtaria*100/idades.length));
        System.out.printf("Quantidade de pessoas com idade maior do que 60: %d - Representando %d porcento do total", quintaFaixaEtaria, (quintaFaixaEtaria*100/idades.length));
    }
}











