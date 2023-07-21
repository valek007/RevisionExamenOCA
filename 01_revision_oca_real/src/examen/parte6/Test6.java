package examen.parte6;

public class Test6 {
	static int aVar = 9;

	public static void main(String[] args) {
		
		if(aVar++ < 10) {
			System.out.println(aVar + " Hello World!");
		}else {
			System.out.println(aVar + " Hello Universe!");
		}
	}
}
//What is the result if the integer aVar is 9?
//	A.Hello World!
//	B.Hello Universe!
//	C.Hello World!
//	D.Compilation fails.