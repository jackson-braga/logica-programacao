package lista3;

public class exec1 {

	public static void main (String args []) {
		
		System.out.println("Verificação dos números entre 1000 e 2000");
		System.out.println("que quando divididos por 11 obtém-se resto igual a 2");
		
		for (int i = 1000; i <= 2000;i++) {
			float rest = i % 11;
			if (rest == 2) {
				System.out.print(" " + i);
			}			
		}
		
	}		
}
