package lacos_repeticao;

import java.util.Scanner;

public class ExercicioDoWhile1 {

	public static void main(String[] args) {
		int numeros, positivos=0;
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			numeros = read.nextInt();
			if(numeros > 0) {
				positivos += numeros ;
			}
		}while (numeros !=0);
		System.out.println("A soma dos numeros positivos é: "+ positivos);
}
}
