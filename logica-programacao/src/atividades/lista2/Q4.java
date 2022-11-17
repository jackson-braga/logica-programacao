import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanho do ângulo 1?");
        double ang1 = scan.nextDouble();
        System.out.println("Qual o tamanho do ângulo 2?");
        double ang2 = scan.nextDouble();
        System.out.println("Qual o tamanho do ângulo 3?");
        double ang3 = scan.nextDouble();

        if (ang1==90.0 || ang2==90.0 || ang3==90.0){
            System.out.println("Triângulo Retângulo.");
        }
        else if (ang1>90.0 || ang2>90.0 || ang3>90.0)) {
            System.out.println("Triângulo Obtusângulo.");
        }
        else {
            System.out.println("Triângulo Acutângulo.");
            }
        }


    }
