package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1035 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int A, B, C, D;
		
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();
		
		if(B > C && D > A && C+D > A+B && A % 2 == 0) {
			System.out.println("Valores Aceitos");
		}
		else {
			System.out.println("Valores não aceitos");
		}
		
		input.close();

	}

}
