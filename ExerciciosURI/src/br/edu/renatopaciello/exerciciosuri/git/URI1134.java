package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1134 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int contAlcool = 0,
			contGasolina = 0,
			contDiesel = 0,
			opcao = input.nextInt();
		
		while(opcao != 4) {
						
			switch(opcao) {
			case 1:
				contAlcool += 1;
				break;
			case 2:
				contGasolina += 1;
				break;
			case 3:
				contDiesel += 1;
				break;
			default:
				break;
			}
			
			opcao = input.nextInt();
		}
		
		System.out.println("Muito Obrigado!");
		System.out.println("Álcool: " + contAlcool);
		System.out.println("Gasolina: " + contGasolina);
		System.out.println("Diesel: " + contDiesel);
		
		input.close();

	}

}
