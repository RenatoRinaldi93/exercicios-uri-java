package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1071 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		int min, max;
		if(x<y) {
			min = x;
			max = y;
		}
		
		else {
			min = y;
			max = x;
		}
		
		int soma = 0;
		for(int i = min+1 ; i < max ; i++) {
			if (i%2!=0) {
				soma = soma + i;
			}
		}
		
		System.out.println(soma);
		
		input.close();

	}

}
