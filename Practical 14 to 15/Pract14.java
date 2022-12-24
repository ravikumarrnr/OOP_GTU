/**
 * Write a program that creates an Array List and adds a Loan object, 
 * a Date object, a string, and a Circle object to the list, 
 * and use a loop to display all elements in the list 
 * by invoking the object’s to String() method.
 */

import java.util.ArrayList;
import java.util.Date;
public class Pract14 {

	public static void main(String[] args) {

		ArrayList<Object> list = new ArrayList<>();
		
		Loan loanAcc = new Loan(1,"Parth",48,8.6f);
		list.add(loanAcc);
		Date currDate = new Date();
		list.add(currDate);
		String str = "This is just a description.";
		list.add(str);
		MyCircle circle = new MyCircle(4);
		list.add(circle);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
	}

}

class Loan {
	private int accNumber;
	private String accHolderName;
	private int tenure;
	private float intRate;
	
	Loan(int accNumber,String accHolderName,int tenure,float intRate){
		this.accNumber=accNumber;
		this.accHolderName=accHolderName;
		this.tenure=tenure;
		this.intRate=intRate;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public float getIntRate() {
		return intRate;
	}
	public void setIntRate(float intRate) {
		this.intRate = intRate;
	}
	public String toString() {
		String str = "Loan Account Details: AccountNo: "+getAccNumber()+", Account Holder Name: "+getAccHolderName()+", Tenure: "+getTenure()+", Interest Rate: "+getIntRate();
		return str;
	}
}

class MyCircle{
	private double radius;
	
	MyCircle(double radius){
		this.radius = radius;
	}	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}	
	public double area() {
		return Math.PI * radius * radius;
	}
	public String toString() {
		String str="Circle Details: Radius: "+getRadius()+", Area: "+area();
		return str;
	}
}