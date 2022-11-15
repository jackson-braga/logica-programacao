package atividades.lista1;

import java.util.Scanner;

public class Exercicio_09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa retorna se pessoa poderá ou não votar neste ano com base no ano de nascimento.");
        System.out.println("Informe o ano de nascimento:");
        int anoDeNascimento = scan.nextInt();

        //Processamento de Dados
        int idadeEmAnos = 2022 - anoDeNascimento;
        String mensagem;
        if (idadeEmAnos < 16) {
            mensagem = "Não poderá votar este ano.";
        }
        else {
            mensagem = "Poderá votar este ano.";
        }

        //Saída de Dados
        System.out.println(mensagem);
    }
}
