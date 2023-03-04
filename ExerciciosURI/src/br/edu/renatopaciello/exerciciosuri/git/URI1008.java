package br.edu.renatopaciello.exerciciosuri.git;
import java.util.Locale;
import java.util.Scanner;

public class URI1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int numberFuncionario = teclado.nextInt();
		int horasTrabalhadas = teclado.nextInt();
		float horaSalario = teclado.nextFloat();
		
		float salario = horaSalario * horasTrabalhadas;
		
		System.out.println("NUMBER = " + numberFuncionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		teclado.close();

	}

}
