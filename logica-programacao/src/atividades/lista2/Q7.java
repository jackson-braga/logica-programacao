import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um ano:");
        int ano = scan.nextInt();

        if ((ano%4 == 0 & ano%100 != 0) || ano%400 == 0){
            System.out.println("É um ano bissexto.");
        } else {
            System.out.println("Não é um ano bissexto.");
        }

    }
}
