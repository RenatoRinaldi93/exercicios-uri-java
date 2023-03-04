package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1079 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int X = input.nextInt();
		double nota1, nota2, nota3, media;
		
		for(int i = 1 ; i<=X ; i++) {
			nota1 = input.nextDouble();
			nota2 = input.nextDouble();
			nota3 = input.nextDouble();
			
			media = ((nota1*2.0) + (nota2*3.0) + (nota3*5.0)) / (2.0 + 3.0 + 5.0);
			
			System.out.printf("%.1f%n", media);
			
		}
		
		input.close();

	}

}
