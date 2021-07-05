package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter com  um numero de produtos: ");
		
		int n = sc.nextInt();
		Produto[] vetor = new Produto[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Qual o valor do produto: ");
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}
		
		double soma = 0.0;
		 	for (int i=0; i<n; i++) {
		 		soma = soma + vetor[i].getPreco();
		}
		double media = soma / n;
		
		System.out.printf("Preço Médio = R$ %.2f%n", media);
		 	
	
		
		sc.close();
	}

}
