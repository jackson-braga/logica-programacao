import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        double aux;

        System.out.println("Digite, em sequência, três valores:");
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        System.out.println("Ordem de leitura: " + A + ", " + B + " e " + C);

        while ( B> A || C >A || C > B) {
            if (B > A) {
                aux = B;
                B = A;
                A = aux;
            }
            if (C > B) {
                aux = C;
                C = B;
                B = aux;
            }
        }

        System.out.println("Ordem decrescente: " + A + ", " + B + " e " + C);

        while ( B< A || C <A || C < B) {
            if (B < A) {
                aux = B;
                B = A;
                A = aux;
            }
            if (C < B) {
                aux = C;
                C = B;
                B = aux;
            }
        }

        System.out.println("Ordem crescente: " + A + ", " + B + " e " + C);

    }
}
