import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

int numeroLadoPoligono;
int tamanhoLadoPoligono;

        Scanner entrada =new Scanner(System.in);

        System.out.println("digite os Lados do Poligono");

        numeroLadoPoligono = entrada.nextInt();
        System.out.println( "digite o tamanho do lado do poligono");

      tamanhoLadoPoligono = entrada.nextInt();


        switch (numeroLadoPoligono) {
            case 3: System.out.println("TRIANGULO");
                System.out.println( "area do triangulo é " + (0.8660254037844386 * tamanhoLadoPoligono * tamanhoLadoPoligono ));
break;
            case 4:
                System.out.println("quadrado");
                System.out.println( "area do quadrado é " + (tamanhoLadoPoligono * tamanhoLadoPoligono));
                break;
            case 5:
                System.out.println("pentagono");
break;
            default:
                if ( numeroLadoPoligono < 3)
                System.out.println("Não é um polígono");

                else
                    System.out.println("poligono não identificado");


        }



    }
}