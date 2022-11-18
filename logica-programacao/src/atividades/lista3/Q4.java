import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int idade;
        int cont15 = 0;
        int cont30 = 0;
        int cont45 = 0;
        int cont60 = 0;
        int cont61 = 0;

        for (int i = 0; i<10; i++){
            System.out.println("Escreva as idades em sequência:");
            idade = scan.nextInt();
            if (idade <= 15){cont15++;}
            else if (idade >15 & idade <=30) {cont30++;}
            else if (idade >30 & idade <=45) {cont45++;}
            else if (idade >45 & idade <=60) {cont60++;}
            else if (idade > 61) {cont61++;}
        }

        System.out.println("Até 15 anos: " + cont15 + " pessoas e " + cont15*100 + "%.");
        System.out.println("De 16 a 30 anos: " + cont30 + " pessoas e " + cont15*100 + "%.");
        System.out.println("De 31 a 45 anos: " + cont45 + " pessoas e " + cont15*100 + "%.");
        System.out.println("De 46 a 60 anos: " + cont60 + " pessoas e " + cont15*100 + "%.");
        System.out.println("Acima de 61 anos: " + cont61 + " pessoas e " + cont15*100 + "%.");
        
    }
}
