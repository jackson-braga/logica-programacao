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

        if (combustivelEscolhido == "A" && quantCombustivel <= 20) {
            float descontoLitro = (precoAlcool * 2) / 100;
            float precolitro = (precoAlcool - descontoLitro) * quantCombustivel;
            System.out.println("O valor total do abastecimento foi de: R$ " + new DecimalFormat(".##").format(precolitro));
        } else if (combustivelEscolhido == "A" || combustivelEscolhido == "a" && quantCombustivel > 20) {
            float descontoLitro = (precoAlcool * 5) / 100;
            float precolitro = (precoAlcool - descontoLitro) * quantCombustivel;
            System.out.println("O valor total do abastecimento foi de: R$ " + new DecimalFormat(".##").format(precolitro));
        } else if (combustivelEscolhido == "G" || combustivelEscolhido == "g" && quantCombustivel <= 20) {
            float descontoLitro = (precoGasolina * 3) / 100;
            float precolitro = (precoGasolina - descontoLitro) * quantCombustivel;
            System.out.println("O valor total do abastecimento foi de: R$ " + new DecimalFormat(".##").format(precolitro));
        } else if (combustivelEscolhido == "G" || combustivelEscolhido == "g" && quantCombustivel > 20) {
            float descontoLitro = (precoGasolina * 6) / 100;
            float precolitro = (precoGasolina - descontoLitro) * quantCombustivel;
            System.out.println("O valor total do abastecimento foi de: R$ " + new DecimalFormat(".##").format(precolitro));
        }
    }
}
