package scanner;

import java.util.Locale;
import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char nome;
		int idade;
		double altura;
		System.out.println("Infome um nome");
		//charAt pegar o caracter da posição desejada.
		nome = sc.next().charAt(0);
		System.out.print("Idade: ");
		idade = sc.nextInt();
		System.out.print("Altura: ");
		altura = sc.nextDouble();
		System.out.println("O nome é: " + nome+"\nidade: "+idade
				+"\nAltura: "+altura);
		sc.close();
	}
}
