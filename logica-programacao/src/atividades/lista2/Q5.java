import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        List<String> vogais = List.of(new String[]{"a", "e", "i", "o", "u"});
        List<String> consoantes = List.of(new String[]{"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "x", "y", "w", "z"});

        System.out.println("Digite uma letra:");
        String letra = scan.nextLine();

        letra = letra.toLowerCase(Locale.ROOT);

        if (vogais.contains(letra)) {
            System.out.println("É Vogal.");
        } else if (consoantes.contains(letra)) {
            System.out.println("É Consoante.");
        }


    }
}
