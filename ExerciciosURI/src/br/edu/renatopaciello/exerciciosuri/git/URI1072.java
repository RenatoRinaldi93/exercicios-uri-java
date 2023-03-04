package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1072 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		int nums10e20 = 0;
		int numsNegativo10e20 = 0;
		for(int i = 1 ; i<=N ; i++) {
			int X = input.nextInt();
			if(X >= 10 && X <= 20) {
				nums10e20 ++;
			}
			else {
				numsNegativo10e20 ++;
			}
		}
		
		System.out.println(nums10e20 + " in");
		System.out.println(numsNegativo10e20 + " out");
		
		input.close();

	}

}
