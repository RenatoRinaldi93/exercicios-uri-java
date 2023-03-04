package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1132 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int X = input.nextInt(),
			Y = input.nextInt();
		
		int soma = 0;
		if (X > Y) {
			for (int i = Y; i <= X; i++) {
				if (i % 13 != 0) soma += i;
			}
		} else {
			for (int i = X; i <= Y; i++) {
				if (i % 13 != 0) soma += i;
			}
		}
		System.out.println(soma);
		
		input.close();

	}

}
