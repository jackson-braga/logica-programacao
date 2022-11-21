package lista1;

//      3. Escreva um programa para ler o número total de eleitores de um
//      município, o número de votos brancos, nulos e válidos.
//      Calcular e escrever o percentual que cada um representa em relação
//      ao total de eleitores.

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        //      Criar variáveis do numero total de eleitores, votos brancos,
        //      nulos e receber esses valores do usuário.

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o total de eleitores da cidade desejada:");
        int totalEleitores = scan.nextInt();
        System.out.println("Informe o total de votos brancos:");
        int votosBrancos = scan.nextInt();
        System.out.println("Informe o total de votos nulos:");
        int votosNulos = scan.nextInt();

        //      Calcular os votos válidos com base no total de eleitores e
        //      votos brancos e nulos.
        int totalVotosValidos = totalEleitores - votosBrancos - votosNulos;

        //      Calcular a porcentagem dos valores em relação ao total de
        //      eleitores, utilizando o cálculo da regra de três de porcentagem.
        //      Salvar as porcentagens em novas variaveis para exibição posterior.

        float porcVotosValidos = ((float)totalVotosValidos * 100) / (float)totalEleitores;
        float porcVotosBrancos = ((float)votosBrancos * 100) / (float)totalEleitores;
        float porcVotosNulos = ((float)votosNulos * 100) / (float)totalEleitores;

        //      Imprimir porcentagens.
        System.out.println("O total de votos válidos foi de " + totalVotosValidos +
                ", o que representa " + porcVotosValidos + "% do total de eleitores.");
        System.out.println("O total de votos em branco foi de " + votosBrancos +
                ", o que representa " + porcVotosBrancos + "% do total de eleitores.");
        System.out.println("O total de votos nulos foi de " + votosNulos +
                ", o que representa " + porcVotosNulos + "% do total de eleitores.");
    }
}
