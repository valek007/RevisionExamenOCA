package examen.parte1;

public class Test4 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		C c = new C();
	}
}

//What is the result?
//A.C B A
//B.C
//C.A B C
//D.Compilation fails at line n1 and line n2

class A{
	public A() {
		System.out.println("A ");
	}
}

class B extends A{
	public B() {
		System.out.println("B ");
	}
}

class C extends B{
	public C() {
		System.out.println("C ");
	}
}