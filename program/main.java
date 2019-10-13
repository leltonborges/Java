package program;

import entities.Triangle;

public class main {

	public static void main(String[] args) {
		Triangle x = new Triangle();
		Triangle y = new Triangle();

		x.setA(6);
		x.setB(2);
		x.setC(4);

		System.out.println(x.toString());
	}

}
