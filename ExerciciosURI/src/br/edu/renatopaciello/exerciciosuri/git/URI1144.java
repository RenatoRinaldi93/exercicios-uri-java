package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1144 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		for (int i=1; i<=x; i++) {
			
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", i, segundo, terceiro);
			System.out.printf("%d %d %d%n", i, segundo + 1, terceiro + 1);
		}
		
		input.close();
	}

}
