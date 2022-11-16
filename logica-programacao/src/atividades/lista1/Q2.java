import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os anos:");
        int anos = scan.nextInt();
        System.out.println("Digite os meses:");
        int meses = scan.nextInt();
        System.out.println("Digite os dias:");
        int dias = scan.nextInt();

        System.out.println( "Esta pessoa viveu " + (365*anos + 30*meses + dias) + " dias");


    }
}
