package atividades.lista1;

import java.util.Scanner;

public class Exercicios {
    public static Scanner scan = new Scanner(System.in);
    public static final double PRECO_GASOLINA = 4.79;
    public static final double PRECO_ALCOOL = 3.69;

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
//        exercicio11();
//        exercicio12();
//        exercicio13();
//        exercicio14();
//        exercicio15();
    }

    public static void exercicio1() {
        System.out.println("Informe a base do retângulo: ");
        double base = scan.nextDouble();
        System.out.println("Informe a altura do retângulo: ");
        double altura = scan.nextDouble();
        System.out.println("A área do retângulo é: " + base * altura);
    }

    public static void exercicio2() {
        System.out.print("Informe a sua idade! \nAnos: ");
        int idadeAnos = scan.nextInt();
        System.out.print("Meses: ");
        int meses = scan.nextInt();
        System.out.print("Dias: ");
        int dias = scan.nextInt();
        int diasVividos = (idadeAnos * 365) + (meses * 30) + dias;
        System.out.println("Você já viveu " + diasVividos + " dias!");
    }

    public static void exercicio3() {
        System.out.println("Informe o número total de eleitores: ");
        double eleitores = scan.nextInt();
        System.out.println("Informe o número de votos em branco: ");
        double votosEmBranco = scan.nextInt();
        System.out.println("Informe o número de votos nulos: ");
        double votosNulo = scan.nextInt();
        System.out.println("Informe o número de votos válidos: ");
        double votosValidos = scan.nextInt();
        System.out.print("Porcentagem de votos em branco foi de ");
        System.out.println((votosEmBranco / eleitores) * 100);
        System.out.print("Porcentagem de votos nulo foi de ");
        System.out.println((votosNulo / eleitores) * 100);
        System.out.print("Porcentagem de votos válidos foi de ");
        System.out.println((votosValidos / eleitores) * 100);
    }

    public static void exercicio4() {
        System.out.println("Informe o salário fixo: ");
        double salarioFixo = scan.nextDouble();
        System.out.println("Informe o valor total de vendas efetuadas: ");
        double valorTotalVendas = scan.nextDouble();
        double comissaoVendas = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoVendas;
        System.out.println("O salário final do vendedor é " + salarioFinal);
    }

    public static void exercicio5() {
        System.out.println("Informe a temperatura em Fahrenheit: ");
        double temperatura = scan.nextDouble();
        double celsius = ((temperatura - 32) / 9) * 5;
        System.out.println("O temperatura em Celsius é " + celsius);
    }

    public static void exercicio6() {
        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double nota3 = scan.nextDouble();
        double mediaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
        System.out.println("A media final é: " + mediaFinal);
    }

    public static void exercicio7() {
        System.out.println("Informe a quantidade de maças: ");
        int quantidadeMacas = scan.nextInt();
        double preçoMaca;
        if (quantidadeMacas >= 12) {
            preçoMaca = quantidadeMacas * 1.0;
        } else if (quantidadeMacas < 12 && quantidadeMacas > 0) {
            preçoMaca = quantidadeMacas * 1.3;
        } else {
            System.out.println("Quantidade informada inválida");
            return;
        }
        System.out.println("O custo total das maças é de " + preçoMaca + " reais");
    }

    public static void exercicio8() {
        System.out.println("Informe a nota da primeira avaliação: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a nota da segunda avaliação: ");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 6) {
            System.out.println("Aluno aprovado com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }
    }

    public static void exercicio9() {
        System.out.println("Informe o ano de seu nascimento: ");
        double anoNascimento = scan.nextDouble();
        System.out.println("Informe o ano atual: ");
        double anoAtual = scan.nextDouble();
        boolean podeVotar = anoAtual - anoNascimento >= 16;
        if (podeVotar) {
            System.out.println("Pode votar!");
        } else {
            System.out.println("Não pode votar!");
        }
    }

    public static void exercicio10() {
        System.out.println("Informe o número de horas trabalhadas no mês: ");
        double horasTrabalhadasMes = scan.nextDouble();
        System.out.println("Informe o salário por hora: ");
        double salarioHora = scan.nextDouble();
        double adicional = salarioHora * 0.5;
        double valorHoraExtra = salarioHora + adicional;
        double valorTotalHoraExtra = 0;
        if (horasTrabalhadasMes > 160) {
            valorTotalHoraExtra = (horasTrabalhadasMes - 160) * valorHoraExtra;
        }
        double salarioTotal = (160 * salarioHora) + valorTotalHoraExtra;
        System.out.println("Salário total: " + salarioTotal);
    }

    public static void exercicio11() {
        System.out.println("Informe a quantidade atual em estoque: ");
        double quantidadeAtualEstoque = scan.nextDouble();
        System.out.println("Informe a quantidade máxima em estoque: ");
        double quantidadeMaximaEstoque = scan.nextDouble();
        System.out.println("Informe a quantidade mínima em estoque: ");
        double quantidadeMinimaEstoque = scan.nextDouble();
        double quantidadeMedia = (quantidadeMaximaEstoque + quantidadeMinimaEstoque) / 2;
        System.out.println("A média do estoque é: " + quantidadeMedia);
        if (quantidadeAtualEstoque >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }

    public static void exercicio12() {
        System.out.println("Informe o primeiro valor: ");
        double valor1 = scan.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double valor2 = scan.nextDouble();
        System.out.println("Informe o terceiro valor: ");
        double valor3 = scan.nextDouble();
        boolean valor1Condicao = (valor1 < (valor2 + valor3));
        boolean valor2Condicao = (valor2 < (valor1 + valor3));
        boolean valor3Condicao = (valor3 < (valor1 + valor2));
        if (valor1Condicao && valor2Condicao && valor3Condicao) {
            System.out.println("É um triângulo!");
        } else {
            System.out.println("Não é um triângulo");
        }
    }

    public static void exercicio13() {
        System.out.println("Informe o tipo de combustível: \nA-Alcool\nG-Gasolina");
        String combustivel = scan.next();
        System.out.println("Informe a quantidade de litros: ");
        double quantidadeLitros = scan.nextDouble();
        double valorTotal = 0;
        double desconto = 0;
        if (combustivel.toUpperCase().startsWith("G")) {
            if (quantidadeLitros <= 20) {
                desconto = (quantidadeLitros * PRECO_GASOLINA) * 0.02;
                valorTotal = (quantidadeLitros * PRECO_GASOLINA) - desconto;
            } else {
                desconto = (quantidadeLitros * PRECO_GASOLINA) * 0.05;
                valorTotal = (quantidadeLitros * PRECO_GASOLINA) - desconto;
            }
        } else if (combustivel.toUpperCase().startsWith("A")) {
            if (quantidadeLitros <= 20) {
                desconto = (quantidadeLitros * PRECO_ALCOOL) * 0.03;
                valorTotal = (quantidadeLitros * PRECO_ALCOOL) - desconto;
            } else {
                desconto = (quantidadeLitros * PRECO_ALCOOL) * 0.06;
                valorTotal = (quantidadeLitros * PRECO_ALCOOL) - desconto;
            }
        }
        System.out.println("O valor total a ser pago é " + valorTotal);
    }

    public static void exercicio14() {
        System.out.println("Informe o nome do produto: ");
        String nomeProduto = scan.next();
        System.out.println("Informe a quantidade adquirida: ");
        int quantidade = scan.nextInt();
        System.out.println("Informe o preço unitário do produto: ");
        double precoUnitario = scan.nextDouble();
        double valorTotal =  quantidade * precoUnitario;
        System.out.println("O valor total do produto " + nomeProduto + " é de " + valorTotal);
        double desconto;
        if (quantidade <= 5) {
            desconto = 0.02;
        } else if (quantidade > 5 && quantidade <= 10) {
            desconto = 0.03;
        } else {
            desconto = 0.05;
        }
        System.out.println("O valor do desconto é " + (desconto * 100) + " porcento");
        double totalComDesconto = valorTotal - (valorTotal * desconto);
        System.out.println("O valor total com desconto é " + totalComDesconto);
    }

    public static void exercicio15() {
        System.out.println("Informe o ano de seu nascimento: ");
        int anoNascimento = scan.nextInt();
        System.out.println("Informe o ano de seu ingresso na empresa");
        int anoIngressoEmpresa = scan.nextInt();
        int idade = 2022 - anoNascimento;
        int tempoDeTrabalho = 2022 - anoIngressoEmpresa;
        if ((idade >= 65) || (tempoDeTrabalho >= 30) || (idade >= 60 && tempoDeTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }
    }
}





















