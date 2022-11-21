/* Lista de Exercícios 2
Exercício 1:


 */
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Doar sangue é muito importante, pois pode salvar vidas!");
        System.out.println("Diga: quantos anos você tem?");
        int idade = scan.nextInt();

          String mensagem;
        if (idade >= 18 && idade <= 67) {
            mensagem = "Você está apto(a) a doar sangue. Procure uma unidade de saúde próxima e saiba mais!";
        } else {
            mensagem = "Infelizmente você não pode doar. Mas divulgue sobre a doação para amigos e familiares!";
        }

        System.out.println(mensagem);
}
}

