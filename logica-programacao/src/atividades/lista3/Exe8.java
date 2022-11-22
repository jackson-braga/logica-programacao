package atividades.lista3;

import java.util.Scanner;

/**
 * @author CrisMoura on 20/11/2022
 */
public class Exe8 {
    public static void main(String[] args) {
//        Escreva um programa para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a média
//        (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.
//        Acrescente uma mensagem 'NOVO CÁLCULO (S/N)?' ao final. Se for respondido 'S' deve retornar e executar
//        um novo cálculo, caso contrário deverá encerrar o programa.
        double nota1 = 0;
        double nota2 = 0;
        char novoCalculo;
        Scanner input = new Scanner(System.in);

        do {
            do {
             System.out.println("Por favor digite a primeira nota");
             nota1 = input.nextDouble();
             if (nota1 <= 0 || nota1 > 10){
                 System.out.println("Valor inválido");
                 //break;
             }
            }  while (nota1 <= 0 || nota1 > 10);

            do {
             System.out.println("Por favor digite a segunda nota");
             nota2 = input.nextDouble();
             if (nota2 <= 0 || nota2 > 10){
                 System.out.println("Valor inválido");
                 //break;
             }
            }  while (nota2 <= 0 || nota2 > 10);

            double resultado = (nota1 + nota2) / 2;
            System.out.println("Sua média foi de " + resultado);
            System.out.println("NOVO CALCULO (S/N)? ");
            novoCalculo = input.next().charAt(0);
        }while (novoCalculo == 's') ;
        System.out.println("Programa Encerrado! Bye Bye!");
    }

}

