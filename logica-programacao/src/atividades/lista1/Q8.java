import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) throws Exception {
        double custo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a nota 1?");
        double n1 = scan.nextDouble();
        System.out.println("Qual a nota 2?");
        double n2 = scan.nextDouble();

        double nota = (n1+n2)/2;
        System.out.println("A média é :" + nota);

        if (nota<6){
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno aprovado.");
        }

    }
}
