package vetor_matriz;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
	 int matriz[][]= {{1,2,3}
	                 ,{4,5,6},
	                  {7,8,9}};
	 int linha, coluna;
	 
	 for(linha = 0; linha < 3; linha++) {
		 for(coluna = 0; coluna<3; coluna++) {
			 
		 }
		 
	 }
	 System.out.println("Elementos da Diagonal Principal: "+ matriz[0][0]+" "+matriz[1][1]+" "+matriz[2][2]);
	 System.out.println("Elementos da Diagonal Secundaria: "+ matriz[0][2]+" "+matriz[1][1]+" "+matriz[2][0]);
	 
	 System.out.println("Soma dos elementos da Diagonal Principal:"+ (matriz[0][0] + matriz[1][1] + matriz[2][2]));
	 System.out.println("Soma dos elementos da Diagonal Secundaria:"+ (matriz[0][2] + matriz[1][1] + matriz[2][0]));
	 
	}

}
