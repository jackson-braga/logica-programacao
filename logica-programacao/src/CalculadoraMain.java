import java.util.Scanner;

// ctrl + alt + l = indentação do código

public class CalculadoraMain {

    public static void main(String[] args) {
        int indexOp;


        Scanner scann = new Scanner(System.in);
        do {

            indexOp = getOperacao();

            if (indexOp < 0 || indexOp > 4) {

                System.out.println("\nOperação inexistente!\n");
                continue;
//                break;
            } else if (indexOp != 0) {

                Calculadora calculo = new Calculadora();
                System.out.println("Informe o primeiro número:");
                double valor1 = scann.nextDouble();
                System.out.println("Informe o segundo número:");
                double valor2 = scann.nextDouble();

                double resultado = calculo.calcular(valor1, valor2, indexOp);

                System.out.println("Resultado: " + resultado);

            }

        } while (indexOp != 0);


        System.out.println("\nFinalizando Calculadora!");

        scann.close();
    }

    private static int getOperacao() {
        Scanner scann = new Scanner(System.in);
        System.out.println("Escolha uma das operações abaixo:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("0 - Sair");

        int indexOp = scann.nextInt();
        scann.close();
        return indexOp;
    }
}
