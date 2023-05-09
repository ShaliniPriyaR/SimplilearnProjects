package com.email;

import java.util.*;

public class EmailMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<String> Email = new ArrayList<String>();
		
		Email.add("xyz@gmail.com");
		Email.add("abc@gmail.com");
		Email.add("pqr@gmail.com");
		Email.add("def@gmail.com");
		Email.add("uvw@gmail.com");
		
		System.out.println("Enter the email to search: ");
		String searchEmail = sc.next();
		
		boolean flag = false;
		for(String In: Email) {
			if(searchEmail.equalsIgnoreCase(In)) {
				System.out.println("Email is present in the list");
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("Email is not present in the list");
		}
	}

}
