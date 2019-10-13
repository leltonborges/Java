package construct;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock(){
		return price * quantity;
	}
	
	public int addProduct(int add) {
		return this.quantity +=add;
	}
	
	public int removeProduct(int remove) {
		return this.quantity -= remove;
	}
	
	public String toString() {
		return "Name: " + name+
				" price: "+ totalValueInStock() +
				" quantity: "+ quantity;
	}
}
