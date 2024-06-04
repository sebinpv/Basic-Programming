package com.ilpbatch4.utility;

public class SortZeroOnes {

	public static void main(String[] args) {
		int array[] = {1,0,1,1,0};
		
		sortZeroOnes(array);

	}

	private static void sortZeroOnes(int[] array) {
		int temp;
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[j]<array[i])
				{
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		System.out.println("Sorted Array:");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}

}
