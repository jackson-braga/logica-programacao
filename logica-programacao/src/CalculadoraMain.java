import java.util.Scanner;

// ctrl + alt + l = indentação do código

public class CalculadoraMain {

    public static void main(String[] args) {
        int indexOp;

        Scanner scann = new Scanner(System.in);
        Calculadora calculo = new Calculadora();
        do {

            indexOp = getOperacao();

//            switch (indexOp) {
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                    System.out.println("Informe o primeiro número:");
//                    double valor1 = scann.nextDouble();
//                    System.out.println("Informe o segundo número:");
//                    double valor2 = scann.nextDouble();
//
//                    double resultado = calculo.calcular(valor1, valor2, indexOp);
//
//                    System.out.println("Resultado: " + resultado);
//                    break;
//                case 5:
//                    break;
//                default:
//                    System.out.println("\nOperação inexistente!\n");
//                    break;
//            }

            if (indexOp < 0 || indexOp > 5) {

                System.out.println("\nOperação inexistente!\n");
                continue;
//                break;
            } else if (indexOp == 5) {
                String historico = calculo.getHistorico();
                System.out.println("Histórico: \n" + historico);
            } else if (indexOp != 0) {
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
        System.out.println("5 - Histórico");
        System.out.println("0 - Sair");

        int indexOp = scann.nextInt();
        scann.close();
        return indexOp;
    }
}
