import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int idade_Ate_15_anos = 0;
        int idade_De_16_a_30_anos = 0;
        int idade_De_31_a_45_anos = 0;
        int idade_De_46_a_60_anos = 0;
        int idade_Acima_de_61_anos = 0;

        for (int faixaEtariaUsuario = 1; faixaEtariaUsuario <= 10; faixaEtariaUsuario++) {
            System.out.println("Digite a sua idade do usuario " + faixaEtariaUsuario);

            Scanner entrada = new Scanner(System.in);

            int idade = entrada.nextInt();

            if (idade <= 15) idade_Ate_15_anos++;
            else if (idade >= 16 && idade <= 30) idade_De_16_a_30_anos++;
            else if (idade >= 31 && idade <= 45) idade_De_31_a_45_anos++;
            else if (idade >= 46 && idade <= 60) idade_De_46_a_60_anos++;
            else if (idade >= 61) idade_Acima_de_61_anos++;
        }
        System.out.println("Faixa Etaria ate 15 Anos, total: " +idade_Ate_15_anos+", "+(float)idade_Ate_15_anos*10+"%");
        System.out.println("Faixa Etaria De 16 a 30 anos, total: " +idade_De_16_a_30_anos+", "+(float)idade_De_16_a_30_anos*10+"%");
        System.out.println("Faixa Etaria De 31 a 45 anos, total: " +idade_De_31_a_45_anos+", "+(float)idade_De_31_a_45_anos*10+"%");
        System.out.println("Faixa Etaria De 46 a 60 anos, total: " +idade_De_46_a_60_anos+", "+(float)idade_De_46_a_60_anos*10+"%");
        System.out.println("Faixa Etaria Acima de 61 anos, total: " +idade_Acima_de_61_anos+", "+(float)idade_Acima_de_61_anos*10+"%");
    }
}