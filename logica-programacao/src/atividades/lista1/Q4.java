import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário fixo:");
        double salario = scan.nextDouble();
        System.out.println("Digite o total de vendas:");
        double total = scan.nextDouble();

        System.out.println("Salário final: " + (salario + total*0.05));
        

    }
}
