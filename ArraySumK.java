package com.ilpbatch4.utility;

public class ArraySumK {

	public static void main(String[] args) {
		int array[] = {1,2,3,5,5,4};
		int k =5;
		
		pairSum(array, k);
	}

	private static void pairSum(int[] array, int k) {
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i]+array[j]==k)
				{
					System.out.println("Pairs : "+array[i]+"&"+array[j]);
				}
			}
		}
		
	}

}
