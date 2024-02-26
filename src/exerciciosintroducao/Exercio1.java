package exerciciosintroducao;

import java.util.Scanner;

public class Exercio1 {

	public static void main(String[] args) {
		float salario; 
		float abono ;
		float novoSalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salario: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Novo Salario atualizado: "+novoSalario);
		
		

	}

}
