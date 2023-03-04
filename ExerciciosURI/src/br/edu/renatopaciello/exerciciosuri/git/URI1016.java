package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1016 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int n, resultado;
		
		n = teclado.nextInt();
		
		resultado = 2*n;
		
		System.out.println(resultado + " minutos");
		
		teclado.close();

	}

}
