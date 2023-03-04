package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1067 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		for(int i = 0 ; i<=N ; i++) {
			if(i % 2 !=0) {
				System.out.println(i);
			}
		}
		
		input.close();

	}

}
