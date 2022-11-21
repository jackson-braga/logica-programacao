/* Lista de Exercícios 2
Exercício 3:
Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno.
Sendo que:
● Triângulo Equilátero: possui os 3 lados iguais.
● Triângulo Isóscele: possui 2 lados iguais.
● Triângulo Escaleno: possui 3 lados diferentes.
 */
import java.util.Scanner;
public class Exercício3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro lado:");
        int lado1 = scan.nextInt();
        System.out.println("Informe o valor do segundo lado: ");
        int lado2 = scan.nextInt();
        System.out.println("Informe o valor do terceiro lado: ");
        int lado3 = scan.nextInt();

             String mensagem ="";
        if (lado1 == lado2 && lado1 == lado3) {
            mensagem = "Este é um triângulo equilátero.";
        } else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2) {
            mensagem = "Este é um triângulo isóscele.";
        } else {
            mensagem = "Este é um triângulo escaleno.";
        }

        System.out.println(mensagem);
    }
}
