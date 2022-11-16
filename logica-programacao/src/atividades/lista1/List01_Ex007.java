import java.text.DecimalFormat;
import java.util.Scanner;

public class List01_Ex007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float precoMaca = 0;
        System.out.println("Quantas maçãs foram compradas? ");
        float quantMacas = scan.nextFloat();

        if (quantMacas <= 11 ) {
            precoMaca = 1.30f;
        } else if (quantMacas >= 12) {
            precoMaca = 1.00f;
        } else {
            System.out.println("Quantidade não pode ser negativa");
        }
        float calculoCompra = precoMaca * quantMacas;
        System.out.println("Preço da Maçã: " + new DecimalFormat(".##").format(precoMaca));
        System.out.println("O valor total da sua compra foi de: R$ " + new DecimalFormat(".##").format(calculoCompra));
    }
}
