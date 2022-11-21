/*Lista de Exercícios 1
Exercício 3:
Escreva um programa para ler o número total de eleitores de um município, o número de votos em branco, nulos e válidos.
Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
 */
import java.util.Scanner;
    public class Exercicio3{
           public static void main(String[] args) {
               Scanner scan = new Scanner(System.in);
            System.out.println("Informe o número total de eleitores: ");
            double eleitores = scan.nextInt();
            System.out.println("Informe o número de votos em branco: ");
            double votosEmBranco = scan.nextInt();
            System.out.println("Informe o número de votos nulos: ");
            double votosNulo = scan.nextInt();
            System.out.println("Informe o número de votos válidos: ");
            double votosValidos = scan.nextInt();
            System.out.print("A porcentagem de votos em branco é de ");
            System.out.println((votosEmBranco / eleitores) * 100);
            System.out.print("A porcentagem de votos nulo é de ");
            System.out.println((votosNulo / eleitores) * 100);
            System.out.print("A porcentagem de votos válidos é de ");
            System.out.println((votosValidos / eleitores) * 100);
        }
    }



