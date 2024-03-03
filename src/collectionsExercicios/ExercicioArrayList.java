package collectionsExercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioArrayList {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String aux;
		
		for(int i= 0; i <=4; i++ ) {
			System.out.println("Digite uma cor: ");
		aux = read.nextLine();
		cores.add(aux);
			
		}
		System.out.println("Cores: "+cores);
		
			cores.sort(null);
		
		
		System.out.println("Cores ordenadas: " + cores);

	}

}
