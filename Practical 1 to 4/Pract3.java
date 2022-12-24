/**
 * 
 * @author Ravi
 * Write a program that reads a number in meters, converts it to feet, and displays the result.
 * (Hint: 1 metre = 3.28084 feet)
 */
import java.util.Scanner;
public class Pract3 {
	public static void main(String[] args) {
     System.out.print("Enter lengh in meter = ");
     Scanner input = new Scanner(System.in);
     double x = input.nextDouble();
     double y = x*3.28084;
     System.out.println("Lengh in feet = "+ y);
	}
}
