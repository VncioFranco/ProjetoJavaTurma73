package vetor_matriz;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
	 int vetorInteiros[]= {2,5,1,3,4,9,7,8,10,6};
	 int numero, indice, posicao=-1;
	 Scanner read = new Scanner(System.in);
	 
	 System.out.println("Digite o numero que deseja encontrar: ");
	 numero = read.nextInt();
	 
	 for(indice = 0; indice < vetorInteiros.length; indice++) {
		 if(numero == vetorInteiros[indice]) {
			// System.out.println("o numero: "+numero+" está na posição: "+ indice);
			 
			 posicao= indice;
		 }
			 
		 }
	 
		 
		 if(posicao >= 0) {
	 System.out.println("O numero: "+numero+" Esta localizado na posição "+posicao); 
	 }else {
		 System.out.println("O numero: "+numero+" não foi encontrado");
	 }
	 }
}
	 	
	


