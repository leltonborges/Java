package codincionalTernaria;
import java.util.Scanner;

public class CondicionalTernarina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, aumento;
		System.out.println("Informe o Salário:");
		salario = sc.nextDouble();
		aumento = (salario > 1800.0)?salario*1.1:salario*1.09;
		System.out.println("Aumento de "+ aumento);
	}

}
