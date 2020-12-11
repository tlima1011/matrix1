package application;

import java.util.Scanner;

import entities.Matriz;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Tamanho da matriz: ");
		int n = sc.nextInt(); 
		
		int mat[][] = new int[n][n]; 
		
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat[i].length;j++) {
				System.out.printf("Elemento [%d][%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		Matriz.informarMatriz(mat);
		Matriz.diagonal(mat); 
		Matriz.numerosNegativos(mat);
		
		sc.close();

	}

}
