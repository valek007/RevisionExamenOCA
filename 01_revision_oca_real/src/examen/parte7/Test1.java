package examen.parte7;

public class Test1 {

	public static void main(String[] args) {

		Car car1 = new Car("Auto");
		Car car2 = new Car("4W",100,"Manual");
		System.out.println(car1.type+" "+car1.maxSpeed+" "+car1.trans);
		System.out.println(car2.type+" "+car2.maxSpeed+" "+car2.trans);
	}
}

//What is the result?
//	A.4W 100 Auto
//	4W 150 Manual
//	B.Null 0 Auto
//	4W 150 Manual
//	C.Compilation fails only at line n1
//	D.Compilation fails only at line n2
//	E.Compilation fails at both line n1 and line n2

class Vehicle {
	String type = "4W";
	int maxSpeed = 100;

	Vehicle(String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}

class Car extends Vehicle {

	String trans;

	Car(String trans) { //line n1
		super("4W", 200); //delete for exercise 
		this.trans = trans;
	}

	Car(String type, int maxSpeed, String trans) {
		super(type, maxSpeed);
		this.trans = trans; //line n2
	}

}