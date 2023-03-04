package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1049 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		String subClassAnimal = input.nextLine();
		String tipoAnimal = input.nextLine();
		String tipoAlimento = input.nextLine();
		
		if(subClassAnimal.equals("vertebrado")) {
			if(tipoAnimal.equals("ave")) {
				if(tipoAlimento.equals("carnivoro")) {
					System.out.println("aguia");
				}
				else {
					System.out.println("pomba");
				}
			}
			else if(tipoAnimal.equals("mamifero")) {
					if(tipoAlimento.equals("onivoro")) {
						System.out.println("homem");
					}
					else {
						System.out.println("vaca");
					}
			}
		}
		
		else if(subClassAnimal.equals("invertebrado")) {
				if(tipoAnimal.equals("inseto")) {
					if(tipoAlimento.equals("hematofago")) {
						System.out.println("pulga");
					}
					else {
						System.out.println("lagarta");
					}
				}
				else {
					if(tipoAlimento.equals("hematofago")) {
						System.out.println("sanguessuga");
					}
					else {
						System.out.println("minhoca");
					}
				}
		}
		
		
		
		input.close();

	}

}
