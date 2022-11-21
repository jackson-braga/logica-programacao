/*Lista de Exercícios 1
Exercício 6:
Faça um programa que leia três notas de um aluno, calcule e escreva a média final deste aluno. Considere que a média é
ponderada e que o peso das notas é 2, 3 e 5.
Fórmula para o cálculo da média final é:
𝑀𝐸𝐷𝐼𝐴𝐹𝐼𝑁𝐴𝐿 =
(𝑁1 ×2) +(𝑁2 ×3) + (𝑁3 ×5)
(2+3+5
 */
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double nota3 = scan.nextDouble();
        double mediaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
        System.out.println("A sua media final é: " + mediaFinal);}

}
