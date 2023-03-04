package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1019 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int dias, resto, diasReferencia, quociente;
		
		dias = teclado.nextInt();
		
		resto = dias;
		
		System.out.println(resto);
		
		diasReferencia = 365;
		quociente = resto/diasReferencia;
		System.out.println(quociente + " ano(s)");
		resto = resto%diasReferencia;
		
		diasReferencia = 30;
		quociente = resto/diasReferencia;
		System.out.println(quociente + " mes(es)");
		resto = resto%diasReferencia;
		
		diasReferencia = 1;
		quociente = resto/diasReferencia;
		System.out.println(quociente + " dia(s)");

		teclado.close();

	}

}
