package atividades.lista1;
import java.util.Scanner;

/**
 * @author CrisMoura on 15/11/2022
 */
public class Exerc14 {
    public static void main(String[] args) {
// Faça um programa para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o
// total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se
// que:
//● Se quantidade <= 5 o desconto será de 2%
//● Se quantidade > 5 e quantidade <=10 o desconto será de 3%
//● Se quantidade > 10 o desconto será de 5%

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do produto desejado: ");
        String produto = input.nextLine();

        System.out.println("Digite a quantidade: ");
        int quantidade = input.nextInt();

        System.out.println("Valor da unidade: ");
        double valorUnidade = input.nextDouble();

        double valorDesconto;
        double totalSemDesconto = quantidade * valorUnidade;

        double desc1 = (valorUnidade * 2) / 100;
        double desc2 = (valorUnidade * 3) / 100;
        double desc3 = (valorUnidade * 5) / 100;

        if(quantidade <= 5 ){
            valorDesconto = desc1 * quantidade;
        }else if(quantidade > 5 && quantidade <=10){
            valorDesconto = desc2 * quantidade;
        }else{
            valorDesconto = desc3 * quantidade;
        }

        System.out.println("Valor Total: R$ " + totalSemDesconto);
        System.out.println("Valor desconto: R$ " + valorDesconto);
        System.out.println("Valor Total a Pagar R$ " + (totalSemDesconto - valorDesconto));
    }


}
