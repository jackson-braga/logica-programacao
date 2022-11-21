/* Lista de Exercícios 2
Exercício 6:
Faça um programa que leia as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule
a sua média. A atribuição de conceitos obedece à tabela abaixo:
Média de aproveitamento Conceito
Entre 9.0 e 10.0 A
Entre 7.5 e 9.0 B
Entre 6.0 e 7.5 C
Entre 4.0 e 6.0 D
Entre 4.0 e 0 E
O programa deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito
for A, B ou C “REPROVADO” se o conceito for D ou E.
 */
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();

        String notaConceito;
        String statusFinal;
        double media = (nota1 + nota2) / 2;
        if (media >= 9 && media <= 10) {
            notaConceito = "A";
            statusFinal = "Aprovado";
        } else if (media < 9 && media >= 7.5) {
            notaConceito = "B";
            statusFinal = "Aprovado";
        } else if (media < 7.5 && media >= 6) {
            notaConceito = "C";
            statusFinal = "Aprovado";
        } else if (media < 6 && media >= 4) {
            notaConceito = "D";
            statusFinal = "Reprovado";
        } else {
            notaConceito = "E";
            statusFinal = "Reprovado";
        }

       System.out.println("Sua média foi " + media + " e sua nota conceito foi " + notaConceito + "\n" +
               "Portanto, você foi: " + statusFinal);
    }
}
