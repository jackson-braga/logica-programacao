import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int idade;
        int cont = 0;

        for (int i = 0; i<10; i++){
            System.out.println("Escreva as idades em sequência:");
            idade = scan.nextInt();
            if (idade >= 18){cont++;}
        }

        System.out.println(cont + "pessoas possuem 18 ou mais anos.");



    }
}
