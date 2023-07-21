package examen.parte6;

public class Test0 {

	public static void main(String[] args) {
	
		try {
			method1();
		} catch (MyException e) {
			System.out.print("A");
		}
		
	}
	
	public static void method1() {
		//line n1
		try {
			throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
		} catch (RuntimeException e) {
			System.out.print("B");
		}
		
	}
}

//	What is the result?
//		A.A
//		B.B
//		C.Either A or B
//		D.AB
//		E.A compile time error occurs at line n1

class MyException extends RuntimeException{

	private static final long serialVersionUID = 5158740137484187757L;
	
}
