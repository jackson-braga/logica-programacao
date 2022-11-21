package atividades.lista2;
/* 7. Faça um Programa que peça um número correspondente a um determinado ano e em seguida
informe se este ano é ou não bissexto. Para ser bissexto, o ano deve ser:
● Divisível por 4. Sendo assim, a divisão é exata com o resto igual a zero;
● Não pode ser divisível por 100. Com isso, a divisão não é exata, ou seja, deixa resto diferente de zero;
● Pode ser que seja divisível por 400. Caso seja divisível por 400, a divisão deve ser exata, deixando o resto igual a
zero.
* */

import java.util.Scanner;

public class Ex07AnoBissexto {
    public static void main(String[] args) {

        int ano;
        boolean isBissexto = false;

        Scanner in = new Scanner(System.in);
        ano = in.nextInt();

        if(ano%4 == 0 && !(ano%100 == 0) || ano%400 == 0) {
            isBissexto = true;
        }

        System.out.printf("O ano %d " + (isBissexto == true ? "é um ano Bissexto." : "não é um ano Bissexto."), ano);

    }
}
