package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int X; // Distancia total percorrida
		float Y; // Total combustível gasto
		
		X = teclado.nextInt();
		Y = teclado.nextFloat();
		
		double consumo = X / Y;
		
		System.out.printf("%.3f km/l", consumo);
		
		teclado.close();

	}

}
