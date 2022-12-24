/**
 * Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your
	weight in kilograms and dividing by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
	(Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.)
 * @author Ravi
 *
 */
import java.util.Scanner;
public class Pract4 {
	public static void main(String[] args) {
		double w,h,bmi;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the weight in pounds:");
		w=sc.nextDouble()*0.45359237;
		System.out.print("Enter the height in inches:");
		h=sc.nextDouble()*0.0254;
		bmi=w/(h*h);
		System.out.println("BMI = "+bmi);
	}
}
