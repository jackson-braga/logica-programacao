package atividades.lista1;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite qual tipo de combustivel: A-etano ou G-gasolina: ");
        char tipoCombust = sc.next().charAt(0);
        System.out.print("Digite quantos litros de combustível: ");
        double litrosCombus = sc.nextDouble();

        if (tipoCombust == 'A' && litrosCombus <= 20) {
            double valor = litrosCombus * 3.69;
            double valorTotal = valor - (valor * 0.02);
            System.out.printf("O valor a ser pago é R$ %.2f" , valorTotal);
        } else if (tipoCombust == 'A' && litrosCombus > 20) {
            double valor = (litrosCombus * 3.69);
            double valorTotal = valor - (valor * 0.05);
            System.out.printf("O valor a ser pago é R$ %.2f" , valorTotal);
        } else if (tipoCombust == 'G' && litrosCombus <= 20) {
            double valor = (litrosCombus * 4.79);
            double valorTotal = valor - (valor * 0.03);
            System.out.printf("O valor a ser pago é R$ %.2f" , valorTotal);
        } else {
            double valor = (litrosCombus * 4.79);
            double valorTotal = valor - (valor * 0.06);
            System.out.printf("O valor a ser pago é R$ %.2f" , valorTotal);


        }

        sc.close();
    }
}
