package Matriz;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.print("Diagonal principal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println();
		System.out.println("Number negative: " + count);

		sc.close();
	}
}
