/**
 * Write a program that creates a Random object with 
 * seed 1000 and displays the first 100 random integers 
 * between 1 and 49 using the NextInt (49) method.
 * 
 */

import java.util.Random;
import java.util.Arrays;
public class Pract12 {

	public static void main(String[] args) {
		
		Random random = new Random(1000);
		
		//System.out.println(Arrays.toString(random.ints(100,1,49).toArray()));
		
		for(int i=1;i<=100;i++) {
			System.out.print((random.nextInt(49)+1)+" ");
			if(i%10==0)
				System.out.println();
		}
	}

}
