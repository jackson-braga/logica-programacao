/* Lista de Exercícios 2
Exercício 7:
Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não
bissexto.
Para ser bissexto, o ano deve ser:
● Divisível por 4. Sendo assim, a divisão é exata com o resto igual a zero;
● Não pode ser divisível por 100. Com isso, a divisão não é exata, ou seja, deixa resto diferente de zero;
● Pode ser que seja divisível por 400. Caso seja divisível por 400, a divisão deve ser exata, deixando o resto igual a
zero.
 */

import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o ano: ");
        int ano = scan.nextInt();

        String mensagem;
        if (ano % 4 == 0 && ano % 100 != 0 ) {
            mensagem = "O ano informado é um ano bissexto.";
        } else {
            mensagem = "O ano informado não é um ano bissexto.";
        }
        System.out.println(mensagem);

    }
}
