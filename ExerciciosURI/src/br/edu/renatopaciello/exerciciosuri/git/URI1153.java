package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1153 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int fatorial = 1;
		
		for(int i = 1 ; i<=N ; i++) {
			fatorial*=i;
		}
		
		System.out.println(fatorial);
		
		input.close();

	}

}
