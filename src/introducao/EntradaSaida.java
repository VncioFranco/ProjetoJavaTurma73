package introducao;
import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		String nome;
		int idade;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu nome: " );
		nome = leia.next();
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Seu nome é " +nome+ " e tem "+idade+ " anos");

	}

}
