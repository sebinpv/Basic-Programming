package com.ilpbatch4.utility;

public class NumberSeries3 {

	public static void main(String[] args) {
		int n=3,sum;
		
		sum = sumofseries(n);
		System.out.println("Sum of series = "+sum);

	}

	private static int sumofseries(int n) {
		int sum=0,j=1;
		for(int i=1; i<=n*2; i=i+2)
		{
			if(j%2==0) {
				sum-=power(i,j);
			}
			else {
				sum+=power(i,j);
			}
			j++;
		}
		return sum;
	}

	private static int power(int num, int p) {
		int power=1;
		for(int i=0; i<p; i++)
		{
			power*=num;
		}
		return power;
	}

}
