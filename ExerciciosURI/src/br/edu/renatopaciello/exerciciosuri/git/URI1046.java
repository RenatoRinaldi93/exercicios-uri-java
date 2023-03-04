package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Scanner;

public class URI1046 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int horaInicio = input.nextInt();
		int horaFim = input.nextInt();
		
		int duracao;
		if(horaInicio < horaFim) {
			duracao = horaFim - horaInicio;
		}
		else {
			duracao = 24 - horaInicio + horaFim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		input.close();

	}

}
