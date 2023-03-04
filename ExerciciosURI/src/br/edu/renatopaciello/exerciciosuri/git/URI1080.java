package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1080 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int maior = Integer.MIN_VALUE;
		int posicao = 0;
				
		for(int i = 1 ; i<=10 ; i++) {
			int N = input.nextInt();
			
			if(N > maior) {
				maior = N;
				posicao = i;
			}
		}
		
		System.out.printf("Maior: %d%n", maior);
		System.out.printf("Posição: %d", posicao);
		
		input.close();

	}

}
