package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String dogs[] = new String[3];
		int index;

		for (index = 0; index < 3; index++) {
			// sysout ctrl + space
			System.out.println("Digite o " + (index + 1) + "º nome:");
			dogs[index] = read.nextLine();
		}

		for (index = 0; index < dogs.length; index++) {
			System.out.println("cachorro[" + (index) + "]" + dogs[index]);
			
		}
		System.out.println("Quantidade: " + dogs.length);

	}

}
