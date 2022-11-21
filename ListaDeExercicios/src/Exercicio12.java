/* Lista de Exercícios 1
Exercício 12:
Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo.
OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
 */

import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do lado A: ");
        a = scanner.nextInt();
        System.out.println("Digite o valor do lado B: ");
        b = scanner.nextInt();
        System.out.println("Digite o valor do lado C: ");
        c = scanner.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Essas dimensões são capazes de formar um triângulo.");
        }else {
            System.out.println("Essas dimensões não conseguem formar um triângulo.");
        }
    }
}
