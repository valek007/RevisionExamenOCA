package examen.parte7;

public class Test3 {

	public static void main(String[] args) {

	}
}
/*
How should you write methods in the ElectricAccount class at line n1 so that the member variable bill
is always equal to the value of the member variable kwh multiplied by the member variable rate?
Any amount of electricity used by a customer (represented by an instance of the customer class)
must contribute to the customer's bill (represented by the member variable bill) through the method useElectricity method.
An instance of the customer class should never be able to tamper with or decrease the value of the member variable bill.

A) public void addKWh(double kWh) {
	this.kWh += kWh;
	this.bill = this.kWh*this.rate;
   }
   
B) public void addKWh(double kWh) {
	if(kWh > 0){
	  this.kWh += kWh;
	  this.bill = this.kWh*this.rate;
	}
   }
   
C) private void addKWh(double kWh) {
	if(kWh > 0){
	  this.kWh += kWh;
	  this.bill = this.kWh*this.rate;
	}
   }
   
D) public void addKWh(double kWh) {
	if(kWh > 0){
	  this.kWh += kWh;
	  setBill(this.kWh);
	}
   }
*/
class Custumer {
	ElectricAccount acct = new ElectricAccount();

	public void useElectricity(double kWh) {
		acct.addKWh(kWh);
	}
}

class ElectricAccount {
	private double kWh, rate = 0.7, bill;

	// line n1
	public void addKWh(double kWh2) {

	}
}