package exercicios_lacos_ccondicionais;

import java.util.Scanner;

public class Exercicio_if2 {

	public static void main(String[] args) {
		int numero;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = read.nextInt();
		
		if( numero %2==0 &&  numero > 0 ) {
			System.out.println(numero + " é par e positivo!!");
		}else if(numero %2==0 &&  numero < 0 ) {
			System.out.println(numero + " é par e negativo!!");
		}else if( numero %2 != 0 &&  numero > 0 ) {
			System.out.println(numero + " é impar e positivo!!");
		}else{
			System.out.println(numero + " é impar e negativo!!");
		};

	}

}
