package atividades.lista1;

import java.util.Scanner;

public class exercicio_10 {
    //Calcular o salário total considerando as horas extras.
    public static void main(String[] args) {
        double horas;
        double vHora;
        double sTotal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de horas que você trabalhou: ");
        horas = scanner.nextDouble();
        System.out.println("Digite o quanto você recebe por hora trabalhada: ");
        vHora = scanner.nextDouble();
        if (horas<=160){
            sTotal = (160*vHora);
        }else {
            sTotal = (160*vHora) + ((horas-160)*vHora*1.5);
        }

        System.out.println("O salário totas do mês é: " + sTotal + " reais.");
    }
}
