import java.util.Scanner;

public class List01_Ex011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é a quantidade atual em estoque do produto: ");
        int quantAtual = scan.nextInt();
        System.out.println("Qual é a quantidade máxima de estoque para o produto: ");
        int quantMaxima = scan.nextInt();
        System.out.println("Qual é a quantidade mínima de estoque para o produto: ");
        int quantMinima = scan.nextInt();

        int quantMedia = (quantMaxima + quantMinima) / 2;

        if (quantAtual >= quantMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }
}
