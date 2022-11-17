import java.util.Scanner;

import static java.lang.Math.pow;

public class Q2 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a quantidade de lados?");
        int qtd = scan.nextInt();
        System.out.println("Qual o tamanho dos lados?");
        double tam = scan.nextDouble();

        if (qtd < 3){
            System.out.println("NÃO É UM POLÍGONO.");
        }
        else if (qtd > 5) {
            System.out.println("POLÍGONO NÃO IDENTIFICADO.");
        }
        else {
            switch (qtd){
                case 3:
                    System.out.println("TRIÂNGULO DE ÁREA " + pow(tam, 2)*pow(3,0.5)/4);
                    break;
                case 4:
                    System.out.println("QUADRADO DE ÁREA " + pow(tam, 2));
                    break;
                case 5:
                    System.out.println("PENTÁGONO");
                    break;

            }
        }


    }
}
