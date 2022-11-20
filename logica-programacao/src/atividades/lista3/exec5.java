package lista3;

import java.util.Scanner;

public class exec5 {

	public static void main (String args []){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a altura do triângulo: ");
		int h = scan.nextInt();		
		
		for (int x = 1; x <= h; x++) {
			for (int i = 0; i < x ; i++) {
				System.out.print("*");
			}
			System.out.println(" ");			
		}
				
		scan.close();	
	}
}
