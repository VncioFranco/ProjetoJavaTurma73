package metodos_Exemplo;

public class ExemploMetodo01 {

	public static void main(String[] args) {
		int resultado = somar(2,1);
		System.out.println(resultado);	
		mensagem();
		saudacao("Ola bom dia");
		saudacao("saaaalve");
		
	}

	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void mensagem() {
		System.out.println("Olá , Turma 73!");
	}
	
	public static void saudacao(String mensagem) {
		System.out.println(mensagem);
	}

}
