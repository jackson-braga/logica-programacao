import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanho do lado 1?");
        double lado1 = scan.nextDouble();
        System.out.println("Qual o tamanho do lado 2?");
        double lado2 = scan.nextDouble();
        System.out.println("Qual o tamanho do lado 3?");
        double lado3 = scan.nextDouble();

        if (lado1 == lado2 & lado3 == lado2){
            System.out.println("Triângulo Equilátero.");
        }
        else if ((lado1==lado2 & lado2 != lado3) || (lado1==lado3 & lado1 != lado2) || (lado2==lado3 & lado2 != lado1)) {
            System.out.println("Triângulo Isóceles.");
        }
        else {
            System.out.println("Triângulo Escaleno.");
            }
        }


    }
