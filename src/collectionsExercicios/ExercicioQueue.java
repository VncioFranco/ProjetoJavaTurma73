package collectionsExercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioQueue {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Scanner nome = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int op=-1;
		while(op != 0) {

		System.out.println("*********************************************\n");
		System.out.println("1 - Adicionar Cliente na Fila");
		System.out.println("2 - Listar Clientes na Fila");
		System.out.println("3 - Retirar Cliete da Fila");
		System.out.println("0 - Sair");
		System.out.println("\n*********************************************\n");
		System.out.println("Entre com a opção desejada: ");
		op = read.nextInt();

		switch (op) {

		case 1:
			System.out.println("Digite o nome: ");
			String aux = nome.nextLine();
			fila.add(aux);

			
			
			
			break;

		case 2:
			System.out.println("Fila:  " + fila);
			break;

		case 3:

			if (fila.isEmpty()== true) {
				System.out.println("Fila vazia!");
			}
			fila.poll();
			System.out.println("Fila: " + fila);
			System.out.println("o cliente foi chamado!");
			
			break;

		default: 
			System.out.println("Programa finalizado!!");
			break;

		}

	}
	}

}
