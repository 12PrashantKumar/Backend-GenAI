package com.prashant.javabasics;

import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			int result = num * i;
			System.out.println(num + "x" + i + "=" + result);
		}

		System.out.println();
	}

}
