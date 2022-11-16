import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double desconto = 0.0;

        System.out.println("Qual o nome?");
        String nome = scan.nextLine();
        System.out.println("Qual a quantidade adquirida?");
        int quant = scan.nextInt();
        System.out.println("Qual o preço unitrio?");
        double preco = scan.nextDouble();

        System.out.println("Preço total do produto " + nome + ": "  + quant*preco);

        if (quant <= 5){
            desconto = 0.02;
        } else if (quant > 5 & quant <=10){
            desconto = 0.03;
        } else {
            desconto = 0.05;
        }

        System.out.println("Desconto: " + desconto*preco*quant);
        System.out.println("Total a pagar: " +  (1 - desconto)*preco*quant);

    }
}
