package lacos_repeticao;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {
		int idade = 1, contador = 0, contador2 = 0;
		Scanner read = new Scanner(System.in);

		while (idade > 0) {
			System.out.println("Digite uma idade: ");
			idade = read.nextInt();

			if (idade < 21 && idade > 0) {
				contador++;
			} else if (idade > 50) {
				contador2++;
			}

		}
//			

		System.out.println("Total de pessoal menores de 21 anos: " + contador);
		System.out.println("Total de pessoal maiores de 50 anos: " + contador2);

	}

}
