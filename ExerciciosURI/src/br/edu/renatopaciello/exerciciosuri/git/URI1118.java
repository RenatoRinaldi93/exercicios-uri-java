package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1118 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int calculoNota = 1;
		
		while(calculoNota == 1) {
			double nota1 = input.nextDouble();
			
			while(nota1 < 0.0 || nota1 > 10.0) {
				System.out.println("nota inválida");
				nota1 = input.nextDouble();
			}
			
			double nota2 = input.nextDouble();
			
			while(nota2 < 0.0 || nota2 > 10.0) {
				System.out.println("nota inválida");
				nota2 = input.nextDouble();
			}
			
			double media = (nota1+nota2) / 2.0;
			
			System.out.printf("Média: %.2f%n", media);
			
			System.out.println("Novo cálculo? 1-sim / 2-não:");
			calculoNota = input.nextInt();
			
			while(calculoNota != 1 && calculoNota != 2) {
				System.out.println("Novo cálculo? 1-sim / 2-não:");
				calculoNota = input.nextInt();
			}
			
			
		}
		
		input.close();
		
	}
}

