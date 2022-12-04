import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char opcao = 'S';
        do {
            double nota1A = 0;
            double nota2A = 0;
            System.out.println("Digite a nota da primeira avaliacao do aluno (obs.: deve ser de 0 a 10):");
            Scanner entrada = new Scanner(System.in);
            do{
                nota1A = entrada.nextDouble();
                if(nota1A > 10 || nota1A < 0) System.out.println("nota fora do intervalo valido, digite outra nota");
            }while (nota1A > 10 || nota1A < 0);
            System.out.println("Digite a nota da segunda avaliacao do aluno (obs.: deve ser de 0 a 10):");
            do{
                nota2A = entrada.nextDouble();
                if(nota2A > 10 || nota2A < 0) System.out.println("nota fora do intervalo valido, digite outra nota");
            }while (nota2A > 10 || nota2A < 0);
            System.out.println("a media do anluno eh "+ (nota1A+nota2A)/2);
            System.out.println("NOVO CÁLCULO (S/N)?");
            opcao = entrada.next().charAt(0);
        }while(opcao == 's' || opcao == 'S');
    }
}