/*Lista de Exercícios 2
Exercício 5:
Faça um programa que verifique se uma letra digitada é vogal ou consoante.
 */
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe uma letra: ");
        String letra =  (scan.next()).toLowerCase();

        String mensagem;
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            mensagem = "A letra informada é uma vogal";
        } else {
            mensagem = "A letra informada é uma consoante";
        }
                System.out.println(mensagem);
    }
}
