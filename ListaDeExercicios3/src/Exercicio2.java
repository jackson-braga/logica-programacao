/*Lista de Exercícios 3
Exercício 2:
Faça um programa que leia três valores (A, B, C) e mostre-os na ordem lida. Em seguida, mostre-os em ordem crescente e
decrescente.
 */
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com 3 valores: ");
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        int valor3 = scan.nextInt();
        int aux;

        System.out.println("Os valores na ordem digitada foram: " + valor1 + "; " + valor2 + "; " + valor3);
        if (valor1 > valor2) {
            aux = valor1;
            valor1 = valor2;
            valor2 = aux;
        } if  (valor1 > valor3) {
            aux = valor1;
            valor1 = valor3;
            valor3 = aux;
        } if (valor2 > valor3) {
            aux = valor2;
            valor2 = valor3;
            valor3 = aux;
        }
        System.out.println("Os valores em ordem crescente foram: " + valor1 + "; " + valor2 + "; " + valor3);
        System.out.println("Os valores em ordem decrescente foram: " + valor3 + "; " + valor2 + "; " + valor1);

          }
}
