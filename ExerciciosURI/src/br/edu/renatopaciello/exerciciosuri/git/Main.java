package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		// Cálculo área do círculo
		
		double A, n, R;
		
		n = 3.14159;
		R = teclado.nextDouble();
		
		A = n* Math.pow(R, 2);
		
		System.out.printf("Área = %.4f", A);
		
		
		teclado.close();

	}

}
