package exercicios_lacos_ccondicionais;

import java.util.Scanner;

public class Exercicio_switch_calculadora {

	public static void main(String[] args) {
		float numero1, numero2;
		int menu;
		Scanner read = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		numero1 = read.nextFloat();
		
		System.out.println("Digite o Segundo numero: ");
		numero2 = read.nextFloat();
		
		System.out.println("Escolha uma das opções: ");
		System.out.println("1 - Soma \n" + "2 - Subtração \n" + "3 - Multiplicação \n" + "4 - Divisão");
		menu = read.nextInt();
		switch(menu) {
		case 1:
		   System.out.println(numero1+" + "+numero2+" = " + (numero1+numero2));
		   break;
		case 2:
			System.out.println(numero1+" - "+numero2+" = " + (numero1-numero2));
			break;
		
		case 3:
			System.out.println(numero1+" x "+numero2+" = " + (numero1*numero2));
			break;
			
		case 4:
			System.out.println(numero1+" ÷ "+numero2+" = " + (numero1/numero2));
			break;
			
			default:
				System.out.print("Selecione uma opção valida!");
				break;
		}
		
		

	}

}
