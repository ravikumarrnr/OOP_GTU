/**
 * Assume a vehicle plate number consists of 
 * three uppercase letters followed by four digits.
 * Write a program to generate a plate number.
 * @author Ravi
 *
 */
public class Pract7 {

	public static void main(String[] args) {
		
		
		String plateNumber = ""+(char)(Math.random()*26+65);
		plateNumber += (char)(Math.random()*26+65);
		plateNumber += (char)(Math.random()*26+65);
		plateNumber += (int)(Math.random()*10);
		plateNumber += (int)(Math.random()*10);
		plateNumber += (int)(Math.random()*10);
		plateNumber += (int)(Math.random()*10);
		System.out.println(plateNumber);
		
	}

}
