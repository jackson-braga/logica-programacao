import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        //Entrada de dados
        //double valor1 = Double.valueOf(args[0]);
        //double valor2 = Double.valueOf(args[1]);
        //EOperacoesMatematica.
        Scanner scan = new Scanner(System.in);
        int indexOp;
        do {
            System.out.println("Escolha uma das operações abaixo:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            indexOp = scan.nextInt();
            if (indexOp < 0 || indexOp > 4) {
                System.out.println("\nOperação inexistente\n");
            }
            else if (indexOp == 0) {
                System.out.println("Finalizando Calculadora");
                return;
            }
        } while (indexOp < 0 || indexOp > 4);

        System.out.println("Informe o primeiro número: ");
        double valor1 = scan.nextDouble();
        System.out.println("Informe o segundo número: ");
        double valor2 = scan.nextDouble();

        double resultado = 0;

        if (indexOp == 1) {
            resultado = valor1 + valor2;
        } else if (indexOp == 2) {
            resultado = valor1 - valor2;
        } else if (indexOp == 3) {
            resultado = valor1 * valor2;
        } else if (indexOp == 4) {
            resultado = valor1 / valor2;
        }
        System.out.println("Resultado: " + resultado);
    }
}
