package entities;

public class Triangle {
	private double a;
	private double b;
	private double c;
	
	public void setA(double x) {
		this.a = x;
	}
	
	public double getA() {
		return a;
	}
	
	public void setB(double y) {
		this.b = y;
	}
	
	public double getB() {
		return b;
	}
	
	public void setC(double z) {
		this.c = z;
	}
	
	public double getC() {
		return c;
	}
	
	public double areaTriangle() {
		return 0;
	}
	
	public String toString() {
		return 
		"Lado a: "+getA()+
		"\nLado b: "+getB()+
		"\nLado c: "+getC();
	}
}
