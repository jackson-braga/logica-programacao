import java.util.Scanner;

public class Calculadora {
    int index;

    public Calculadora() {
    }

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int indexOp;
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
                break;
            }

            System.out.println("Informe o primeiro número:");
            double valor1 = scann.nextDouble();
            System.out.println("Informe o segundo número:");
            double valor2 = scann.nextDouble();
            double resultado = 0.0;
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
            }

            System.out.println("Resultado: " + resultado);
        } while(indexOp != 0);

        System.out.println("\nFinalizando Calculadora!");
    }
}
