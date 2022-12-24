/**
 * Write a program that reads an integer and displays 
 * all its smallest factors in increasing order. 
 * For example if input number is 120, 
 * the output should be as follows:2,2,2,3,5.
 * @author Ravi
 *
 */
import java.util.*;
public class Pract8 {
	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 System.out.print("ENTER THE NUMBER ");
		 int num=input.nextInt();
//		 for(int i=2;i<=num;i++)
//		 {
//			 if(num%i==0)
//			 System.out.print(i+",");
//		 }
		 
		 for(int i=2;i<=num;)
		 {
			 if(num%i==0)
			 {
				 System.out.print(i+",");
				 num/=i;
			 }
			 else
			 {
				 i++;
			 }
		 }
	}
}
