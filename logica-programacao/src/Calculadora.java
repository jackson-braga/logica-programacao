import java.util.Scanner;

public class Calculadora {

    private String[] historicoArray = new String[8];

    public double calcular(double valor1, double valor2, int operacao) {

        // public: todos podem ver
        // private: somente a classe consegue visualizar
        // protect: a classe e os filhos podem visualizar
        // static é um método que pode ser acessado sem precisar que o objeto seja instanciado
        // void não tem retorno

        double resultado = 0;

        switch (operacao) {

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

        for (int i = 0; i < historicoArray.length; i++) {
            if(historicoArray[i] == null) {
                historicoArray[i] = historico;
                break;
            }
        }
    }
