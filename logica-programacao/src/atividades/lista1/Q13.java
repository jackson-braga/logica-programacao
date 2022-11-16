import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tipo de combustível");
        String tipo = scan.nextLine();
        System.out.println("Qual a quantidade em litros?");
        int quant = scan.nextInt();

        if (tipo == "A"){
            if(quant > 20){
                System.out.println("Valor: " + 3.69*0.95*quant );
            } else {
                System.out.println("Valor: " + 3.69*0.98*quant );
            }
        } else if (tipo== "G"){
            if(quant > 20){
                System.out.println("Valor: " + 4.79*0.94*quant );
            } else {
                System.out.println("Valor: " + 4.79*0.97*quant );
            }       
        } else {
            System.out.println("Tipo não válido.");
        }

    }
}
