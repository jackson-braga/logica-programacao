import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número total de votos:");
        int total = scan.nextInt();
        System.out.println("Digite o número de votos brancos:");
        int brancos = scan.nextInt();
        System.out.println("Digite o número de votos nulos:");
        int nulos = scan.nextInt();
        System.out.println("Digite o número de votos válidos:");
        int validos = scan.nextInt();

        System.out.println("brancos: "  + (brancos*100)/total + "%");
        System.out.println("nulos: "  + (nulos*100)/total + "%");
        System.out.println("validos: "  + (validos*100)/total + "%");

    }
}
