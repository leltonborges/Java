package vect1;

import java.util.Locale;
import java.util.Scanner;

public class Vect {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0.0;
		double result;
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		for(int i=0; i<n;i++){
			sum+=vect[i];
		}
		result =sum/n;
		System.out.printf("Sum: %.2f%n", result);
		
		sc.close();
	}

}
