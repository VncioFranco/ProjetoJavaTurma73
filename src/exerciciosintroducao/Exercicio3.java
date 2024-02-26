package exerciciosintroducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		float salarioBruto, adicionalNoturno, horasExtras, descontos ,salarioLiquido;
		String colaborador;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do colaborador: ");
		colaborador = leia.next();
		
		
		System.out.print("Digite o Salario Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("Digite o Adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("Digite as Horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.print("Digite os Descontos: ");
		descontos = leia.nextFloat();
		
		leia.close();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		
		System.out.println("O salário liquido do colaborador " +colaborador+" é "+salarioLiquido);

	}

}
