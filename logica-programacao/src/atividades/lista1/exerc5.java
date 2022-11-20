package lista1;

import java.util.Scanner;

public class exerc5 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Qual temperatura em Fahrenheit?");
		float fahr = scan.nextFloat();
		
		float celsius = ((fahr - 32)/9) * 5;
						
		System.out.printf("A temperatura em Celsius é: %.1f°C", celsius);
		
		scan.close();	
	}
}
