import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) throws Exception {
        double custo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o ano atual?");
        double atual = scan.nextInt();
        System.out.println("Qual seu ano de nascimentos?");
        double antes = scan.nextInt();

        if (atual- antes< 16){
            System.out.println("Não possui idade suficiente para votar.");
        } else {
            System.out.println("Possui idade suficiente para votar.");
        }

    }
}
