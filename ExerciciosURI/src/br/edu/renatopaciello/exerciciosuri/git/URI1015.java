package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1015 {

	public static void main(String[] args) {
		
		
		// Depois tentar diminuir as linhas do código com math.sqrt 

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double x1 = teclado.nextDouble();
		double y1 = teclado.nextDouble();
		double x2 = teclado.nextDouble();
		double y2 = teclado.nextDouble();
		
		double calculoAnteriorX = x2 - x1;
		double calculoAnteriorY = y2 - y1;
		
		double elevadoX = Math.pow(calculoAnteriorX, 2);
		double elevadoY = Math.pow(calculoAnteriorY, 2);
		
		double distancia = Math.sqrt(elevadoX + elevadoY);
		
		System.out.printf("%.4f", distancia);
		
		teclado.close();

	}

}
