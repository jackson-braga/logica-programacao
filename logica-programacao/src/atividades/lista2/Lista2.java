package ListasDeExercicios;

import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {

//        exec1();
//        exec2();
//        exec3();
//        exec4();
//        exec5();
//        exec6();
//        exec7();
        exec8();
    }
    public static void exec1(){

        int idade, anoAtual, anoNasc;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o ano em que você nasceu: ");
        anoNasc = scan.nextInt();
        System.out.print("Digite o ano atual: ");
        anoAtual = scan.nextInt();

        idade = anoAtual - anoNasc;

        if (idade < 67 && idade > 18) {
            System.out.println("\nVocê pode doar sangue");
        }
        else {
            System.out.println("\nVocê não pode doar sangue");
        }
    }
    public static void exec2(){
        double medida, area;
        int lados;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número de lados do polígono: ");
        lados = scan.nextInt();

        if (lados < 3){
            System.out.println("NÃO É UM POLÍGONO");
        }
        else if (lados > 5){
            System.out.println("POLÍGONO NÃO IDENTIFICADO");
        }
        else {
            System.out.print("Sua medida de lado: ");
            medida = scan.nextDouble();
            switch (lados) {
                case 3 -> {
                    area = (medida * medida) / 2;
                    System.out.println("Seu polígono é um  TRIÂNGULO com " + area + "cm² de ÁREA");
                }
                case 4 -> {
                    area = (medida * medida);
                    System.out.println("Seu polígono é um  QUADRADO com " + area + "cm² de ÁREA");
                }
                case 5 -> System.out.println("Seu polígono é um  PENTÁGONO");
            }
        }

    }

    public static void exec3() {

        double ladoA, ladoB, ladoC;
        double aux;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        ladoA = scan.nextDouble();
        System.out.print("Digite o valor do lado B: ");
        ladoB = scan.nextDouble();
        System.out.print("Digite o valor do lado C: ");
        ladoC = scan.nextDouble();

        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("\nÉ um triangulo equilátero");
        } else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoC == ladoB)){
            System.out.println("\nÉ um triangulo isósceles");
        }
        else{
            System.out.println("É um triângulo escaleno");
        }
    }
    public static void exec4() {

        double angA, angB, angC;
        double aux;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do ângulo A: ");
        angA = scan.nextDouble();
        System.out.print("Digite o valor do ângulo B: ");
        angB = scan.nextDouble();
        System.out.print("Digite o valor do ângulo C: ");
        angC = scan.nextDouble();

        if ((angA == 90) || (angB == 90) || (angC == 90)) {
            System.out.println("\nÉ um triangulo retângulo");
        } else if ((angA > 90) || (angB > 90) || (angC > 90)){
            System.out.println("\nÉ um triangulo obtusângulo");
        }
        else{
            System.out.println("É um triângulo acutângulo");
        }
    }
    public static void exec5() {

        Scanner scan = new Scanner(System.in);
        String[] vogais = {"a", "e", "i", "o", "u"};
        String letra;

        System.out.print("Digite uma letra:");
        letra = scan.next();
        int cont = 0;

        for (int i = 0; i < vogais.length; i++) {
            if (letra.equalsIgnoreCase(vogais[i])){
                System.out.println("A letra é uma vogal");
                break;
            }
            cont+=1;
        }
        if (cont > 4){
            System.out.println("É uma consoante");
        }
    }
    public static void exec6(){

        double nota1, nota2, media;
        String conceito = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        nota1 = scan.nextInt();
        System.out.print("Digite a nota 2: ");
        nota2 = scan.nextInt();

        media = (nota1 + nota2)/2;

        if (media < 4) {
            conceito = "E";
        } else if (media >= 4 && media <6){
            conceito = "D";
        } else if (media >= 6 && media < 7.5){
            conceito = "C";
        }else if (media >= 7.5 && media <9){
            conceito = "B";
        }else if (media >=9  && media <10){
            conceito = "A";
        }

       if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")){
           System.out.println("\nNota 1: " + nota1 + " e Nota 2: " + nota2);
           System.out.println("Média:" + media);
           System.out.println("Conceito: " + conceito);
           System.out.println("APROVADO");
       }
        else {
           System.out.println("Nota 1: " + nota1 + " e Nota 2: " + nota2);
           System.out.println("Média:" + media);
           System.out.println("Conceito: " + conceito);
           System.out.println("REPROVADO");
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

        Scanner scan = new Scanner(System.in);
        int cont = 0;
        String resp;
        System.out.println("Responda as perguntas com Sim ou Não:");
        String[] perguntas = {"Telefonou para a vítima? ", "Esteve no local do crime? ",
                "Mora perto da vítima? ", "Devia para a vítima? ", "Já trabalhou com a vítima? "};

        for (String pergunta : perguntas) {
            System.out.print(pergunta);
            resp = scan.next();
            if (resp.equalsIgnoreCase("Sim")) {
                cont++;
            }
        }
        System.out.println("");
        switch (cont){
            case 2:
                System.out.println("Suspeita");
                break;
            case 3: case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
        }
    }

}
