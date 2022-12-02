import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String qualLetraDoAlfabeto;
        System.out.println("Digite uma letra do ALfabeto");
        Scanner entrada = new Scanner(System.in);


        qualLetraDoAlfabeto = entrada.next();

        switch (qualLetraDoAlfabeto.getBytes()[0]) {

            case 'A':
            case 'E':
                case 'I':

            case 'O':

            case 'U':
                System.out.println(" É UMA VOGAL");
                break;

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                        System.out.println(" É UMA VOGAL");
                        break;
            default:
                

                if (qualLetraDoAlfabeto.getBytes()[0] < 'A')
                    System.out.println( "NÃO É UMA LETRA");
                else
                System.out.println( "É UMA CONSOANTE");

        }
    }
}



