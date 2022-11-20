package lista2;

import java.util.Scanner;

public class exec1 {

	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Qual a sua idade?");
		int id = scan.nextInt();
							
		if ((18 <= id)  && (id<= 67)) {
			System.out.println("Você pode doar sangue!");
		} else {
			System.out.println("Você não pode doar sangue!");
		}		
		scan.close();	
	}	
}
