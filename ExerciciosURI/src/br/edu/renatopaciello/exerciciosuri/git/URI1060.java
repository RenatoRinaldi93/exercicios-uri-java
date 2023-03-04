package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1060 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double valor1 = input.nextDouble();
		double valor2 = input.nextDouble();
		double valor3 = input.nextDouble();
		double valor4 = input.nextDouble();
		double valor5 = input.nextDouble();
		double valor6 = input.nextDouble();
		
		int cont=0;
		if(valor1 > 0 && valor2 > 0 && valor3 > 0 && valor4 > 0 && valor5 > 0 && valor6 > 0) {
			cont++;
		}
		
		System.out.print(cont + " valores positivos");
		
		input.close();

	}

}
