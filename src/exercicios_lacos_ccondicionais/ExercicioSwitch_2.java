package exercicios_lacos_ccondicionais;

import java.util.Scanner;

public class ExercicioSwitch_2 {

	public static void main(String[] args) {
		int item ,quantidade;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Esolha o Seu pedido no menu abaixo: ");
		System.out.println("1 - Cachorro Quente R$ 10.00 \n"
				          +"2 - X-Salada        R$ 15.00\n"
				          +"3 - X-Bacon         R$ 18.00\n"
				          +"4 - Bauru           R$ 12.00 \n"
				          +"5 - Refrigerante    R$ 8.00\n"
				          +"6 - Suco de Laranja R$ 13.00");
		System.out.println("Qual seu o número do seu pedido:");
	    item = read.nextInt();
	    
	    if(item > 6  || item < 1) {
	    	System.out.println("Escolha uma opção valida!");
	    	System. exit(0);
	    }
	    
	    System.out.println("Qual a quantidade: ");
	    quantidade = read.nextInt();
	    
	    
	    switch(item) {
	    case 1:
	    	System.out.println("Produto: Cachorro quente \n"+"Valor total: R$"+(quantidade* 10.00));
	    	break;
	    	
	    case 2:
	    	System.out.println("Produto: X-Salada \n"+"Valor total: R$"+(quantidade* 15.00));
	    	break;
	    	
	    case 3:
	    	System.out.println("Produto: X-Bacom \n"+"Valor total: R$"+(quantidade* 18.00));
	    	break;	
	    	
	    case 4:
	    	System.out.println("Produto: Bauru \n"+"Valor total: R$"+(quantidade* 12.00));
	    	break;
	    	
	    case 5:
	    	System.out.println("Produto: Refrigerante \n"+"Valor total: R$"+(quantidade* 8.00));
	    	break;
	    	
	    case 6:
	    	System.out.println("Produto: Suco de Laranja \n"+"Valor total: R$"+(quantidade* 13.00));
	    	break;	
	    	
	    default:
	    	System.out.println("Digite uma opção valida!");
	    	break;
	    }

	}

}
