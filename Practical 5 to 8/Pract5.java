/**
 * 5)	Write a program that prompts the user to enter three integers and display the integers in
	decreasing order.
 * @author Ravi
 *
 */
import java.util.Scanner;
public class Pract5 {

	public static void main(String[] args) {
		
		int i,j,arr[]= {0,0,0};
		Scanner myobj = new Scanner(System.in);
	
		System.out.println("Enter 3 numbers ");
		for(i=0;i<3;i++)
			arr[i]= myobj.nextInt();
		
		for(i=0;i<3;i++)
			for(j=0;j<3-i-1;j++)
				if(arr[j]<arr[j+1])
				{
					arr[j]=arr[j]+arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];					
				}	

		for(i=0;i<3;i++)
			System.out.print(arr[i]);
	}
}


