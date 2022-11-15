package atividades.lista1;

/**
 * @author CrisMoura on 14/11/2022
 */
public class Exerc6 {
    public static void main(String[] args) {
//        Faça um programa que leia três notas de um aluno, calcule e escreva a média final deste aluno. Considere que a média é
//        ponderada e que o peso das notas é 2, 3 e 5.
//        Fórmula para o cálculo da média final é:
//        𝑀𝐸𝐷𝐼𝐴𝐹𝐼𝑁𝐴𝐿 =
//                (((𝑁1 ×2)+(𝑁2 ×3) + (𝑁3 ×5))/(2+3+5))
        double nota1 = 2;
        double nota2 = 3;
        double nota3 = 5;

        double mediaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2+3+5);
        System.out.println(" Média Final =  " + mediaFinal);

    }
}
