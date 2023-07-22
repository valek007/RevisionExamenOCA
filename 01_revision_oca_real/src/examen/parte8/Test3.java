package examen.parte8;

public class Test3 {

	void readCard(int cardNo) throws Exception{
		System.out.println("Reading Card");
	}
	
	void checkCard(int CardNo) throws RuntimeException{ //line n1
		System.out.println("Checking Card");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args){
		Test3 ex = new Test3();
		int cardNo = 12344;
//		ex.checkCard(cardNo);  //line n2
//		ex.readCard(cardNo);  //line n3
	}
}
/*
What is the result?
	A.Reading Card
	Checking Card
	B.Compilation fails only at line n1.
	C.Compilation fails only at line n2.
	D.Compilation fails only at line n3.
	E.Compilation fails at both line n2 and line n3.
*/