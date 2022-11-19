package atividades.lista3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

/**
 * @author Samir Hamade
 */

public class ExerciciosLista3 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        exercicio1();
//        exercicio2();
//        exercicio3();
//        exercicio4();
//        exercicio5();
//        exercicio6();
//        exercicio7();
//        exercicio8();
//        exercicio9();
//        exercicio10();
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

    // métodos criados com base no algoritmo Bubble Sort
    private static void ordemCrescente(int[] numeros) {
        boolean controle;
        int auxiliar;

        for (int i = 0; i < numeros.length; i++) {
            controle = true;
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
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
                if (numeros[j] < numeros[j + 1]) {
                    auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
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
            idades[i] = random.nextInt(10, 30); // o vetor vai receber valores de 10 até 30 (não incluso)
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
        int quantidade = 0, primeiraFaixaEtaria = 0, segundaFaixaEtaria = 0, terceiraFaixaEtaria = 0, quartaFaixaEtaria = 0, quintaFaixaEtaria = 0;

        for (int i = 0; i < idades.length; i++) {
            idades[i] = random.nextInt(10, 80);
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
        System.out.printf("Quantidade de pessoas com idade menor ou igual 15: %d - " +
                "Representando %d porcento do total \n", primeiraFaixaEtaria, (primeiraFaixaEtaria * 100 / idades.length));
        System.out.printf("Quantidade de pessoas com idade maior do que 15 e menor ou igual 30: %d - " +
                "Representando %d porcento do total \n", segundaFaixaEtaria, (segundaFaixaEtaria * 100 / idades.length));
        System.out.printf("Quantidade de pessoas com idade maior do que 30 e menor ou igual 45: %d - " +
                "Representando %d porcento do total \n", terceiraFaixaEtaria, (terceiraFaixaEtaria * 100 / idades.length));
        System.out.printf("Quantidade de pessoas com idade maior do que 45 e menor ou igual 60: %d - " +
                "Representando %d porcento do total \n", quartaFaixaEtaria, (quartaFaixaEtaria * 100 / idades.length));
        System.out.printf("Quantidade de pessoas com idade maior do que 60: %d - " +
                "Representando %d porcento do total", quintaFaixaEtaria, (quintaFaixaEtaria * 100 / idades.length));
    }

    private static void exercicio5() {
        System.out.print("Informe a altura do triângulo: ");
        int altura = scan.nextInt();
        String triangulo = "*";

        if (altura < 0) {
            for (int i = altura; i < 0; i++) {
                System.out.println(triangulo);
                triangulo = triangulo + "*";
            }
        } else if (altura > 0) {
            for (int i = 1; i <= altura; i++) {
                System.out.println(triangulo);
                triangulo = triangulo + "*";
            }
        } else System.out.println("Tamanho zero informado!");

    }

    private static void exercicio6() {
        System.out.println("Menu de opções:\n\n" +
                "1 - Média Aritmética\n" +
                "2 - Média Ponderada\n" +
                "3 - Sair");
        int opcao = scan.nextInt();
        double nota1, nota2, nota3, media, pesoNota1, pesoNota2, pesoNota3;

        switch (opcao) {
            case 1:
                System.out.println("Informe a primeira nota: ");
                nota1 = scan.nextDouble();
                System.out.println("Informe a segunda nota: ");
                nota2 = scan.nextDouble();
                media = (nota1 + nota2) / 2;
                System.out.printf("A média aritmética é: %.2f", media);
                break;
            case 2:
                System.out.println("Informe a primeira nota: ");
                nota1 = scan.nextDouble();
                System.out.println("Informe o peso da primeira nota: ");
                pesoNota1 = scan.nextDouble();
                System.out.println("Informe a segunda nota: ");
                nota2 = scan.nextDouble();
                System.out.println("Informe o peso da segunda nota: ");
                pesoNota2 = scan.nextDouble();
                System.out.println("Informe a terceira nota: ");
                nota3 = scan.nextDouble();
                System.out.println("Informe o peso da terceira nota: ");
                pesoNota3 = scan.nextDouble();
                media = ((nota1 * pesoNota1) + (nota2 * pesoNota2) + (nota3 * pesoNota3)) / (pesoNota1 + pesoNota2 + pesoNota3);
                System.out.printf("A média ponderada é: %.2f", media);
                break;
            case 3:
                return;
            default:
                System.out.println("Opção inválida");
                return;
        }
    }

    private static void exercicio7() {
        System.out.println("Cálculo de divisão\n" +
                "Informe o primeiro valor: ");
        double valor1 = scan.nextDouble();
        double valor2;

        while (true) {
            System.out.println("Informe o segundo valor: ");
            valor2 = scan.nextDouble();
            if (valor2 != 0) {
                break;
            }
            System.out.println("VALOR INVÁLIDO");
        }
        System.out.printf("O resultado da divisão de %.2f por %.2f foi: %.4f", valor1, valor2, (valor1 / valor2));
    }

    private static void exercicio8() {
        char condicao = 'S';
        double nota1 = -1, nota2, media = 0;

        do {
            System.out.println("Informe o valor da primeira nota: ");
            nota1 = scan.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("O valor da nota deve ser de 0 a 10");
                continue;
            }

            System.out.println("Informe o valor da segunda nota: ");
            nota2 = scan.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("O valor da nota deve ser de 0 a 10");
                continue;
            }

            media = (nota1 + nota2) / 2;
            System.out.printf("A média das notas é: %.2f %n", media);
            System.out.println("NOVO CÁLCULO (S/N)?");
            condicao = scan.next().toUpperCase().charAt(0);
        } while (condicao == 'S');
        System.out.println("Programa encerrado!");
    }

    private static void exercicio9() {
        int valor;

        while (true) {
            System.out.println("Informe um valor maior que zero: ");
            valor = scan.nextInt();
            if (valor <= 0) {
                System.out.println("VALOR INVÁLIDO");
            } else {
                for (int i = 1; i <= valor; i++) {
                    System.out.println(i);
                }
                break;
            }
        }
    }

    // Entendendo o método floor
//    private static void exercicio10() {
//        System.out.println("Digite um número: ");
//        double numero = scan.nextDouble();
//        if (numero == Math.floor(numero)) {
//            System.out.println("Número inteiro");
//        } else System.out.println("Não é um número inteiro");
//    }
}











