package com.ilpbatch4.utility;

public class SubArraySum {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,5,4};
		int s =10;
		
		subArraySum(array, s);
	}

	private static void subArraySum(int[] array, int s) {
		int left=0, right=0, sum=0;
		
		while(right<array.length) {
			sum += array[right];
			
			while(sum>s && left<=right) {
				sum-=array[left];
				left++;
			}
			
			if(sum==s) {
				System.out.println("Subarray from "+left+" to "+right);
			}
			right++;
		}
		
	}

}
