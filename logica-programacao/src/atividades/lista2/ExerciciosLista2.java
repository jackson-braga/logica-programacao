package atividades.lista2;

import java.util.Scanner;

/**
 * @author Samir Hamade
 */

public class ExerciciosLista2 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        exercicio1();
//        exercicio2();
//        exercicio3();
//        exercicio4();
//        exercicio5();
//        exercicio6();
//        exercicio7();
        exercicio8();
    }

    private static void exercicio1() {
        System.out.println("Qual a sua idade? ");
        int idade = scan.nextInt();
        if (idade >= 18 && idade <= 67) {
            System.out.println("Pode doar sangue, salve uma vida!");
        } else {
            System.out.println("Não pode doar sangue!");
        }
    }

    private static void exercicio2() {
        System.out.println("Informe o número de lados do polígono: ");
        byte quantidadeLados = scan.nextByte();
        System.out.println("Informe a medida do lado em centímetros: ");
        double valorLado = scan.nextDouble();
        if (quantidadeLados == 3) {
            double area = ((valorLado * 2) * Math.sqrt(3)) / 4;
            System.out.printf("TRIÂNGULO - valor da área: %.2f", area);
        } else if (quantidadeLados == 4) {
            System.out.printf("QUADRADO - valor da área: %.2f", valorLado * 2);
        } else if (quantidadeLados == 5) {
            System.out.println("PENTÁGONO");
        } else if (quantidadeLados < 3) {
            System.out.println("Não é um polígono");
        } else {
            System.out.println("Polígono não identificado");
        }
    }

    private static void exercicio3() {
        System.out.println("Informe as medidas do lado de um triângulo\nLado 1: ");
        double lado1 = scan.nextDouble();
        System.out.println("Lado 2: ");
        double lado2 = scan.nextDouble();
        System.out.println("Lado 3: ");
        double lado3 = scan.nextDouble();
        if ((lado1 == lado2) && (lado1 == lado3)) {
            System.out.println("Triângulo Equilátero");
        } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
            System.out.println("Triângulo Isóscele");
        } else {
            System.out.println("Triângulo Escaleno");
        }
    }

    private static void exercicio4() {
        System.out.print("Informe os 3 ângulos de um triângulo\nÂngulo 1: ");
        double angulo1 = scan.nextDouble();
        System.out.print("Ângulo 2: ");
        double angulo2 = scan.nextDouble();
        System.out.print("Ângulo 3: ");
        double angulo3 = scan.nextDouble();
        if (angulo1 + angulo2 + angulo3 == 180) {
            if ((angulo1 < 90) && (angulo2 < 90) && (angulo3 < 90)) {
                System.out.println("Triângulo acutângulo");
            } else if ((angulo1 > 90) || (angulo2 > 90) || (angulo3 > 90)) {
                System.out.println("Triângulo obtusângulo");
            } else if ((angulo1 == 90) || (angulo2 == 90) || (angulo3 == 90)) {
                System.out.println("Triângulo retângulo");
            }
        } else System.out.println("Valores informados não formam um triângulo");
    }

    private static void exercicio5() {
        System.out.println("Digite uma letra");
        String letra = scan.next().toLowerCase();
        if (letra.length() > 1) {
            System.out.println("informe somente uma letra");
            return;
        }
        if (letra.matches("[^A-Za-z_]") == true) {
            System.out.println(letra + " não é uma letra");
            return;
        }
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vogais.length; i++) {
            if (letra.equals(String.valueOf(vogais[i]))) {
                System.out.println("Letra digitada é uma vogal");
                return;
            }
        }
        System.out.println("Letra digitada é uma consoante");
    }

    private static void exercicio6() {
        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2) / 2;
        char conceito = 0;
        String mensagem = "As notas foram: \nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMédia: " + media;

        if (media <= 7.5 && media >= 0) {
            if (media <= 4) {
                conceito = 'E';
            } else if (media > 4 && media <= 6) {
                conceito = 'D';
            } else if (media > 6 && media <= 7.5) {
                conceito = 'C';
            }
            mensagem = mensagem + "\n" + "REPROVADO -> " + conceito;
        } else if (media > 7.5 && media <= 10) {
            if (media > 7.5 && media <= 9) {
                conceito = 'B';
            } else if (media > 9 && media <= 10) {
                conceito = 'A';
            }
            mensagem = mensagem + "\n" + "APROVADO -> " + conceito;
        } else {
            System.out.println("Valor da média fora dos parâmetros");
            return;
        }
        System.out.println(mensagem);
    }

    private static void exercicio7() {
        System.out.println("Informe um ano: ");
        int ano = scan.nextInt();
        if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano bissexto");
        } else System.out.println("Não é um ano bissexto");
    }

    private static void exercicio8() {
        String[] respostas = new String[5];
        System.out.println("Responda as seguintes questões com S (sim) ou N (não)");
        System.out.println("Telefonou para a vítima?");
        respostas[0] = scan.nextLine().toLowerCase();
        System.out.println("Esteve no local do crime?");
        respostas[1] = scan.nextLine().toLowerCase();
        System.out.println("Mora perto da vítima?");
        respostas[2] = scan.nextLine().toLowerCase();
        System.out.println("Devia para a vítima??");
        respostas[3] = scan.nextLine().toLowerCase();
        System.out.println("Já trabalhou com a vítima?");
        respostas[4] = scan.nextLine().toLowerCase();
        short contador = 0;
        for (int i = 0; i < respostas.length; i++) {
            if (respostas[i].charAt(0) == 's') {
                contador++;
            }
        }
        if (contador == 5) {
            System.out.println("ASSASSINO!");
        } else if (contador > 2 && contador < 5) {
            System.out.println("Cúmplice");
        } else if (contador == 2) {
            System.out.println("Suspeita");
        } else {
            System.out.println("Inocente");
        }
    }

}
