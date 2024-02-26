package exerciciosintroducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		float n1,n2,n3,n4,diferenca;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		n1=leia.nextFloat();
		
		System.out.println("Digite um numero: ");
		n2=leia.nextFloat();
		
		System.out.println("Digite um numero: ");
		n3=leia.nextFloat();
		
		System.out.println("Digite um numero: ");
		n4=leia.nextFloat();
		
		diferenca = (n1*n2) - (n3*n4);
		
		System.out.println("Diferença: " + diferenca);

	}

}
