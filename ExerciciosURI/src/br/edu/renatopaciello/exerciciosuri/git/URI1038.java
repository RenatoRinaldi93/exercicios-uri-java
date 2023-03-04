package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1038 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int cod = input.nextInt();
		int qntd = input.nextInt();
		
		// TESTAR COM SWITCH-CASE 
		
		if(cod == 1) {
			double valorTotal = qntd * 4.00;
			System.out.printf("Total: R$%.2f", valorTotal);
		}
		else if(cod == 2) {
			double valorTotal = qntd * 4.50;
			System.out.printf("Total: R$%.2f", valorTotal);
		}
		else if(cod == 3) {
			double valorTotal = qntd * 5.00;
			System.out.printf("Total: R$%.2f", valorTotal);
		}
		else if(cod == 4) {
			double valorTotal = qntd * 2.00;
			System.out.printf("Total: R$%.2f", valorTotal);
		}
		else if(cod == 5) {
			double valorTotal = qntd * 1.50;
			System.out.printf("Total: R$%.2f", valorTotal);
		}
		
		input.close();
	}

}
