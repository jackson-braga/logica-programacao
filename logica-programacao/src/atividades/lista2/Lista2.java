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
        System.out.print("Digite o ano em que voc� nasceu: ");
        anoNasc = scan.nextInt();
        System.out.print("Digite o ano atual: ");
        anoAtual = scan.nextInt();

        idade = anoAtual - anoNasc;

        if (idade < 67 && idade > 18) {
            System.out.println("\nVoc� pode doar sangue");
        }
        else {
            System.out.println("\nVoc� n�o pode doar sangue");
        }
    }
    public static void exec2(){
        double medida, area;
        int lados;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o n�mero de lados do pol�gono: ");
        lados = scan.nextInt();

        if (lados < 3){
            System.out.println("N�O � UM POL�GONO");
        }
        else if (lados > 5){
            System.out.println("POL�GONO N�O IDENTIFICADO");
        }
        else {
            System.out.print("Sua medida de lado: ");
            medida = scan.nextDouble();
            switch (lados) {
                case 3 -> {
                    area = (medida * medida) / 2;
                    System.out.println("Seu pol�gono � um  TRI�NGULO com " + area + "cm� de �REA");
                }
                case 4 -> {
                    area = (medida * medida);
                    System.out.println("Seu pol�gono � um  QUADRADO com " + area + "cm� de �REA");
                }
                case 5 -> System.out.println("Seu pol�gono � um  PENT�GONO");
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
            System.out.println("\n� um triangulo equil�tero");
        } else if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoC == ladoB)){
            System.out.println("\n� um triangulo is�sceles");
        }
        else{
            System.out.println("� um tri�ngulo escaleno");
        }
    }
    public static void exec4() {

        double angA, angB, angC;
        double aux;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do �ngulo A: ");
        angA = scan.nextDouble();
        System.out.print("Digite o valor do �ngulo B: ");
        angB = scan.nextDouble();
        System.out.print("Digite o valor do �ngulo C: ");
        angC = scan.nextDouble();

        if ((angA == 90) || (angB == 90) || (angC == 90)) {
            System.out.println("\n� um triangulo ret�ngulo");
        } else if ((angA > 90) || (angB > 90) || (angC > 90)){
            System.out.println("\n� um triangulo obtus�ngulo");
        }
        else{
            System.out.println("� um tri�ngulo acut�ngulo");
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
                System.out.println("A letra � uma vogal");
                break;
            }
            cont+=1;
        }
        if (cont > 4){
            System.out.println("� uma consoante");
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
           System.out.println("M�dia:" + media);
           System.out.println("Conceito: " + conceito);
           System.out.println("APROVADO");
       }
        else {
           System.out.println("Nota 1: " + nota1 + " e Nota 2: " + nota2);
           System.out.println("M�dia:" + media);
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
            System.out.println("\nN�o � bissexto");
        }
    }
    public static void exec8(){

        Scanner scan = new Scanner(System.in);
        int cont = 0;
        String resp;
        System.out.println("Responda as perguntas com Sim ou N�o:");
        String[] perguntas = {"Telefonou para a v�tima? ", "Esteve no local do crime? ",
                "Mora perto da v�tima? ", "Devia para a v�tima? ", "J� trabalhou com a v�tima? "};

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
                System.out.println("C�mplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
        }
    }

}
