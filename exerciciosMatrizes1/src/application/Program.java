package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o numero interiro de Linha: ");
		int m = sc.nextInt();
		System.out.print("Entre com o numero de coluna: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite um numero para pesquisar dentro da matriz: ");
		int x = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position " +  i + "," + j + ":");
					if (j>0) {
						System.out.println("Left: " + mat[i][j-1]);
					} if (j<mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					} if (i<mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					} if (i>0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
				} else {
					System.out.println("Number not exist in matrix!");
				}
			}
		}
		
		
		sc.close();
	}	
}
