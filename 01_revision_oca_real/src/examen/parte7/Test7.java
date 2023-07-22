package examen.parte7;

public class Test7 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		DVD dvd = new DVD(10,20);
	}
}
/*
Which code fragment should you use at line n1 to instantiate the dvd object successfully?

A) super.r = r;
   this.c = c;
   
B) super(r);
   this(c);
   
C) super(r);
   this.c = c;
   
D) this.c = r;
   super(c);

*/

class CD {
	int r;

	CD(int r) {
		this.r = r;
	}
}

class DVD extends CD{
	int c ;
	
	DVD(int r, int c){
		//line n1
		super(r); //delete this fragment for the exercise
	}
}