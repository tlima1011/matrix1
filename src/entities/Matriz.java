package entities;

public class Matriz {
	
	public static void informarMatriz(int mat[][]) {
		
		System.out.println("Matriz:");
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat[i].length;j++) {
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static void diagonal(int mat[][]) {
		
		System.out.println("Main diagonal:");
		for(int i = 0; i < mat.length;i++) {
			System.out.print(mat[i][i] + "  ");
		}
		System.out.println();
	}
	
	public static void numerosNegativos(int mat[][]) {
		
		int negativos = 0; 
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat[i].length;j++) {
				if(mat[i][j] < 0) {
					negativos++;
				}
			}
		}
		System.out.println("Negative numbers = "+negativos);
	}
	

}
