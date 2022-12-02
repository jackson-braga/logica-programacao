import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int qualSuaIdade;
        System.out.println("Digite sua idade");
        Scanner teclado = new Scanner(System.in);

        qualSuaIdade = teclado.nextInt();
        if (qualSuaIdade > 18 && qualSuaIdade < 67) {
            System.out.println( "Você pode doar sangue");}
        else
            System.out.println( "Você não pode doar sangue");

     }
}
