package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1143 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int inicio = 1;
		
		for(int i = 1 ; i<=x; i++) {
			
			int segundo = inicio * inicio;
			int terceiro = inicio * inicio * inicio;
			
			System.out.printf("%d %d %d%n", inicio, segundo, terceiro);
			
			inicio += 1;
		}
		
		input.close();

	}

}