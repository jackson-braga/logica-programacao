/*Lista de Exercícios 1
Exercício 11:
Faça um programa para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque
de um produto. Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2).
Se a quantidade em estoque for maior ou igual a quantidade média, escrever a mensagem 'Não efetuar compra', senão
escrever a mensagem 'Efetuar compra'.
 */

import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double estoqueMaximo;
        double estoqueMinimo;
        double estoqueAtual;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade máxima do produto: ");
        estoqueMaximo = scanner.nextDouble();
        System.out.println("Digite a quantidade mínima do produto: ");
        estoqueMinimo = scanner.nextDouble();
        System.out.println("Digite a quantidade atual em estoque do produto: ");
        estoqueAtual = scanner.nextDouble();
        double media = (estoqueMaximo + estoqueMinimo) / 2;
        if (estoqueAtual>=media){
            System.out.println("Estoque suficiente. Não necessário realizar compra.");
        }else {
            System.out.println("Estoque insuficiente. Necessário realizar compra.");
        }
    }
}
