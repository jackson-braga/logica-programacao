package atividades.lista1;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        //12. Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam ou não um triângulo.
        //OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.

        Scanner scann = new Scanner(System.in);
        System.out.println("Informe o primeiro lado do triângulo.");
        int primeiroLado = scann.nextInt();

        System.out.println("Informe o segundo lado do triângulo.");
        int segundoLado = scann.nextInt();

        System.out.println("Informe o terceiro lado do triângulo.");
        int terceiroLado =  scann.nextInt();

        boolean teste1 = false;
        boolean teste2 = false;
        boolean teste3 = false;

        if(primeiroLado <= (segundoLado+terceiroLado)){
            teste1 = true;
        }
        if(segundoLado <= (primeiroLado+terceiroLado)){
            teste2=true;
        }
        if(terceiroLado <= (primeiroLado+segundoLado)){
            teste3=true;
        }

        if(teste1 && teste2 && teste3){
            System.out.println("As medidas formam um triângulo.");
        }else{
            System.out.println("As medidas não formam um triângulo.");
        }
    }
}
