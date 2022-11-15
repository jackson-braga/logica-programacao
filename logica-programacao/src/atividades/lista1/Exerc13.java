package atividades.lista1;
import java.util.Scanner;

/**
 * @author CrisMoura on 14/11/2022
 */
public class Exerc13 {
    public static void main(String[] args) {
//   Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//   Escreva um programa que leia o número de litros vendidos e o tipo de combustível(codificado da seguinte forma: A-álcool, G-gasolina),
//   calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 4,79 e o preço do litro do álcool é R$ 3,69.
//                            até 20 litros, desconto de 2% por litro
//                Álcool      acima de 20 litros, desconto de 5% por litro
//
//                Gasolina    até 20 litros, desconto de 3% por litro
//                            acima de 20 litros, desconto de 6% por litro

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual tipo de combustivel deseja:\n G - gasolina.\n A - álcool. \n");
        char combustivel = leitor.next().toUpperCase().charAt(0);
        System.out.println("Quantos litros deseja");
        int qtdlitros = leitor.nextInt();

        float gasolina = 4.79f;
        float gasolina1 = qtdlitros * gasolina;
        float des1Gasolina = gasolina - (gasolina * 3 / 100);
        float des2Gasolina = gasolina - (gasolina * 6 / 100) ;

        float alcool = 3.69f;
        float alcool1 = qtdlitros * alcool;
        float des1Alcool = alcool - (alcool * 2 / 100);
        float des2Alcool = alcool - (alcool * 5 / 100);
        float calculo = 0;

        if(combustivel == 'G' && qtdlitros <= 20 ){
            calculo =  qtdlitros * des1Gasolina;

        }else if(combustivel == 'G' && qtdlitros > 20 ){
            calculo= qtdlitros * des2Gasolina;
        }

        if(combustivel == 'A' && qtdlitros <= 20 ){
            calculo =  qtdlitros * des1Alcool;

        }else if(combustivel == 'A' && qtdlitros > 20 ){
            calculo= qtdlitros * des2Alcool;
        }

        System.out.printf("O valor a ser pago: R$ %.2f \n", calculo);

    }
}
