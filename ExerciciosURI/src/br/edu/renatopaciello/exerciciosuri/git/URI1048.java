package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1048 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double salario = input.nextDouble();
		
		double porcentagem;
		double novoSalario;
		double reajusteGanho;
		int porcentagemInteira;
		if(salario >= 0 && salario <= 400.00) {
			porcentagem = 0.15;
			reajusteGanho = salario * porcentagem;
			novoSalario = salario + reajusteGanho;
			porcentagemInteira = (int) (0.15 * 100);
		}
		else if(salario > 400.00 && salario <= 800.00) {
			porcentagem = 0.12;
			reajusteGanho = salario * porcentagem;
			novoSalario = salario + reajusteGanho;
			porcentagemInteira = (int) (0.12 * 100);
		}
		else if(salario > 800.00 && salario <= 1200.00) {
			porcentagem = 0.10;
			reajusteGanho = salario * porcentagem;
			novoSalario = salario + reajusteGanho;
			porcentagemInteira = (int) (0.10 * 100);
		}
		else if(salario > 1200.00 && salario <= 2000.00) {
			porcentagem = 0.07;
			reajusteGanho = salario * porcentagem;
			novoSalario = salario + reajusteGanho;
			porcentagemInteira = (int) (0.07 * 100);
		}
		else {
			porcentagem = 0.04;
			reajusteGanho = salario * porcentagem;
			novoSalario = salario + reajusteGanho;
			porcentagemInteira = (int) (0.04 * 100);
		}
		
		System.out.printf("Novo Salario: R$%.2f%n", novoSalario);
		System.out.printf("Reajuste Ganho: R$%.2f%n", reajusteGanho);
		System.out.printf("Em percentual: %d%%", porcentagemInteira);
		
		input.close();

	}

}
