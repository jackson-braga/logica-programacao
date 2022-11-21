/*Lista de Exercícios 1
Exercício 8:
Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga
se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média
calculada.
 */
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a nota da primeira avaliação: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a nota da segunda avaliação: ");
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 6) {
            System.out.println("Você foi aprovado com média: " + media);
        } else {
            System.out.println("Você foi reprovado com média: " + media);
        }

    }
}
