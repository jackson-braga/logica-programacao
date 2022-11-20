package atividades.lista1;
import java.util.Scanner;

public class exercicio_3 {
    //Receber o número de eleitores
    //Calcular e apresentar a porcentagem de brancos, nulos e válidos.

    public static void main(String[] args) {
        double neleitores;
        double validos;
        double bracos;
        double nulos;
        double pval;
        double pnul;
        double pbra;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de eleitores: ");
        neleitores = scanner.nextDouble();
        System.out.println("Digite o número de votos válidos: ");
        validos = scanner.nextDouble();
        System.out.println("Digite o número de votos em branco: ");
        bracos = scanner.nextDouble();
        System.out.println("Digite o número de votos nulos: ");
        nulos = scanner.nextDouble();

        pval = (validos/neleitores) * 100;
        pnul = (nulos/neleitores) * 100;
        pbra = (bracos/neleitores) * 100;

        System.out.println("O percentual de votos válidos foi: " + pval + "%");
        System.out.println("O percentual de votos nulos foi: " + pnul + "%");
        System.out.println("O percentual de votos brancos foi: " + pbra + "%");
    }
}
