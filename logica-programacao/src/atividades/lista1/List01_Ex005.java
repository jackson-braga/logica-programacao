import java.util.Scanner;

public class List01_Ex005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a temperatura em graus Fahrenheit (ºF): ");
        float fahrenheit = scan.nextFloat();
        float celsius = ((fahrenheit - 32) / 9) * 5;
        System.out.println("Graus Fahrenheit (ºF): " + fahrenheit);
        System.out.println("Graus Celsius (ºC): " + celsius);
    }
}
