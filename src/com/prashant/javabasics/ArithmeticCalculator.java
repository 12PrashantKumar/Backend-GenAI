package com.prashant.javabasics;
import java.util.*;

public class ArithmeticCalculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1 +num2;
		int sub = num1 -num2;
		int mult = num1 *num2;
		int divide = num1 /num2;
		
		if  (num2 == 0 ) {
			System.out.print("undefined");
		}
		System.out.println(sum + " " + sub + " "  + mult + " "  + divide  );
				
	}

}
