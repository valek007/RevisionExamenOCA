package examen.parte6;

public class Test5 {

	public static void main(String[] args) {
		
		Product2 prod = new Product2();
		prod.price = 200;
		double newPrice = 100;
		
		Test5 test = new Test5();
		test.updatePrice(prod, newPrice);
		System.out.println(prod.price+" : "+newPrice);
		
	}
	
	public void updatePrice(Product2 product, double price) {
		price = price * 2;
		product.price = product.price + price;
	}
}
//What is the result?
//	A.200.0 : 100.0
//	B.400.0 : 200.0
//	C.400.0 : 100.0
//	D.Compilation fails.

class Product2{
	double price;
}

