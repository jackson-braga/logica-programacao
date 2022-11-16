import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o estoque atual");
        int atual = scan.nextInt();
        System.out.println("Qual o estoque mínimo?");
        int min = scan.nextInt();
        System.out.println("Qual o estoque máximo?");
        int max = scan.nextInt();

        if (atual >  (min + max)/2){
            System.out.println("Não efetuar compra." );
        } else {
            System.out.println("Efetuar compra." );
        }

    }
}
