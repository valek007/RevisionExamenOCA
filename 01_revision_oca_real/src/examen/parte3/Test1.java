package examen.parte3;

public class Test1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Base b1 = new Base();
		Base b2 = new DrivedA();
		Base b3 = new DrivedB();
		
		b1 = (Base) b3;
		Base b4 = (DrivedA) b3;
		b1.test();
		b4.test();
		
	}
}

//	What is the result?
//		A.Base
//		DerivedA
//		B.Base
//		DerivedB
//		C.DerivedB
//		DerivedB
//		D.DerivedB
//		DerivedA
//		E.A classcastExcept ion is thrown at runtime.

class Base{
	public void test() {
		System.out.println("Base");
	}
}

class DrivedA extends Base{
	public void test() {
		System.out.println("DrivedA");
	}
	
}

class DrivedB extends DrivedA{
	public void test() {
		System.out.println("DrivedB");
	}
}
