/* Lista de Exercícios 1
Exercício 5:
Escreva um programa para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus
Celsius (baseado na fórmula abaixo): 𝐶 =
(𝐹−32)
( 9 ) * 5
Observação: Para testar se a sua resposta está correta saiba que 100ºC = 212F
*/
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fahrenheit: ");
        double temperatura = scan.nextDouble();
        double celsius = ((temperatura - 32) / 9) * 5;
        System.out.println("O temperatura em Celsius é " + celsius);
    }
    }