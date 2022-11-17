package atividades.lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class List01_Ex014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o nome do produto: ");
        String nomeProduto = scan.nextLine();
        System.out.println("Qual a quantidade adquirida do produto: ");
        int quantProduto = scan.nextInt();
        System.out.println("Qual o preço unitário do produto: ");
        float precoProduto = scan.nextFloat();
        float total = precoProduto * quantProduto;
        float desconto = 0;
        float totalAPagar = 0;

        if (quantProduto <= 5) {
            desconto = (total * 2) / 100;
            totalAPagar = total - desconto;
        } else if (quantProduto <= 10) {
            desconto = (total * 3) / 100;
            totalAPagar = total - desconto;
        } else if (quantProduto > 10) {
            desconto = (total * 5) / 100;
            totalAPagar = total - desconto;
        }
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantProduto);
        System.out.println("Preço do Produto: R$ " + new DecimalFormat(".##").format(precoProduto));
        System.out.println("Desconto: R$ " + new DecimalFormat(".##").format(desconto) + "%");
        System.out.println("Total a pagar: R$ " + new DecimalFormat(".##").format(totalAPagar));

    }
}
