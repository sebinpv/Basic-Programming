package com.ilpbatch4.utility;

public class NumberSeries4 {

	public static void main(String[] args) {
		int num = 3;

		System.out.println("Factorial sum is " + factOfNum(num));

	}

	private static float factOfNum(int num) {
		float sum = 0;
		for (int i = num; i > 0; i--) {
			sum += i / factorial(i);
		}
		return sum;
	}

	private static float factorial(int n) {
		int factorial = 1;
		for (int i = n; i > 0; i--) {
			factorial *= i;
		}
		return factorial;
	}

}
