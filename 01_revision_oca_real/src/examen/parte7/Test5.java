package examen.parte7;

public class Test5 {

	public static void main(String[] args) {
		
	}
}
/*
Which option enables the code to compile?

A) Replace the code fragment at line n1 with:
   class Book implements Readable{

B) At line n2 insert:
   public abstract void setBookMark();
   
C) Replace the code fragment at line n3 with:
   abstract class EBook extends Book {
   
D) At line n4 insert:
   public void setBookMark() {
*/

interface Readable{
	public void readBook();
	public void setBookMark();
}

abstract class Book implements Readable{ //line n1
	public void readBook() {
		//line n2
	}
}

abstract class EBook extends Book{ //line n3 //delete abstract for the exercise
	
	public void readBook() {
		//line n4
	}
	
}