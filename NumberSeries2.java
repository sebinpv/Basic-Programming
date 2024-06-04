package com.ilpbatch4.utility;

public class NumberSeries2 {

	public static void main(String[] args) {
		int n=4,sum;
		
		sum = sumofseries(n);
		System.out.println("Sum of series = "+sum);

	}

	private static int sumofseries(int n) {
		int number1 =0, number2=1, number3=0, sum=0;
		
		for(int i=0; i<n; i++)
		{
			number3 = number1 + number2;
			sum+=(number3*number3*number3);
			number1 = number2;
			number2 = number3;
		}
		return sum;
	}

}
