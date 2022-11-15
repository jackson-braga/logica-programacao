package ListasDeExercicios;

import java.util.Scanner;

public class Lista1 {
    public static void main(String[] args){

//        exec1();
//        exec2();
//        exec3();
//        exec4();
//        exec5();
//        exec6();
//        exec7();
//        exec8();
//        exec9();
//       exec10();
//       exec11();
//       exec12();
//        exec13();
//        exec14();
       exec15();

    }

    public static void exec1 (){
        // Escreva um programa para ler as dimensões de um retângulo (base e altura),
        // calcular e escrever a área do retângulo.

        double altura, base, area;
        Scanner scan = new Scanner(System.in);

        System.out.println("Para calcular a área de um triângulo, digite ");
        System.out.print("O valor em cm da altura: ");
        altura = scan.nextDouble();
        System.out.print("O valor em cm da largura: ");
        base = scan.nextDouble();

        area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area + "cm quadrados");

    }
    public static void exec2 (){
        int anos, meses, dias;
        int totalDias;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite quantos anos inteiros você tem: ");
        anos = scan.nextInt();
        System.out.print("E quantos meses:  ");
        meses = scan.nextInt();
        System.out.print("E quantos dias: ");
        dias = scan.nextInt();

        totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("Você já viveu " + totalDias + " dias");
    }
    public static void exec3 () {
        int eleitores, brancos, nulos, validos;
        float porcentBrancos, porcentNulos, porcentValidos;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de eleitores: ");
        eleitores = scan.nextInt();
        System.out.print("Digite o número de votos em branco: ");
        brancos = scan.nextInt();
        System.out.print("Digite o número de votos nulos: ");
        nulos = scan.nextInt();
        System.out.print("Digite o número de votos válidos: ");
        validos = scan.nextInt();

        porcentBrancos = (float) (100*brancos)/eleitores;
        System.out.println("\nA porcentagem de votos brancos foi de " + porcentBrancos + "%");

        porcentNulos = (float) (100*nulos)/eleitores;
        System.out.println("A porcentagem de votos nulos foi de " + porcentNulos + "%");

        porcentValidos = (float) (100*validos)/eleitores;
        System.out.println("A porcentagem de votos válidos foi de " + porcentValidos + "%");
    }
    public static void exec4 () {

        double salarioFixo, totalVendas;
        double comissao, salarioFinal;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do salário fixo: ");
        salarioFixo = scan.nextDouble();

        System.out.print("Digite o valor total de vendas: ");
        totalVendas = scan.nextDouble();

        comissao = totalVendas*0.05;
        salarioFinal = salarioFixo + comissao;

        System.out.println("\nO salário final do funcionário será de: " + salarioFinal + " reais");

        }
    public static void exec5 () {
        double celcius, farenheit;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        farenheit = scan.nextDouble();

        celcius = ((farenheit-32)/9)*5;

        System.out.println("\nA temperatura em Celisus é: " + celcius + "ºC");
    }
    public static void exec6() {
        double n1, n2, n3;
        double media;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        n1 = scan.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = scan.nextDouble();
        System.out.print("Digite a terceira nota: ");
        n3 = scan.nextDouble();

        media = ((n1*2)+(n2*3)+(n3*5))/(2+3+5);

        System.out.println("\nA média final é: " + media);
    }
    public static void exec7 () {
        int quant;
        double p1 = 1.30, p2 = 1;
        double total;
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas maçãs foram compradas?: ");
        quant = scan.nextInt();
        if (quant < 12) {
            total = (quant*p1);
        }
        else {
            total = (quant*p2);
        }

        System.out.println("\nVvalor da compra: " + total);
    }
    public static void exec8 () {
        double n1, n2;
        double media;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        n1 = scan.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = scan.nextDouble();

        media = (n1+n2)/2;
        System.out.print("\nMédia: " + media);

        if (media < 6) {
            System.out.println("\nAluno Reprovado");
        }
        else if (media >= 6){
            System.out.println("\nAluno Aprovado");
        }
    }
    public static void exec9 () {
        int idade, ano, aux;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o ano em que você nasceu: ");
        idade = scan.nextInt();
        System.out.print("Digite o ano atual: ");
        ano = scan.nextInt();

        aux = ano - idade;

        if (aux < 16) {
            System.out.println("\nVocê ainda não pode votar");
        }
        else {
            System.out.println("\nVocê pode votar");
        }

    }
    public static void exec10 () {

        int jornadaRegular = 40;
        double horasExtras;
        double valorHora, valorHoraExtra;
        double salarioTotal;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o salário por hora: ");
        valorHora= scan.nextDouble();
        valorHoraExtra = (valorHora + (valorHora * 0.5));

        System.out.print("Digite quantas horas extras foram trabalhadas: ");
        horasExtras = scan.nextDouble();

        salarioTotal = ((jornadaRegular * valorHora) + (valorHoraExtra * horasExtras));

        System.out.println("\nSalário total do funcioário: " + salarioTotal + " reais");
    }
    public static void exec11 () {
        int quantAtual, quantMin, quantMax;
        double quantMedia;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade atual em estoque: ");
        quantAtual = scan.nextInt();
        System.out.print("Digite a quantidade máxima em estoque: ");
        quantMax = scan.nextInt();
        System.out.print("Digite a quantidade mínima em estoque: ");
        quantMin = scan.nextInt();

        quantMedia = ((quantMax + quantMin)/2);

        if (quantAtual >= quantMedia) {
            System.out.println("\nNão efetuar compra");
        }
        else if (quantAtual < quantMedia){
            System.out.println("\nefetuar compra");
        }
    }
    public static void exec12 () {

        double ladoA, ladoB, ladoC;
        double aux;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        ladoA = scan.nextDouble();
        System.out.print("Digite o valor do lado B: ");
        ladoB = scan.nextDouble();
        System.out.print("Digite o valor do lado C: ");
        ladoC = scan.nextDouble();

        if (((ladoA < (ladoB +ladoC))) && (ladoB < (ladoA +ladoC))  && (ladoC < (ladoB +ladoA))){
            System.out.println("\nÉ um triangulo");
        }
        else {
            System.out.println("\nNão é um triângulo");
        }
    }
    public static void exec13 () {

        String tipo;
        double precoG = 4.79, precoA = 3.69;
        double litros,valor;
        Scanner scan = new Scanner(System.in);

        System.out.print("Tipo do combustível: ");
        tipo = scan.next().toUpperCase();
        System.out.print("Litros foram vendidos: ");
        litros = scan.nextDouble();

        switch (tipo) {

            case "A":
                if (litros <= 20) {
                    valor =  (litros * precoA) - (precoA  * (litros * 0.02));
                    System.out.println("\nVvalor a ser pago: " + valor);
                }
                else {
                    valor =  (litros * precoA) - (precoA  * (litros * 0.05));
                    System.out.println("\nVvalor a ser pago: " + valor);
                }
                break;
            case "G":
                if (litros <= 20) {
                    valor =  (litros * precoG) - (precoG  * (litros * 0.03));
                    System.out.println("\nVvalor a ser pago: " + valor);
                }
                else {
                    valor =  (litros * precoG) - (precoG  * (litros * 0.06));
                    System.out.println("\nValor a ser pago: " + valor);
                }
                break;
        }
    }
    public static void exec14 () {
        String nome;
        int quantidade;
        double preco, desconto;
        double totalDesconto, totalBruto, totalLiquido;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        nome = scan.next();
        System.out.print("Digite o quantidade (unidades): ");
        quantidade = scan.nextInt();
        System.out.print("Digite o preço unitário: ");
        preco = scan.nextDouble();

        if (quantidade <= 5) {
            desconto = 0.02;
        } else if (quantidade <=10)  {
            desconto = 0.03;
        } else {
            desconto = 0.05;
        }

        totalBruto = quantidade * preco;
        totalDesconto = totalBruto * desconto;
        totalLiquido = (totalBruto - totalDesconto);

        System.out.println("Total: " + totalBruto);
        System.out.println("Desconto: " + totalDesconto);
        System.out.println("Total a pagar: " + totalLiquido);

    }

    public static void exec15 () {

        int anoNasc, anoIngresso, anoAtual;
        int idade, tempoCarreira;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        anoAtual = scan.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        anoNasc = scan.nextInt();
        System.out.print("Digite o ano de ingresso: ");
        anoIngresso = scan.nextInt();

        idade = anoAtual - anoNasc;
        tempoCarreira = anoAtual - anoIngresso;

        if ((idade >= 65) || (tempoCarreira >=30) || (idade>=60 && tempoCarreira >=25)) {
            System.out.println("Requerer aposentadoria");
        }
        else {
            System.out.println("Não requerer");
        }
    }

}