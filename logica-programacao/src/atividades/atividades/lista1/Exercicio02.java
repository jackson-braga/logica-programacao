package atividades.lista1;
import java.util.Calendar;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendar dataAtual = Calendar.getInstance();
        int ano = 0, mes = 0, dia = 0;
            System.out.println("Digite Data de Nascimento:");
            System.out.println("Ano:");
            ano = scan.nextInt();
            while (ano<=0){
                System.out.println("Ano Inválido:");
                System.out.println("Digite seu ano de nascimento:");
                ano = scan.nextInt();
            }
            System.out.println("Mes:");
            mes = scan.nextInt();
            while (mes<=0){
            System.out.println("Mês Inválido:");
            System.out.println("Digite seu mês de nascimento:");
            ano = scan.nextInt();
            }
            System.out.println("Dia:");
            dia = scan.nextInt();
            while (dia<=0){
            System.out.println("Dia Inválido:");
            System.out.println("Digite seu dia de nascimento:");
            ano = scan.nextInt();
            }

        int anoAtual = dataAtual.get(Calendar.YEAR);
        //System.out.println("Idade em Ano:" +anoAtual);
        int mesAtual = dataAtual.get(Calendar.MONTH);
        //System.out.println("Idade em Mes:" +mesAtual);
        int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
        //System.out.println("Idade em Dia:" +diaAtual);

        int mesTotal = 0, anoTotal = 0, diaTotal = 0;

        if(mesAtual<mes){
            mesTotal = (((mes-mesAtual)-12)*-1);
            anoTotal = (anoAtual - 1)- ano;
        }else if (mesAtual>=mes) {
            mesTotal = (mesAtual +1) - mes;
            anoTotal= anoAtual - ano;
         }
        if (diaAtual<dia){
            diaTotal = (diaAtual-dia)*-1;
        } else if(diaAtual>=dia){
            diaTotal = (diaAtual-dia);
        }
        int total = ((anoTotal*365)+(mesTotal*30)+(diaTotal));
        System.out.println("Idade em dias:" +total);
    }
}