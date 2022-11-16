import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        double n1 = scan.nextDouble();
        System.out.println("Digite a nota 2:");
        double n2 = scan.nextDouble();
        System.out.println("Digite a nota 3:");
        double n3 = scan.nextDouble();

        System.out.println("Nota final: " + (n1*2 + n2*3 + n3*5)*0.1);


    }
}
