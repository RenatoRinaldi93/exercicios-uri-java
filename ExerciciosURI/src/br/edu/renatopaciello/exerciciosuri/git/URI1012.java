package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double pi = 3.14159;
		
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		
		double triangulo = (double) (a*c)/2;
		double circulo = (double) pi * Math.pow(c, 2);
		double trapezio = (double) ((a+b) * c) / 2;
		double quadrado = (double) b*b;
		double retangulo = (double) a*b;
		
		System.out.printf("%.3f%n", triangulo);
		System.out.printf("%.3f%n", circulo);
		System.out.printf("%.3f%n", trapezio);
		System.out.printf("%.3f%n", quadrado);
		System.out.printf("%.3f%n", retangulo);
		
		teclado.close();
		

	}

}
