package examen.parte5;

public class Test5 {
	
	int num;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Test5 obj1 = new Test5();
		Test5 obj2 = obj1;
		Test5 obj3 = null;
		
		obj2.num = 60;
		graceMarks(obj2);
	}
	
	public static void graceMarks(Test5 obj4) {
		obj4.num += 10;
	}
}
//How many MarkList instances are created in memory at runtime?
//	A.1
//	B.2
//	C.3
//	D.4