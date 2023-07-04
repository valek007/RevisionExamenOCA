package examen.parte2;

public class Test0 {

	public static void main(String[] args) {
		
		Alpha a1 = new Alpha(50);
		Alpha a2 = new Alpha(125);
		Alpha a3 = new Alpha(100);
		a1.doPrint();
		a2.doPrint();
		a3.doPrint();

	}
}
//What is the result?
//
//		A) 	ns = 50 s = 125
//			ns = 125 s = 125
//			ns = 100 s = 125
//	
//		B) 	ns = 50 s = 125
//			ns = 125 s = 125
//			ns = 0 s = 125
//
//		C) 	ns = 50 s = 50
//			ns = 125 s = 125
//			ns = 100 s = 100
//					
//		D) 	ns = 50 s = 50
//			ns = 125 s = 125
//			ns = 0 s = 125

	
class Alpha {
	int ns;
	static int s;

	Alpha(int ns) {
		if (s < ns) {
			s = ns;
			this.ns = ns;
		}
	}

	void doPrint() {
		System.out.println("ns = " + ns + " s = " + s);
	}
}