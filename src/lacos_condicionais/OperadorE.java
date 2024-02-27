package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
//		int idade;
//		boolean carteiraM;
//		
//		System.out.println("Digite sua idade");
//		idade= read.nextInt();
//		
//		System.out.println("Tem Habilitação? (true/false)");
//		carteiraM = read.nextBoolean();
//		
//		if(idade >=18 && carteiraM){
//			System.out.println("Pode dirigir!");
//		}else {
//			System.out.println("Não pode dirigir!");
//			
//		}
		
		
		//------Exemplo 2------
		
		float nota1,nota2 , media;
		
		System.out.println("Digite a primeira nota: ");
		nota1= read.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2= read.nextFloat();
		
		media= (nota1+nota2) /2 ;

		
		if(media >=6) {
			System.out.println("media "+ media+", Aluno Aprovado");
			
		}else if(media >=5) {
			System.out.println("media "+ media+ ", Aluno em Recuperação ");
		}else{
			System.out.println("media "+ media+", Aluno reprovado!");
			}
	}

}
