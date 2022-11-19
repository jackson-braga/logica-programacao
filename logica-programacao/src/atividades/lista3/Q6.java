import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 3){
            System.out.println("\nMenu de opções:\n1. Média aritimética\n2. Média ponderada\n3. Sair");
            opcao = scan.nextInt();

            if (opcao == 1){
                System.out.println("Digite as duas notas em sequẽncia:");
                double nota1 = scan.nextDouble();
                double nota2 = scan.nextDouble();
                System.out.println("Média: " + (nota2 + nota1)/2);

            } else if (opcao == 2) {
                System.out.println("Digite os pares nota e peso, em sequência");
                double nota1 = scan.nextDouble();
                double peso1 = scan.nextDouble();
                double nota2 = scan.nextDouble();
                double peso2 = scan.nextDouble();
                double nota3 = scan.nextDouble();
                double peso3 = scan.nextDouble();
                System.out.println("A média ponderada é: " + (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1 + peso2 + peso3));

            } else if (opcao == 3) {
                break;

            } else {
                System.out.println("Digite um número válido.");
            }
        }


        }
    }
