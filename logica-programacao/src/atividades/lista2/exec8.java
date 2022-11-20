package lista2;

import java.util.Scanner;

public class exec8 {
	
	public static void main (String args []) {
		
		Scanner scan = new Scanner(System.in);
			
		String [] resp = new String[5];
		System.out.println("Responda as seguintes perguntas com SIM ou NÃO");
		System.out.println("Telefonou para a vítima?");
		resp[0] = scan.next().toUpperCase();					
		System.out.println("Esteve no local do crime?");
		resp[1] = scan.next().toUpperCase();		
		System.out.println("Mora perto da vítima?");
		resp[2] = scan.next().toUpperCase();		
		System.out.println("Devia para a vítima?");
		resp[3] = scan.next().toUpperCase();
		System.out.println("Já trabalhou com a vítima?");
		resp[4] = scan.next().toUpperCase();
		
		int rank = 0;
		for (int i =0; i < resp.length; i++) {
			if (resp[i].substring(0,1).equals("S")) {
				rank++;
			}
		}
		
		if (rank <= 2) {
			System.out.println("Suspeita!");
		} else if (rank <= 4){
			System.out.println("Cúmplice!");
		} else {
			System.out.println("ASSASSINO");
		}
			
		scan.close();	
	}

}
