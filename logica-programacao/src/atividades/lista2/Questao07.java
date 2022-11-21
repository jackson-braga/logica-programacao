package lista2;

import java.util.Scanner;

//      Faça um Programa que peça um número correspondente a um
//      determinado ano e em seguida informe se este ano é ou não
//      bissexto.
//      Para ser bissexto, o ano deve ser:
//          ● Divisível por 4. Sendo assim, a divisão é exata com o
//              resto igual a zero;
//          ● Não pode ser divisível por 100. Com isso, a divisão
//              não é exata, ou seja, deixa resto diferente de zero;
//          ● Pode ser que seja divisível por 400. Caso seja divisível
//              por 400, a divisão deve ser exata, deixando o resto igual a zero.
public class Questao07 {

    public static void main(String[] args) {
        // Criar variável para receber o ano do usuário

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o ano: ");
        int ano = scan.nextInt();

        // Calcular e exibir se o ano é bissexto

        if (ano % 4 == 0 || (ano % 400 == 0 && ano % 100 != 0)) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " NÃO eé bissexto.");
        }
    }
}
