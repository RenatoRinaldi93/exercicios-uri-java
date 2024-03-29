package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1037 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		float x = input.nextFloat();
		
		if(x >= 0.0 && x <= 25.00) {
			System.out.println("Intervalo (0,25)");
		}
		else if(x > 25.00 && x <= 50.00) {
			System.out.println("Intervalo (25,50)");
		}
		else if(x > 50.00 && x <= 75.00) {
			System.out.println("Intervalo (50,75");
		}
		else if(x > 75.00 && x <= 100.00) {
			System.out.println("Intervalo (75,100)");
		}
		else {
			System.out.println("Fora de Intervalo");
		}
		
		input.close();

	}

}
