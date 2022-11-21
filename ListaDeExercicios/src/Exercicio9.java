/*Lista de Exercícios 1
Exercício 9:
Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este
ano (não é necessário considerar o mês em que a pessoa nasceu).

 */
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o ano de seu nascimento: ");
        int anoNascimento = scan.nextInt();
        System.out.println("Informe o ano atual: ");
        double anoAtual = scan.nextDouble();


        if (anoAtual - anoNascimento < 16) {
            System.out.println("Você ainda não está apto a votar. ");
        } else {
            System.out.println("Você já está apto a votar. Consulte como regularizar seu título de eleitor. ");
        }
    }
}

