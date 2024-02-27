package lacos_condicionais;

import java.util.Scanner;

public class Interativo {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
	int x,y;
	
	System.out.println("Digite um valor para X: ");
	x = read.nextInt();
	
	System.out.println("Digite um valor para Y: ");
	y = read.nextInt();
	
	if(x>y) {
		System.out.println("X maior que Y");
	}else if( x == y) {
		System.out.println("X é igual a Y");
	}
	else {
		System.out.println("X é menor que Y");
	}
	
	}

}
