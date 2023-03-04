package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1116 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		for(int i = 1 ; i<=N ; i++) {
			int X = input.nextInt();
			int Y = input.nextInt();
			
			if(X < Y && Y == 0) {
				System.out.println("divisão impossível");
			}
			else {
				double media = (double) X / Y;
				System.out.printf("%.1f%n", media);
			}
			
		}
		
		input.close();

	}

}
