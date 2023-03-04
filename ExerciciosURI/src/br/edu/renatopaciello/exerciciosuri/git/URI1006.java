package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		nota1 = teclado.nextDouble();
		nota2 = teclado.nextDouble();
		nota3 = teclado.nextDouble();
		
		media = (double) ((nota1*2) + (nota2*3) + (nota3*5))/10;
		
		System.out.printf("MÉDIA = %.1f", media);		
		
		teclado.close();

	}

}
