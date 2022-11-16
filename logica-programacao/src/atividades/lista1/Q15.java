import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o ano de nascimento?");
        int nascimento = scan.nextInt();
        System.out.println("Qual o ano de ingresso?");
        int ingresso = scan.nextInt();

        if (2022 - nascimento >= 65){
            System.out.println("Requerer aposentadoria.");
        } else if (2022 - nascimento >= 60 & 2022-ingresso >= 25){
            System.out.println("Requerer aposentadoria.");
        } else if (2022-ingresso >= 30){
            System.out.println("Requerer aposentadoria.");
        } else {
            System.out.println("Não requerer.");
        }


    }
}
