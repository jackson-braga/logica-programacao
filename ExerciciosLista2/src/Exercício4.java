/*Lista de Exercícios 2
Exercício 4:
Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou
Obtusângulo. Sendo que:
● Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
● Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
● Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)
 */
import java.util.Scanner;
public class Exercício4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro ângulo: ");
        int angulo1 = scan.nextInt();
        System.out.println("Informe o valor do segundo ângulo: ");
        int angulo2 = scan.nextInt();
        System.out.println("Informe o valor do terceiro ângulo: ");
        int angulo3 = scan.nextInt();

            String mensagem="";
        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            mensagem = "Este é um triângulo retângulo.";
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            mensagem = "Este é um triângulo obtusângulo.";
        } else {
            mensagem = "Este é um triângulo acutângulo.";
        }
        System.out.println(mensagem);
    }
}
