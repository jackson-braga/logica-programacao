package lista2;

import java.util.Scanner;

public class Exercicio7 {
     // Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se
    // este ano é ou não bissexto. Para ser bissexto, o ano deve ser:
    // ● Divisível por 4. Sendo assim, a divisão é exata com o resto igual a zero;
    // ● Não pode ser divisível por 100. Com isso, a divisão não é exata, ou seja, deixa resto diferente de zero;
    // ● Pode ser que seja divisível por 400. Caso seja divisível por 400, a divisão deve ser exata,
    // deixando o resto igual a zero.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um ano para saber se é bissexto ou não: ");
        int ano = input.nextInt();

        if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))) {
            System.out.println("Ano: " + ano);
            System.out.println("É bissexto");
        } else {
            System.out.println("Ano: " + ano);
            System.out.println("Não é bissexto");
        }
    }
}

