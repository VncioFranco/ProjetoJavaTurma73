package lacos_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		String nome;
		int contador;
		Scanner leia = new Scanner(System.in);
		for (contador = 1; contador <= 4; contador++) {

			System.out.println("Digite o um nome: ");
			nome = leia.nextLine();
			System.out.println("O " + contador + " nome é: " + nome);
		}
		
	}

}
