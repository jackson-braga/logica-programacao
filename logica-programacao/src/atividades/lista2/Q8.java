import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int qtn = 0;

        System.out.println("Você está sendo interrogado por um código escrito em Java. Responda as seguintes perguntas com 1 (Sim) ou 0 (Não):");
        System.out.println("Telefonou para a vítima?");
        qtn += scan.nextInt();
        System.out.println("Esteve no local do crime?");
        qtn += scan.nextInt();
        System.out.println("Mora perto da vítima?");
        qtn += scan.nextInt();
        System.out.println("Devia para a vítima?");
        qtn += scan.nextInt();
        System.out.println("Já trabalhou com a vítima?");
        qtn += scan.nextInt();

        if (qtn == 5){
            System.out.println("Assassino!!!!!!");
        } else if (qtn == 4 || qtn == 3) {
            System.out.println("Cúmplice!!!");
        } else if (qtn == 2) {
            System.out.println("Suspeito...");
        } else {
            System.out.println("Inocente!");
        }

    }
}
