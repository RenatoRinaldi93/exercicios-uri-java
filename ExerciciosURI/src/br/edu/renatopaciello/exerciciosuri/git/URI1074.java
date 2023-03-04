package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1074 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		for(int i = 1 ; i<=N ; i++) {
			int X = input.nextInt();
			if(X == 0) {
				System.out.println("NULL");
			}
			
			if(X < 0 && X % 2 != 0) {
				System.out.println("ODD NEGATIVE");
			}
			else if(X > 0 && X % 2 != 0) {
				System.out.println("ODD POSITIVE");
			}
			else if(X < 0 && X % 2 == 0) {
				System.out.println("EVEN NEGATIVE");
			}
			else if(X > 0 && X % 2 == 0) {
				System.out.println("EVEN POSITIVE");
			}
		}
		
		input.close();

	}

}
