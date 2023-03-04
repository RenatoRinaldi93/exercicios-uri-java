package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1018 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int tempoViagem, velocidadeMedia;
		double litrosGasolina;
		
		tempoViagem = teclado.nextInt();
		velocidadeMedia = teclado.nextInt();
		
		int distancia = tempoViagem*velocidadeMedia;
		
		litrosGasolina = (double) distancia/12;
		
		System.out.printf("%.3f", litrosGasolina);
		
		
		teclado.close();

	}

}
