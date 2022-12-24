/**
 * Write a program for calculator to accept an expression 
 * as a string in which the operands and operator are 
 * separated by zero or more spaces.
 * For ex: 3+4 and 3 + 4 are acceptable expressions.
 * 
 */

import java.util.Scanner;
public class Pract13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter valid expression: ");
		String exp = input.nextLine();
		
		System.out.println("Your expression: "+exp);
		
		char op='1';
		double a=0;
		double b=0;
		double ans=0;
		
		//===================Way 1===================//
//		char[] operators = {'+','-','*','/'};
//		for(int i=0;i<operators.length;i++) {
//			if(exp.indexOf(operators[i])!=-1) {
//				op = operators[i];
//				break;
//			}
//		}
//		
//		
//		String oprnd1 = exp.substring(0,exp.indexOf(op));
//		String oprnd2 = exp.substring(exp.indexOf(op)+1,exp.length());
//		
//		a = Double.parseDouble(oprnd1);
//		b = Double.parseDouble(oprnd2);
		//===========================================//
		
		//======================Way2=================//
		String[] operands = exp.split("[\\+\\-\\*\\/]");
		a = Double.parseDouble(operands[0]);
		b = Double.parseDouble(operands[1]);
		
		op = exp.charAt(operands[0].length());
		//===========================================//
		
		switch(op) {
			case '+':ans=a+b;
			break;
			case '-':ans=a-b;
			break;
			case '*':ans=a*b;
			break;
			case '/':ans=a/b;
			break;
		}
		System.out.println("Answer: "+ans);
	}

}
