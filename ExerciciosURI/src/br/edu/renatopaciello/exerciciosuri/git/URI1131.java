package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1131 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int calcGrenais = 1,
			golsGremio,
			golsInter,
			totalEmpates = 0,
			vitoriasGremio = 0,
			vitoriasInter = 0,
			totalGrenais = 1;
		
		while(calcGrenais == 1) {
			golsGremio = input.nextInt();
			golsInter = input.nextInt();
			
			if(golsGremio == golsInter) {
				totalEmpates += 1;
			}
			
			else if(golsGremio > golsInter) {
				vitoriasGremio += 1;
			}
			else {
				vitoriasInter += 1;
			}
			
			System.out.println("Novo Grenal? (1-sim   2-não");
			calcGrenais = input.nextInt();
			
			if(calcGrenais == 1) {
				totalGrenais +=1;
			}
			
		}
		
				
		System.out.println(totalGrenais + " Grenais");
		System.out.println("Gremio: " + vitoriasGremio);
		System.out.println("Inter: " + vitoriasInter);
		System.out.println("Empates: " + totalEmpates);
		
		if(vitoriasGremio == vitoriasInter) {
			System.out.println("Não houve Vencedor");
		}
		
		else if(vitoriasGremio > vitoriasInter) {
			System.out.println("Grêmio venceu mais");
		}
		
		else {
			System.out.println("Inter venceu mais");
		}

		input.close();

	}

}
