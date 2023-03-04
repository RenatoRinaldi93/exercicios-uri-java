package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1159 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		while(x != 0) {
			
			// se for ímpar, some mais 1
			if(x % 2 != 0) {
				x = x + 1;
			}
			
			// expressão simplificado: 5 * x + 20
			int soma = x + x + 2 + x + 4 + x + 6 + x + 8;
			System.out.println(soma);
			
			
			x = input.nextInt();
			
		}
		
		input.close();

	}

}
