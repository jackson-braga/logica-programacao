import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        String teste = "S";

        while (teste.equals("S")) {
            double n1 = -1;
            double n2 = -1;
            while (n1 <0 || n1 > 10) {
                System.out.println("Digite um valor válido para a nota 1:");
                n1 = scan.nextDouble();
            }
            while (n2 <0 || n2 > 10) {
                System.out.println("Digite um valor válido para a nota 2:");
                n2 = scan.nextDouble();
            }
            System.out.println("A média é: " + (n1+n2)/2 +  "\nNOVO CÁLCULO (S/N)?");
            teste = scan.next();
        }


        }
    }
