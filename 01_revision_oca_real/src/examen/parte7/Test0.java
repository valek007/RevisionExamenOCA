package examen.parte7;

public class Test0 {

	public static void main(String[] args) {
		
	}
}

//Which two modifications, made independently, enable the code to compile?
//	A.Make the method at line n1 public.
//	B.Make the method at line n2 public.
//	C.Make the method at line n3 public.
//	D.Make the method at line n3 protected.
//	E.Make the method at line n4 public.

abstract class Planet{
	protected void revolve() { //line n1
		
	}
	
	abstract void rotate();  //line n2
}

class Earth extends Planet{

//	void revolve() { //line n3
//		
//	}
	
	protected void rotate() { //line n4
		
	}
}