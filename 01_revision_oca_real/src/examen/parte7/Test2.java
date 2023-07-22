package examen.parte7;

public class Test2 {

	public static void main(String[] args){ //line n1
		X xObj = new X();
		xObj.printFileContent(); //line n2
	} //line n5
	
}

class X {
	public void printFileContent(){ //line n3
		// Code goes here
//		throw new IOException(); //line n4
	}
}

/*
Which two modifications should you make so that the code compiles successfully?
A) Replace line n1 with public static void main(String[] args) throws Exception {
B) Replace line n2 with:
	try{
		xObj.printFileContent();
	}catch(Exception e){
	}catch(IOException e){
	}
C) Replace line n3 with public void printFileContent() throws Exception {
D) Replace line n4 with throw IOException("Exception raised")
E) At line n5, insert throw new IOException()



*/