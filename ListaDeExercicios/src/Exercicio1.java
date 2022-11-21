/* Lista de Exercícios 1
Exercício 1:
Escreva um programa para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
*/

import java.util.Scanner;
public class Exercicio1 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Informe o valor da base do retângulo: ");
        int base = scan.nextInt();
        System.out.println("Informe o valor da altura do retângulo: ");
        int altura = scan.nextInt();
        System.out.println("A área do retângulo é: " + base * altura);
    }
}