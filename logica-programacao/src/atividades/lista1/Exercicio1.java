package atividades.lista1;

import java.util.Scanner;

public class Exercicio1 {
    /*Boas práticas de programação, ao invés de escrever texto direto
    *no código, para evitar edições desnecessárias, usamos atributos
    *estáticos*/
    private static final String BASE = "Insira a medida da base do retangulo ";
    private static final String ALTURA = "Insira a medida da altura do retangulo ";
    private static final String HELLO = "Calculo da área do retângulo";
    private static final String RESULTADO = "A área do retângulo vale ";

    public static void main(String[] args) {
        Scanner medida = new Scanner(System.in);
        System.out.println(HELLO);
        System.out.println(BASE);
        double base = medida.nextDouble();
        System.out.println(ALTURA);
        double altura = medida.nextDouble();

        /*O método concat(), da classe String, serve para concatenar
        *o referido atributo estático RESULTADO com qualquer outra coisa.
        *O método format(), serve para converter o produto das variáveis
        *base com altura, que ambas são double, em String para que o resultado
        *seja inserido no texto. Além disso, coloca o resultado com formato
        *de no máximo duas casas decimais.*/
        System.out.println(RESULTADO.concat(String.format("%.2f", base*altura)));
    }
}
