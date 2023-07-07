package examen.parte4.p1;

public class Test1 {
//	Given the definitions of the MyString class and the Test class:
	public static void main(String[] args) {
		System.out.println("Hello "+ new StringBuilder("Java SE 8"));
		System.out.println("Hello "+ new MyString("Java SE 8"));
	}
}
//	What is the result?
//			
//			A) Hello Java SE 8
//			   Hello Java SE 8
//				
//			B) Hello java.lang.StringBuilder@<<hashcode1>>
//			   Hello p1.MyString@<<hashcode2>>
//			
//			C) Hello Java SE 8
//			   Hello p1.MyString@<<hashcode2>>
//			
//			D)Compilation fails at the Test.class