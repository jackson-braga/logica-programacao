package atividades.lista3;

import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do triângulo: ");
        int entrada = scanner.nextInt();

        String ast = "*";

        //Asteriscos
        for(int j=1; j<=entrada; j++){
            System.out.println(ast);
            ast = ast + "*";
        }

    }
}

