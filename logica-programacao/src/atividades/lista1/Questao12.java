package lista1;

//      12. Ler 3 valores (A, B e C) representando as medidas dos lados de um
//      triângulo e escrever se formam ou não um triângulo.
//      OBS: para formar um triângulo, o valor de cada lado deve ser menor
//      que a soma dos outros 2 lados.

import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {

        //      Criar variáveis dos lados do triangulo e receber valores do usuario

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        double ladoA = scan.nextDouble();
        System.out.println("Informe o valor de B: ");
        double ladoB = scan.nextDouble();
        System.out.println("Informe o valor de C: ");
        double ladoC = scan.nextDouble();

        //      Calcular se os valores formam um triangulo e exibir a mensagem

        if (ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoA + ladoB)) {
            System.out.println("Os valores informados formam um triângulo.");
        } else {
            System.out.println("Os valores informados não formam um triângulo.");
        }
    }
}
