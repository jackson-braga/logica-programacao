package atividades.lista1;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        //14. Faça um programa para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o
        //total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se
        //que:
        //● Se quantidade <= 5 o desconto será de 2%
        //● Se quantidade > 5 e quantidade <=10 o desconto será de 3%
        //● Se quantidade > 10 o desconto será de 5%

        Scanner scann = new Scanner(System.in);
        System.out.println("Informe o nome do produto.");
        String nome = scann.next();

        System.out.println("Informe a quantidade.");
        int quantidade = scann.nextInt();

        System.out.println("Informe o preço da unidade.");
        double preco = scann.nextFloat();

        if(quantidade <= 5){
            System.out.println("Total R$ "+ (quantidade * preco) + ", sendo o desconto de R$ " + (preco-(preco*0.02)) + " e o total a pagar R$ " + ((quantidade * preco)-(preco-(preco*0.02)))+".");
        }else if(quantidade <=10) {
            System.out.println("Total R$ "+ (quantidade * preco) + ", sendo o desconto de R$ " + (preco-(preco*0.03)) + " e o total a pagar R$ " + ((quantidade * preco)-(preco-(preco*0.02)))+".");
        }else {
            System.out.println("Total R$ "+ (quantidade * preco) + ", sendo o desconto de R$ " + (preco-(preco*0.05)) + " e o total a pagar R$ " + ((quantidade * preco)-(preco-(preco*0.02)))+".");
        }


    }
}
