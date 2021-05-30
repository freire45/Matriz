package br.com.erickfreire.matriz;

/**
 * Programa em Java que cria uma matriz e percorre os valores dentro dela.
 * @author Erick Freire
 * @version 1 - Criado em 30-05-2021 as 14:17
 */

public class Matriz {

	public static void main(String[] args) {
		
		int[][] matriz1 = {{1, 2, 3},{4,5,6}};
		int[][] matriz2 = {{1, 2}, {3} ,{4,5,6}};
		
		System.out.println("Valores na Matriz 1 por linha são: ");
		saidaMatriz(matriz1);
		
		System.out.println("Valores na Matriz 2 por linha são: ");
		saidaMatriz(matriz2);

	}
	
	public static void saidaMatriz(int[][] mat) {
		
		for(int linha = 0; linha < mat.length; linha++) {
			for(int coluna = 0; coluna < mat[linha].length; coluna++)
				System.out.printf("%d ", mat[linha][coluna]);
			
			System.out.println();
		}
		
	}

}
