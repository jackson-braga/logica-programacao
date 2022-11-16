import java.text.DecimalFormat;
import java.util.Scanner;

public class List01_Ex010 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é o salário: ");
        float salario = scan.nextFloat();
        System.out.println("Quantas horas foram trabalhadas no mês");
        float horasTrabalhadas = scan.nextFloat();

        float horaSalario = salario / 160;
        float horasExtras = 0;
        float calculoFinal = 0;
        float calculoHorasExtras = 0;

        if(horasTrabalhadas <= 160) {
            horaSalario = horaSalario * horasTrabalhadas;
            calculoFinal = horaSalario;
        } else {
            float calcHoraExtra = ((horaSalario * 50) / 100);
            horasExtras = horasTrabalhadas - 160;
            calculoHorasExtras = (calcHoraExtra * horasExtras) + (horaSalario * horasExtras);
            calculoFinal = (calculoHorasExtras + salario);
        }
        System.out.println("Salário do Funcionário: R$ " + new DecimalFormat(".##").format(salario));
        System.out.println("Salário por hora: R$ " + new DecimalFormat(".##").format(horaSalario));
        System.out.println("Quantidade de horas trabalhadas: " + new DecimalFormat("").format(horasTrabalhadas));
        System.out.println("Horas Extras adicionais: " + new DecimalFormat("").format(horasExtras));
        System.out.println("Valor adicional: R$ " + new DecimalFormat(".##").format(calculoHorasExtras));
        System.out.println("Salário total do funcionário: R$ " + new DecimalFormat(".##").format(calculoFinal));
    }
}
