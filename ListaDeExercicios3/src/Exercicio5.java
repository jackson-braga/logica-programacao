/*Lista de Exercícios 3
Exercício 5:
Faça um programa que recebe a altura de um triângulo em um número inteiro e imprima-o utilizando asteriscos. Veja o
Exemplo:
Entrada: 5
*
**
***
****
*****

 */

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de caractéres desejados na pirâmide:");
        int quantidadeLinhas = scanner.nextInt();


        for(int i = 0; i < quantidadeLinhas ; i++){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
    }
}
}