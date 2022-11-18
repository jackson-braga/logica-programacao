public class Calculadora {
    public double calcular(double valor1, double valor2, int indexOp) {


        double resultado = 0;

        switch (indexOp) {
            case 1:
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
}
