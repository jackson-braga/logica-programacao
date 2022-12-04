import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("entre com o dividendo da operacao:");
        Scanner entrada = new Scanner(System.in);
        double dividendo = entrada.nextDouble();
        System.out.println("entre com o divisor da operacao, este nao pode ser zero:");
        double divisor;
        do {
            divisor = entrada.nextDouble();
            if (divisor == 0)
                System.out.println("VALOR INVALIDO - o divisor não pode ser zero, entre com um novo valor");
        }while (divisor == 0);
        System.out.println("o valor da divisao de "+dividendo+" por "+divisor+" eh "+ dividendo/divisor);
    }
}