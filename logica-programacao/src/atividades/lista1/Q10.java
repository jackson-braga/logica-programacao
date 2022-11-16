import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o salário por hora?");
        double salario = scan.nextDouble();
        System.out.println("Qual a quantidade de horas trabalhadas no mês?");
        double horas = scan.nextDouble();

        if (horas>  160){
            System.out.println("Salário total: " + (salario*(160 + 1.5*horas - 240)) );
        } else {
            System.out.println("Salário total: " + (salario*horas) );
        }

    }
}
