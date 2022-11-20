package atividades.lista2;

import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args) {
        double n1;
        double n2;
        double media;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = scanner.nextDouble();
        media = (n1 + n2)/2;

        if (media >= 9.0){
            System.out.println("Com base nas notas: " + n1 + " e " + n2 + "\nSua média foi: "+media+ "\nVocê está aprovado, com conceito A!!");
        } else if (media >= 7.5) {
            System.out.println("Com base nas notas: " + n1 + " e " + n2 + "\nSua média foi: "+media+ "\nVocê está aprovado, com conceito B!!");
        } else if (media >= 6.0) {
            System.out.println("Com base nas notas: " + n1 + " e " + n2 + "\nSua média foi: "+media+ "\nVocê está aprovado, com conceito C!!");            
        } else if (media < 6.0 && media >= 4.0) {
            System.out.println("Com base nas notas: " + n1 + " e " + n2 + "\nSua média foi: "+media+ "\nVocê está reprovado, com conceito D!!");
        }else {
            System.out.println("Com base nas notas: " + n1 + " e " + n2 + "\nSua média foi: "+media+ "\nVocê está reprovado, com conceito E!!");
        }

    }
}
