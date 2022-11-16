import java.text.DecimalFormat;
import java.util.Scanner;

public class List01_Ex006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota1 = scan.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = scan.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = scan.nextFloat();

        float media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
        System.out.println("Média: " + new DecimalFormat(".#").format(media));
    }
}