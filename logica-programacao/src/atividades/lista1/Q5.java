import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura:");
        double temperatura = scan.nextDouble();

        System.out.println("Temperatura em graus Celsius: " + ((temperatura - 32)/9)*5);


    }
}
