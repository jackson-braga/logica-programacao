package atividades.lista2;

/**
 * @author CrisMoura on 20/11/2022
 */
import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
//7. Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe
//se este ano é ou não bissexto.Para ser bissexto, o ano deve ser:
//● Divisível por 4. Sendo assim, a divisão é exata com o resto igual a zero;
//● Não pode ser divisível por 100. Com isso, a divisão não é exata, ou seja, deixa resto diferente de zero;
//● Pode ser que seja divisível por 400. Caso seja divisível por 400, a divisão deve ser exata, deixando o
//resto igual a zero.

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = input.nextInt();
        if ((ano % 4 != 0 || ano % 100 == 0) && ano % 400 != 0) {
            System.out.println("Ano NÃO Bissesto.");
        } else {
            System.out.println("Ano Bissexto.");
        }

    }
}
