package exerciciojavaaula8;

import java.util.Scanner;

public class Exercico1 {

	public static void main(String[] args) {
		//variaveis
		
		int a , b;
		float divisao, soma, diferenca, multiplicacao;
		Scanner leia = new Scanner(System.in);
		 System.out.println("Digite o primeiro valor : ");
		a = leia.nextInt();
		
		System.out.println("Digite o segundo valor : ");
		b = leia.nextInt();
		
	 soma = a +b;
	 diferenca = a - b;
	 multiplicacao = a * b;
	 divisao = a / b;
	 
	 System.out.printf("Soma: " + soma +"\n" + "Diferença: "+ diferenca+ "\n" + "Multiplicação: " + multiplicacao + "\n" + "Divisão: %.3f" , divisao);
		
		

	}

}
