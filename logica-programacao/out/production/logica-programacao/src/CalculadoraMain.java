import java.util.Locale;
import java.util.Scanner;

// ctrl + alt + l = indentação do código

public class CalculadoraMain {

    public static void main(String[] args) {
        EMenu menu = null;

        Scanner scann = new Scanner(System.in);
        Calculadora calculo = new Calculadora();
        do {
            try {
                menu = getOpcaoMenu();

                if (menu == EMenu.HISTORICO) {
                    String historico = calculo.getHistorico();
                    System.out.println("Histórico: \n" + historico);
                } else if (menu != EMenu.SAIR) {
                    System.out.println("Informe o primeiro número:");
                    double valor1 = scann.nextDouble();
                    System.out.println("Informe o segundo número:");
                    double valor2 = scann.nextDouble();
                    EOperacoesMatematica op = getOperacao(menu);
                    double resultado = calculo.calcular(valor1, valor2, op);

                    System.out.println("Resultado: " + resultado);
                }
            } catch (MenuInvalidoException e) {
                System.out.println("\nOperação inexistente!\n");
            }
        } while (menu != EMenu.SAIR);

        System.out.println("\nFinalizando Calculadora!");
    }

    private static EOperacoesMatematica getOperacao(EMenu menu) {
        EOperacoesMatematica operacao = null;
        switch (menu) {
            case SOMA:
                operacao = EOperacoesMatematica.SOMA;
                break;
            case SUBTRACAO:
                operacao = EOperacoesMatematica.SUBTRACAO;
                break;
            case MULTIPLICACAO:
                operacao = EOperacoesMatematica.MULTIPLICACAO;
                break;
            case DIVISAO:
                operacao = EOperacoesMatematica.DIVISAO;
                break;
            default:
                break;
        }
        return operacao;
    }

    private static EMenu getOpcaoMenu() throws MenuInvalidoException {
        Scanner scann = new Scanner(System.in);

        System.out.println("Escolha uma das operações abaixo:");
//        System.out.println(Calculadora.SOMA + " - Soma");
//        System.out.println("2 - Subtração");
//        System.out.println("3 - Multiplicação");
//        System.out.println("4 - Divisão");
//        System.out.println("5 - Histórico");
//        System.out.println("0 - Sair");

        for (EMenu menu : EMenu.values()) {
            System.out.println(menu.ordinal() + " - " + menu.getDescricao());
        }

        int indexOp = scann.nextInt();

        for (EMenu op : EMenu.values()) {
            if(indexOp == op.ordinal()) {
                return op;
            }
        }

        throw new MenuInvalidoException();
    }
}
