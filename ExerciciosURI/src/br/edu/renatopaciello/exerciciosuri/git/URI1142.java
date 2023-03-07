package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1142 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int X = input.nextInt();
		int inicio = 1;
		
		for(int i = 1 ; i<=X ; i++) {
			
			int segundo = inicio + 1;
			int terceiro = inicio + 2;
			System.out.printf("%d %d %d PUM %n", inicio, segundo, terceiro);
			
			inicio = inicio+4;
		}
		
		input.close();

	}

}
