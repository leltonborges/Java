package vect2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Infome a quantidade de produto:");
		int n = sc.nextInt();
		Product[] product = new Product[n];
		double sum = 0.0;
		int a =1;
		
		for (int i = 0; i < product.length; i++) {			
			System.out.println(a + "º product");
			sc.nextLine();
			String name = sc.nextLine();
			//sc.nextLine();
			System.out.println("Valor do produto:");
			double price = sc.nextDouble();
			
			product[i]= new Product(name, price);
			sum += product[i].getPrice();
			a++;
		}

		System.out.printf("Sum : %.3f%n",sum/n);
	}

}
