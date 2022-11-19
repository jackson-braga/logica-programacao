import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        double v1;
        double v2 = 0.0;

        System.out.println("Digite o primeiro valor: ");
        v1 = scan.nextDouble();

        System.out.println("Digite o segundo valor, que deve ser diferente de 0:");
        v2 = scan.nextDouble();
        while (v2 == 0.0) {
            System.out.println("VALOR INVÁLIDO");
            System.out.println("Digite o segundo valor, que deve ser diferente de 0:");
            v2 = scan.nextDouble();
        }
        System.out.println("A divisão do primeiro pelo segundo é: " + v1/v2);
        }
    }
