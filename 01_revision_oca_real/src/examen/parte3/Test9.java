package examen.parte3;

public class Test9 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String[] strs = new String[2];
		int idx = 0;

		for (String s : strs) {
			strs[idx].concat(" element " + idx);
			idx++;
		}
		
		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}

	}
}
//	What is the result?
//		A.Element 0
//		Element 1
//		
//		B.Null element 0
//		Null element 1
//		
//		C.Null
//		Null
//		
//		D.A NullPointerException is thrown at runtime