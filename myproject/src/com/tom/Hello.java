package com.tom;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number：");
		int n = scan.nextInt();
		int sum = 1;
		int i;
		for(i = 1;i <= n; i++) {
			sum *= i;
		}
		System.out.println(i-1 + "！ = " + sum);
	}
}
