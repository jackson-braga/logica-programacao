import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) throws Exception {
        double custo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o número de maças compradas?");
        int n = scan.nextInt();

        if (n<12){
            System.out.println("Valor total: R$" + 1.3*n);
        } else {
            System.out.println("Valor total: R$" + 1.0*n);
        }

    }
}
