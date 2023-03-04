package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1011 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double pi = 3.14159;
		double r = teclado.nextDouble();
		
		double volume = (double) (4/3.0) * pi * Math.pow(r, 3);
		
		System.out.printf("VOLUME = %.3f", volume);
		
		
		teclado.close();

	}

}
