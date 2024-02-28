package lacos_repeticao;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		int num1, num2, contador;
		Scanner read = new Scanner(System.in);
		System.out.println("Digite o primeiro numero do intervalo: ");
		num1 = read.nextInt();
		System.out.println("Digite o segundo numero do intervalo: ");
		num2 = read.nextInt();
		
		if(num1 > num2) {
			System.out.println("Intervalo invalido!");
			System. exit(0);
		}
		for(contador=num1; contador < num2; contador++) {
			if(contador %3 == 0 && contador %5 == 0 ) {
				System.out.println(contador+" é multiplo de 3 e 5");
			}
		}

	}

}
