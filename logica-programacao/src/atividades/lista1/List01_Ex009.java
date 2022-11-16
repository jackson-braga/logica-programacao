import java.util.Calendar;
import java.util.Scanner;

public class List01_Ex009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Calendar agora = Calendar.getInstance();
        int anoAtual = agora.get(Calendar.YEAR);
        System.out.println("Qual seu ano de nascimento: ");
        int anoNascimento = scan.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade <= 15) {
            System.out.println("Você ainda não tem idade para votar!");
        } else {
            System.out.println("Você já tem idade suficiente para votar!");
        }
        System.out.println("Idade atual: " + idade);
    }
}
