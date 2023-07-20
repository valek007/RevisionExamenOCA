package examen.parte5;

import java.util.ArrayList;

public class Test3 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		ArrayList<Animal> animal = new ArrayList<>();
		ArrayList<Hunter> hunter = new ArrayList<>();
		ArrayList<Tiger> tiger = new ArrayList<>();
		
	    animal.add(new Tiger()); //A
	    hunter.add(new Cat()); //B
	    hunter.add(new Tiger()); //C
//	    tiger.add(new Cat()); //D
	    animal.add(new Cat()); //E
	}
}
//Given the following class declarations:
//public abstract class Animal
//public interface Hunter
//public class Cat extends Animal implements Hunter
//public class Tiger extends Cat
//Which answer fails to compile?

//A) ArrayList<Animal> myList = new ArrayList<>();
//myList.add(new Tiger());
//B) ArrayList<Hunter> myList = new ArrayList<>();
//myList.add(new Cat());
//C) ArrayList<Hunter> myList = new ArrayList<>();
//myList.add(new Tiger());
//D) ArrayList<Tiger> myList = new ArrayList<>();
//myList.add(new Cat());
//E) ArrayList<Animal> myList = new ArrayList<>();
//myList.add(new Cat());
abstract class Animal{
	
}

interface Hunter{
	
}

class Cat  extends Animal implements Hunter{
	
}

class Tiger extends Cat{
	
}
