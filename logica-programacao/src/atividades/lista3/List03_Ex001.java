package atividades.lista3;

import java.util.Scanner;

public class List03_Ex001 {
    public static void main(String[] args) {
        for(int numero = 1000; numero <= 2000; numero++){
            if (numero % 11 == 2)
                System.out.println(numero);
        }
    }
}
