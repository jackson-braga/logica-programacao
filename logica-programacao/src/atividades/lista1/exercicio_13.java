package atividades.lista1;

import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        double litros;
        String tipo;
        double valor;
        double desconto;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos litros você vai comprar: ");
        litros = scanner.nextDouble();
        System.out.println("Digite o tipo de combustível: (G) para gasolina e (A) para Alcool.");
        tipo = scanner.next().toUpperCase();
        if (tipo.equals("G")){
            if (litros<=20){
                desconto = ((litros * 4.69)/100)*3 ;
                valor = (litros*4.69) - desconto;
                System.out.println("O valor pago pelo combustível é: " + valor + " reais.");
            }else {
                desconto = ((litros * 4.69)/100)*6 ;
                valor = (litros*4.69) - desconto;
                System.out.println("O valor pago pelo combustível é: " + valor + " reais.");
            }
        }else if (tipo.equals("A")) {
            if (litros <= 20) {
                desconto = ((litros * 3.69) / 100) * 2;
                valor = (litros * 3.69) - desconto;
                System.out.println("O valor pago pelo combustível é: " + valor + " reais.");
            } else {
                desconto = ((litros * 3.69) / 100) * 5;
                valor = (litros * 3.69) - desconto;
                System.out.println("O valor pago pelo combustível é: " + valor + " reais.");
            }
        }
    }
}
