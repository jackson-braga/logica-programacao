import java.util.Scanner;

public class List01_Ex001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é a base do triângulo em cm²: ");
        float base = scan.nextFloat();
        System.out.println("Qual é a altura do triângulo em cm²: ");
        float altura = scan.nextFloat();
        float areaTriangulo = (base * altura) / 2;
        System.out.println("A área do triângulo é de: " + areaTriangulo + " cm²");
    }
}
