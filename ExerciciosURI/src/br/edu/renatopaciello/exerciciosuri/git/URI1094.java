package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1094 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int X = input.nextInt();
		
		int testeCoelhos = 0;
		int testeSapos = 0;
		int testeRatos = 0;
		for(int i = 1 ; i<=X ; i++) {

			int quantia = input.nextInt();
			char tipo = input.next().charAt(0);
			
			if(tipo == 'C') {
				testeCoelhos += quantia;
			} else if(tipo == 'S') {
				testeSapos += quantia;
			} else if(tipo == 'R') {
				testeRatos += quantia;
			}
					
		}
		
		int total = testeSapos + testeCoelhos + testeRatos;
		double porcentagemCoelhos = (double) testeCoelhos / total * 100.0;
		double porcentagemRatos = (double) testeRatos / total * 100.0;
		double porcentagemSapos = (double) testeSapos / total * 100.0;
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + testeCoelhos);
		System.out.println("Total de ratos: " + testeRatos);
		System.out.println("Total de sapos: " + testeSapos);
		System.out.printf("Percentual de coelhos: %.2f%%%n", porcentagemCoelhos);
		System.out.printf("Percentual de Ratos: %.2f%%%n", porcentagemRatos);
		System.out.printf("Percentual de Sapos: %.2f%%%n", porcentagemSapos);
		
		input.close();

	}

}
