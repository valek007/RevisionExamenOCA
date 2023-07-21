package examen.parte6;

public class Test1 {
	
	String myStr = "7007";
	
	public void doStuff(String str) {
		int myNum = 0;
		
		try {
			String myStr = str;
			myNum = Integer.parseInt(myStr);
		}catch (NumberFormatException e) {
			System.err.println("Error");
		}
		System.out.println("myStr: "+ myStr + ", myNum: "+myNum);
	}

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.doStuff("9009");
	}
}
//	What is the result?
//		A.myStr: 9009, myNum: 9009
//		B.myStr: 7007, myNum: 7007
//		C.myStr: 7007, myNum: 9009
//		D.Compilation fails
