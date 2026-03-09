package com.prashant.javabasics;
import java.util.*;

public class SimpleTernaryExercises {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = (a >b )? a:b;
		
		
//		String result = (num % 2 == 0) ? "Even" :"Odd";
		System.out.println("Maximum : " + max);
		sc.close();
	}

}
