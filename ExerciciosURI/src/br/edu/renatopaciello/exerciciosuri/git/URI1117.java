package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1117 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double nota1 = input.nextDouble();
		
		while(nota1 < 0.0 || nota1 > 10.0) {
			System.out.println("Nota inválida");
			nota1 = input.nextDouble();
		}
		
		double nota2 = input.nextDouble();
		
		while(nota2 < 0.0 || nota2 > 10.0) {
			System.out.println("Nota inválida");
			nota2 = input.nextDouble();
		}
		
		double media = (nota1 + nota2) / 2;
		
		System.out.printf("Média = %.2f", media);
		
		input.close();
				
	}

}
