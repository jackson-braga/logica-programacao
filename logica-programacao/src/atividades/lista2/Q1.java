import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = scan.nextInt();

        if (idade > 67 || idade < 18){
            System.out.println("Não pode doar sangue.");
        } else {
            System.out.println("Pode doar sangue.");
        }


    }
}
