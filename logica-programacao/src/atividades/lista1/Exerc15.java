package atividades.lista1;
import java.util.Scanner;

/**
 * @author CrisMoura on 15/11/2022
 */
public class Exerc15 {
    public static void main(String[] args) {
// Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar em condições, um
// dos seguintes requisitos deve ser satisfeito:
//● Ter no mínimo 65 anos de idade.
//● Ter trabalhado no mínimo 30 anos.
//● Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
// Com base nas informações acima, faça um programa que leia: o ano de seu nascimento e o ano de seu ingresso na
// empresa. O programa deverá escrever a idade e o tempo de trabalho do empregado e a mensagem 'Requerer
// aposentadoria' ou 'Não requerer'.
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu ano de nascimento.");
        int anoNasc = input.nextInt();
        System.out.println("Digite o ano que engressou  na empresa.");
        int anoEmpresa = input.nextInt();
        int idade = 2022 - anoNasc;
        int tempoTrabalho = 2022 - anoEmpresa;

        System.out.printf("Idade = %d anos.\n", idade);
        System.out.printf("Tempo de Trabalho = %d anos.\n\n", tempoTrabalho);

        if(idade >= 65 || tempoTrabalho >=30){
            System.out.println("Requerer Aposentadoria.");
        }else if (idade >= 60 && tempoTrabalho >=25){
            System.out.println("--------------Requerer Aposentadoria--------------");
        }else{
            System.out.println("***********Não requerer aposentadoria**************");
        }
    }
}
