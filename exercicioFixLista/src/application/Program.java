package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitie.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees wil be registered? ");
		int qtde = sc.nextInt();
		
		System.out.println();
		
		List<Employee> list = new ArrayList<>();
					
		for (int i=0; i<qtde; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) +":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			Double salario = sc.nextDouble();
			
			Employee emp = new Employee(id, nome, salario);
			 
			list.add(emp);
			
			//System.out.println(emp);
		}
		
		
	System.out.print("Enter the employee id that will have salary increase:  ");
	
		int idsalary = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		//Integer pos = position(list, idsalary);
		
//		if (pos == null) {
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double porcentagem  = sc.nextDouble();
			//list.get(pos).aumento(aumento);
			emp.aumento(porcentagem);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee employ : list) {
			System.out.println(employ);
		}
		
		
		sc.close();
	}
	
	public static Integer position(List<Employee> list, int id) {
		for (int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
}
