import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // Entrada de dados
//        double valor1 = Double.valueOf(args[0]);
//        double valor2 = Double.valueOf(args[1]);

        int indexOp;
        Scanner scann = new Scanner(System.in);
        do {
            System.out.println("Escolha uma das operações abaixo:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");

            indexOp = scann.nextInt();

            if (indexOp < 0 || indexOp > 4) {
                System.out.println("\nOperação inexistente!\n");
                continue;
//                break;
            }

            System.out.println("Informe o primeiro número:");
            double valor1 = scann.nextDouble();
            System.out.println("Informe o segundo número:");
            double valor2 = scann.nextDouble();

            double resultado = 0;
//        if (indexOp == 0) {
//            // Soma
//            resultado = valor1 + valor2;
//        } else if (indexOp == 1) {
//            // subtração
//            resultado = valor1 - valor2;
//        } else if (indexOp == 2) {
//            // multiplicação
//            resultado = valor1 * valor2;
//        } else if (indexOp == 3) {
//            // divisão
//            resultado = valor1 / valor2;
//        }

            switch (indexOp) {
                case 1:
                    resultado = valor1 + valor2;
                    break;
                case 2:
                    resultado = valor1 - valor2;
                    break;
                case 3:
                    resultado = valor1 * valor2;
                    break;
                case 4:
                    resultado = valor1 / valor2;
                    break;
                default:
                    break;
            }

            // Saída de dados
            System.out.println("Resultado: " + resultado);

//        while(indexOp != 0){
//            indexOp = 1;
//        }
//
//        do {
//            indexOp = 0;
//        } while(indexOp != 0);
//
//        double[] valores = new double[] {1,2};
//        for (int i = 0; i < valores.length; i++) {
//            double valor = valores[i];
//        }
//
//        for (double valor : valores) {
//
//        }
        } while (indexOp != 0);

        System.out.println("\nFinalizando Calculadora!");
    }
}