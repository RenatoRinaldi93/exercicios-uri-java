package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1154 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int idade = input.nextInt(),
			totalIdade = 0,
			contIdade = 0;
		
		
		while(idade > 0) {
			
			if(idade > 0) {
				totalIdade += idade;
				contIdade += 1;	
			}
			
			idade = input.nextInt();
			
		}
		
		double mediaIdade = (double) totalIdade / contIdade;
			
		System.out.printf("%.2f", mediaIdade);
		
		input.close();

	}

}
