import java.util.Scanner;

public class Calculadora {
    public static final int SOMA = 1;
    private String[] historicoArray = new String[8];

    public double calcular(double valor1, double valor2, int operacao) {

        // public: todos podem ver
        // private: somente a classe consegue visualizar
        // protect: a classe e os filhos podem visualizar
        // static é um método que pode ser acessado sem precisar que o objeto seja instanciado
        // void não tem retorno


        double resultado = 0;

        switch (operacao) {
            case SOMA:
                resultado = somar(valor1, valor2);
                break;
            case 2:
                resultado = subtrair(valor1, valor2);
                break;
            case 3:
                resultado = multiplicar(valor1, valor2);
                break;
            case 4:
                resultado = dividir(valor1, valor2);
                break;
            default:
                break;
        }

        setHistorico(valor1, valor2, operacao, resultado);
        return resultado;


    }

    private double somar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    private double subtrair(double valor1, double valor2) {
        return valor1 - valor2;
    }

    private double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    private double dividir(double valor1, double valor2) {
        return valor1 / valor2;
    }

    private void setHistorico(double valor1, double valor2, int operacao, double resultado) {
        String historico = montarHistorico(valor1, valor2, operacao, resultado);

        for(int i = 0; i < historicoArray.length; i++) {
            if (historicoArray[i] == null) {
                historicoArray[i] = historico;
                break;
            }
        }
    }

    private String montarHistorico(double valor1, double valor2, int operacao, double resultado) {
        String historico = String.valueOf(valor1);
        historico += "";

        switch (operacao) {
            case SOMA:
                historico += " + ";
                break;
            case 2:
                historico += " - ";
                break;
            case 3:
                historico += " * ";
                break;
            case 4:
                historico += " / ";
                break;
            default:
                break;
        }

        historico += String.valueOf(valor2);
        historico += " = ";
        historico += String.valueOf(resultado);
        return historico;
    }

    public String getHistorico() {
        String historicoCompleto = "";
        for (int i = 0; i < historicoArray.length; i++) {
            String historico = historicoArray[i];
            if (historico != null) {
                historicoCompleto += historico;
                historicoCompleto += "\n";
            }
        }
        return historicoCompleto;
    }
                                                                                                                   
}
