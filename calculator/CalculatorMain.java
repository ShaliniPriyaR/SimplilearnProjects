package com.calculator;
import java.util.*;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Calculator c1 = new Calculator();
		
		int choice;

		do {
			System.out.println("1.Addition  2.Subtraction  3.Multiplication  4.Division 5.exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				c1.addition();
				break;
			
			case 2:
				c1.subtraction();
				break;
			
			case 3:
				c1.multiplication();
				break;
				
			case 4:
				c1.Division();
				break;
			case 5:
				System.exit(0);
			}
		}while(true);
	}

}
