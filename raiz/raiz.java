package raiz;

import java.util.Scanner;

public class raiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.println("Informe um número para calcular a raiz quadrada:");
		a = sc.nextDouble();
		b = Math.sqrt(a);
		System.out.println("Raiz de " + a + " = " + b);
	}
}
