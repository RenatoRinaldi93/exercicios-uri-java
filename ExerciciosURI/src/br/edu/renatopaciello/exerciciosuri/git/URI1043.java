package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1043 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		if(B + C > A && A + C > B && A + B > C) {
			double perimetro = A + B + C;
			System.out.printf("Perímetro = %.1f", perimetro);
		}
		else {
			double area = (A + B) * C / 2;
			System.out.printf("Area = %.1f", area);
		}
		
		
		input.close();

	}

}
