/* Lista de Exercícios 2
Exercício 2:
Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm). Calcular e imprimir o
seguinte:
● Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
● Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
● Se o número de lados for igual a 5 escrever PENTÁGONO.
● se o número de lados for inferior a 3 escrever NÃO É UM POLÍGONO.
● se o número de lados for superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.
 */
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Programa que informa o tipo e area de um polígono.");
        System.out.println("Quantos lados o polígono possui?");
        double lados = scan.nextInt();
        System.out.println("Qual a medida dos seus lados?");
        double medidas = scan.nextInt();

        String mensagem ="";
        double area;
        if (lados < 3) {
            mensagem = "Não é um polígono.";
        } else if (lados == 3) {
            double base = medidas / 2;
           area = (base * medidas) / 2;
            mensagem = "Triângulo - " + area + "cm² de área.";
        } else if (lados == 4) {
            area = medidas * medidas;
            mensagem = "Quadrado - " + area + "cm² de área.";
        } else if (lados == 5) {
            mensagem = "Este é um pentágono.";
        }else {
            mensagem = "Polígono não identificado.";
        }

        System.out.println(mensagem);
    }
}
