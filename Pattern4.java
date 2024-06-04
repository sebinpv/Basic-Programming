package com.ilpbatch4.utility;

public class Pattern4 {

	public static void main(String[] args) {
		int input=4;
		
		pattern(input);

	}

	private static void pattern(int input) {
		for(int i=1; i<=input; i++)
		{
			int ascii = 65;
			int space = input - i+1;
			for(int j=1; j<space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(Character.toString((char)ascii));
				ascii++;
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
	}

}
