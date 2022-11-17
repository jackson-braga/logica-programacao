package atividades.lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class List01_Ex013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float precoAlcool = 3.69f;
        float precoGasolina = 4.79f;
        System.out.println("Qual o combustível que será abastecido? \n A - Alcool \n G - Gasolina \n Digite a letra: ");
        String combustivelEscolhido = scan.nextLine();
        System.out.println("Quantos litros foram abastecidos: ");
        float quantCombustivel = scan.nextFloat();
        float precolitro = 0;
        combustivelEscolhido = combustivelEscolhido.toUpperCase();

        if (combustivelEscolhido.equals("A") && quantCombustivel <= 20) {
            float descontoLitro = (precoAlcool * 2) / 100;
            precolitro = (precoAlcool - descontoLitro) * quantCombustivel;
        } else if (combustivelEscolhido.equals("A") && quantCombustivel > 20) {
            float descontoLitro = (precoAlcool * 5) / 100;
            precolitro = (precoAlcool - descontoLitro) * quantCombustivel;
        } else if (combustivelEscolhido.equals("G") && quantCombustivel <= 20) {
            float descontoLitro = (precoGasolina * 3) / 100;
            precolitro = (precoGasolina - descontoLitro) * quantCombustivel;
        } else if (combustivelEscolhido.equals("G")&& quantCombustivel > 20) {
            float descontoLitro = (precoGasolina * 6) / 100;
            precolitro = (precoGasolina - descontoLitro) * quantCombustivel;
        }

        System.out.println("O valor total do abastecimento foi de: R$ " + new DecimalFormat(".##").format(precolitro));
    }
}
