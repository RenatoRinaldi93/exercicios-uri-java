package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1002 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int A, B, Soma;
		
		A = teclado.nextInt();
		B = teclado.nextInt();
		
		Soma = A + B;
		
		System.out.println("SOMA = " + Soma);
		
		teclado.close();

	}

}
