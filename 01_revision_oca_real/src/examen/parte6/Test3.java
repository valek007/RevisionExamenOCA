package examen.parte6;

public class Test3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Product p1 = new Product(101, "Pen");
		Product p2 = new Product(101, "Pen");
		Product p3 = p1;
		
		boolean ans1 = p1 == p2;
		boolean ans2 = p1.name.equals(p2.name);
		System.out.println(ans1+" "+ans2);
	}
}

//	What is the result?
//		A.true:true
//		B.true:false
//		C.false:true
//		D.false:false


class Product{
	int id;
	String name;
	
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
}


