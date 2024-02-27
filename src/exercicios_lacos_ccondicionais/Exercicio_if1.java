package exercicios_lacos_ccondicionais;

import java.util.Scanner;

public class Exercicio_if1 {

	public static void main(String[] args) {
		int a, b ,c , soma;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um valor para A: ");
		a = read.nextInt();
		
		System.out.println("Digite um valor para B: ");
		b = read.nextInt();
		
		System.out.println("Digite um valor para C: ");
		c = read.nextInt();
		
		read.close();
		
		soma = a+b;
		if(soma > c) {
			System.out.println("A soma de A + B é maior que C");
		}else if(soma == c) {
			System.out.println("A soma de A + B é igual a C");
			
		}else {
			System.out.println("A soma de A + B é menor do que C");
		}

	}

}
