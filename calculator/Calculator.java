package com.calculator;
import java.util.*;

public class Calculator {
	
	private int x, y;
	Scanner sc = new Scanner(System.in);
	
	public void addition() {
		System.out.println("Enter First number: ");
		int x = sc.nextInt();
		System.out.println("Enter Second number: ");
		int y = sc.nextInt();
		int sum = x+y;
		System.out.println(sum);
	}
	
	public void subtraction() {
		System.out.println("Enter First number: ");
		int x = sc.nextInt();
		System.out.println("Enter Second number: ");
		int y = sc.nextInt();
		int diff = x-y;
		System.out.println(diff);
	}
	
	public void multiplication() {
		System.out.println("Enter First number: ");
		int x = sc.nextInt();
		System.out.println("Enter Second number: ");
		int y = sc.nextInt();
		int mul = x*y;
		System.out.println(mul);
	}
	
	public void Division() {
		System.out.println("Enter First number: ");
		int x = sc.nextInt();
		System.out.println("Enter Second number: ");
		int y = sc.nextInt();
		int div = x/y;
		System.out.println(div);
	}

}
