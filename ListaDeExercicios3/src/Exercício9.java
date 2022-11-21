/*Lista de Exercício 3
Exercício 9:
Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Poderá ser aceito somente valores
maiores que 0 para N. Caso o valor informado (para N) não seja maior que 0, imprima “VALOR INVÁLIDO” e solicite para ler
o valor de N novamente
 */

import java.util.Scanner;
public class Exercício9 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int valorEntrada;
        int contador = 0;
        do {
            System.out.println("Valor de Entrada: ");
            valorEntrada = scann.nextInt();
            if (valorEntrada <= 0) {
                System.out.println("VALOR INVÁLIDO");
            } else {
                for (int i = 1; i <= valorEntrada; i++) {
                    System.out.println(i);
                }
                ++contador;
            }
        } while (contador < 1);
    }
}
