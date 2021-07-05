package application;

import java.util.Scanner;

import entities.Student;

public class Alugar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Student[] vector = new Student[10];
		
		System.out.print("Quantos quartos vai alugar? ");
		int n = scanner.nextInt();
		
		for (int i=1; i<=n; i++) { 
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Email: ");
			String email = scanner.nextLine();
			System.out.print("Quarto: ");
			int quarto = scanner.nextInt();
			
			vector[quarto] = new Student(name, email);
		}
		
		System.out.println();
		System.out.println("Quartos Ocupados: ");
		for (int i=0; i<10; i++) {
			if (vector[i] != null) {
				System.out.println(i + ": " +vector[i]);
			}
		}
		
		
		
		scanner.close();
	}

}
