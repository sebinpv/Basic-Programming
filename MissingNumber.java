package com.ilpbatch4.utility;

public class MissingNumber {

	public static void main(String[] args) {
		int array[] = {1,2,5};
		
		missingNumber(array);

	}

	private static void missingNumber(int[] array) {
		int min = array[0];
		int max = array[array.length-1];
		int temp;
		
		for(int i=min; i<max; i++)
		{
			temp=0;
			for(int j=0; j<array.length-1; j++)
			{
				if(array[j] == i) {
					temp++;
				}
			}
			if(temp==0) {
				System.out.println(i);
			}
		}
		
	}

}
