package br.edu.renatopaciello.exerciciosuri.git;

import java.util.Locale;
import java.util.Scanner;

public class URI1020 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double N;
		int quociente, nota, moeda, resto;
		
		N = teclado.nextDouble();
		
		// Multiplica N por 100 e forçar conversão para int
		// Também é importante somar o valor por 0.5 e garantir que o valor seja arredondando
		
		resto = (int) (N * 100.0 + 0.5);
		
		System.out.println("NOTAS: ");
		
		// O valor de cada nota também deve ser multiplicado por 100
		
		nota = 100;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota*100);
		
		nota = 50;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota*100);
		
		nota = 20;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota*100);
		
		nota = 10;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota*100);
		
		nota = 5;
		quociente = resto /(nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota*100);
		
		nota = 2;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota*100);
		
		
		System.out.println("MOEDAS: ");
		
		moeda = 100;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 1.00");
		resto = resto % moeda;
		
		moeda = 50;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.50");
		resto = resto % moeda;
		
		moeda = 25;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.25");
		resto = resto % moeda;
		
		moeda = 10;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.10");
		resto = resto % moeda;
		
		moeda = 5;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.05");
		resto = resto % moeda;
		
		moeda = 1;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.01");

		
		teclado.close();

	}

}
