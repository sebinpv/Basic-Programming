package com.ilpbatch4.utility;

public class Pattern3 {

	public static void main(String[] args) {
		int input=5;
		
		pattern(input);

	}
	
	private static void pattern(int input) {
		int length = input-2;
		for(int i=0; i<input; i++) {
			int num = i<length ? i+1 : input-i;
			int space = length - num;
			for(int j=0; j<space; j++) {
				System.out.print(" ");
			}
			for(int j=num; j>1; j--) {
				System.out.print(j);
			}
			for(int j=1; j<=num; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
