import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o lado 1");
        double lado1 = scan.nextDouble();
        System.out.println("Qual o lado 2?");
        double lado2 = scan.nextDouble();
        System.out.println("Qual o lado 3?");
        double lado3 = scan.nextDouble();

        if (lado1 <  lado2+lado3 & lado2 <  lado1+lado3 & lado3 <  lado2+lado1){
            System.out.println("É um triângulo." );
        } else {
            System.out.println("Não é um triângulo." );
        }

    }
}
