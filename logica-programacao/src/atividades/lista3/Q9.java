import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int N = -1;

        System.out.println("Digite um valor inteiro maior que 0 para N:");
        N = scan.nextInt();
        while (N<0){
            System.out.println("VALOR INVÁLIDO. Digite um valor inteiro maior que 0 para N:");
            N = scan.nextInt();
        }

        for (int i = 1; i <= N; i++){
            System.out.println(i);
        }

        }
    }
