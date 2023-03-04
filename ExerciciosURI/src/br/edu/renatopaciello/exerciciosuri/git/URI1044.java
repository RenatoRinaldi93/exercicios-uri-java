package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1044 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("São Múltiplos");
		}
		else {
			System.out.println("Não São Múltiplos");
		}
		
		input.close();

	}

}
