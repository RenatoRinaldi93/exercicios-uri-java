package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1018Mod {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int N, resto, nota, quociente;
		
		N = teclado.nextInt();
		
		resto = N;
		
		System.out.println(resto);
		
		nota = 100;
		quociente = resto/nota;
		System.out.println(quociente + " nota (s) de R$100,00");
		resto = resto%nota;
		
		nota = 50;
		quociente = resto/nota;
		System.out.println(quociente + " nota (s) de R$50,00");
		resto = resto%nota;
		
		nota = 20;
		quociente = resto/nota;
		System.out.println(quociente + " nota (s) de R$20,00");
		resto = resto%nota;
		
		nota = 10;
		quociente = resto/nota;
		System.out.println(quociente + " nota (s) de R$10,00");
		resto = resto%nota;
		
		nota = 5;
		quociente = resto/nota;
		System.out.println(quociente + " nota (s) de R$5,00");
		resto = resto%nota;
		
		nota = 2;
		quociente = resto/nota;
		System.out.println(quociente + " nota (s) de R$2,00");
		resto = resto%nota;
		
		nota = 1;
		quociente = resto/nota;
		System.out.println(quociente + " nota (s) de R$1,00");
		
		teclado.close();

	}

}
