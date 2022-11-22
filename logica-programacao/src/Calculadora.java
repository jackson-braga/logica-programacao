import java.util.Scanner;

public class Calculadora {
    public static final int SOMA = 10;
    private String[] historicoArray = new String[8];
    private char[][] matris = new char[3][3];

    public double calcular(double valor1, double valor2, EOperacoesMatematica operacao) {

        for (int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris.length; j ++) {
                char c = matris[i][j];
            }
        }
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
            case SUBTRACAO:
                resultado = subtrair(valor1, valor2);
                break;
            case MULTIPLICACAO:
                resultado = multiplicar(valor1, valor2);
                break;
            case DIVISAO:
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

    private void setHistorico(double valor1, double valor2, EOperacoesMatematica operacao, double resultado) {
        String historico = montarHistorico(valor1, valor2, operacao, resultado);

        int ultimoIdx = historicoArray.length - 1;
        if(historicoArray[ultimoIdx] != null) {
            for (int i = 1; i < historicoArray.length; i++) {
                historicoArray[i-1] = historicoArray[i];
                if (i == ultimoIdx) {
                    historicoArray[i] = historico;
                }
            }
        } else {
            for (int i = 0; i < historicoArray.length; i++) {
                if(historicoArray[i] == null) {
                    historicoArray[i] = historico;
                    break;
                }
            }
        }
    }

    private String montarHistorico(double valor1, double valor2, EOperacoesMatematica operacao, double resultado) {
        String historico = String.valueOf(valor1);

        switch (operacao) {
            case SOMA:
                historico += " + ";
                break;
            case SUBTRACAO:
                historico += " - ";
                break;
            case MULTIPLICACAO:
                historico += " * ";
                break;
            case DIVISAO:
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
        // 2 * 2 = 4
        // 1 + 1 = 2
        String historicoCompleto = "";
        for (String historico : historicoArray) {
            if(historico != null) {
                historicoCompleto += historico;
                historicoCompleto += "\n";
            }
        }

//        for (int i = 0; i < historicoArray.length; i++) {
//            String historico = historicoArray[i];
//            if(historico != null) {
//                historicoCompleto += historico;
//                historicoCompleto += "\n";
//            }
//        }

        return historicoCompleto;
    }
}
