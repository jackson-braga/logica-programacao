import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) throws Exception {

        //Lendo o número de linhas:
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero de linhas: ");
        int j = scan.nextInt();
        int n =1;

        //Desenha 1 linha a cada iteração:
        while (n<=j) {
            //Desenha 1 linha:
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            //Pula para escrever próxima linha e decrementa contador:
            System.out.println();
            n++;
        }
    }
}
