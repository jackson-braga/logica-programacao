import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double nota1 = -1.0;
        double nota2 = -1.0;
        String conceito = "";
        double media;

        while (nota1<0 || nota1>10 || nota2<0 || nota2>10) {
            System.out.println("Digite notas válidas");
            System.out.println("Primeira nota:");
            nota1 = scan.nextDouble();
            System.out.println("Segunda nota:");
            nota2 = scan.nextDouble();
        }

        media = (nota1 + nota2)/2;

        if (media >= 9.0) {
            conceito = "A";
        } else if (media >= 7.5 & media <9.0) {
            conceito = "B";
        } else if (media >= 6.0 & media <7.5) {
            conceito = "C";
        } else if (media >= 4.0 & media <6.0) {
            conceito = "D";
        } else if (media < 4.0) {
            conceito = "E";
        }

        System.out.println("Nota 1: " + nota1 + "\nNota2: " + nota2 + "\nMédia: " + media + "\nConceito: " + conceito);

        if (conceito == "A" || conceito == "B" || conceito == "C" ){
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado");
        }

    }
}
