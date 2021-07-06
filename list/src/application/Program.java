package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//List x = new List[] Em lista nao se chama pois lista é uma classe.. fazemos assim... como o exemplo abaixo
		
		List<String> list = new ArrayList<>(); // nao aceita tipos primitivos.. por isso colocamos o wrapper class entre maior e menot indicando generic <Integer> e nao o int
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		//list.remove("Anna");
		//list.remove(0);
		
		
		
		for (String x : list) {
			System.out.println(x);
		}
		
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println();
		System.out.println("-------------------");
		System.out.println();
		
		System.out.println(list);
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println(list.size());
		
		// para achar a posicao de um elemento ex Bob...
		
		System.out.println("-------------------");
		System.out.println("Quando o indexOf for falso ele retorna -1, quando verdadeiro ele retorna a posição da lista");
		System.out.println("Index of Marco is: " + list.indexOf("Marco")); // se a condição for negativa ele me retorna -1
		System.out.println("Index of Anna is: " + list.indexOf("Anna"));
		System.out.println("-------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		// primeiro converto minha lista para steam(), Filtro a expressão Lambda x-> s.charAt(0) == 'A' depois converte novamente para lista .collect(Collectors.toList());
		System.out.println("Imprimir somente Lista que inicie com a letra A");
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		
		System.out.println("no List quando procuramos o primeiro elemento com a sintaxe da busca ele retorna o nome, ou senao null");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		String noname = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println("Quando o elemento é encontrado ele retornaa o nome : " + name);
		System.out.println("Quando nao encontra o nome ele retorna: " + noname);
		
		sc.close();
	}
}
