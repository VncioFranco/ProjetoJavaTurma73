package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
		// Criando arrayçist
		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner read = new Scanner(System.in);
		Double numero;
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);
		
		System.out.println("\nNotas cadastradas: " + notas);
		System.out.println("Digite o numero que voce deseja procurar: ");
		numero = read.nextDouble();
		System.out.println("A posição da nota é "+notas.indexOf(numero));
		
	}

}
