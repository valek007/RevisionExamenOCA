package examen.parte1;

public class Test0 {

	public static void main(String[] args) {

		// Given the code fragment:

		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : a;
		System.out.println(d);
		
//		- What is the result?
//				
//		A.100
//		B.101
//		C.102
//		D.103
//		E.Compilation fails

	}
}
