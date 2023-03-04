package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1114 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int senha = input.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Inválida");
			senha = input.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		input.close();

	}

}
