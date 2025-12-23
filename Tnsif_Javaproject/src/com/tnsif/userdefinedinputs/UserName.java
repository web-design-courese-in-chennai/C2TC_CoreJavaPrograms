package com.tnsif.userdefinedinputs;

import java.util.Scanner;

public class UserName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Name");
		String n=input.nextLine();
		System.out.println("HELLO "+ n);
	}

}
