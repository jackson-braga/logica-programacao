package atividades.lista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    private static final String G = "G";
    private static final String GASOLINA = "GASOLINA";
    private static final String A = "A";
    private static final String ALCOOL = "ALCOOL";
    private static final String COMBUSTIVEL = "SELECIONE O TIPO DE COMBUSTÍVEL (G ou A): ";
    private static final String LITROS = "INSIRA A QUANTIDADE EM LITROS: ";
    private static final String RESULTADO = "O VALOR A SER PAGO, DE %s, VALE R$ %.2f";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String combustivel = getCombustivel(entrada);
        double litros = getLitros(entrada);
        System.out.printf(RESULTADO.concat("\n"), getNomeCombustivel(combustivel), calculaValor(combustivel, litros));
    }
    
    private static String getCombustivel(Scanner entrada) {
        System.out.println(COMBUSTIVEL);
        String combustivel = entrada.nextLine();
        return combustivel.toUpperCase().equals("G") || combustivel.toUpperCase().equals("A") ? 
               combustivel.toUpperCase() : getCombustivel(entrada);
    }
    
    private static double getLitros(Scanner entrada) {
        System.out.println(LITROS);
        return entrada.nextDouble();
    }
    
    private static double calculaValor(String combustivel, double litros) {
        return combustivel.equals("G") ? calculaValorGasolina(litros) :
                calculaValorAlcool(litros);
    }

    private static double calculaValorGasolina(double litros) {
        return litros > 20 ? litros * 4.79 * 0.94 : litros * 4.79 * 0.97;
    }

    private static double calculaValorAlcool(double litros) {
        return litros > 20 ? litros * 3.69 * 0.95 : litros * 3.69 * 0.98;
    }

    private static String getNomeCombustivel(String combustivel) {
        return combustivel.equals("G") ? GASOLINA : ALCOOL;
    }
}
