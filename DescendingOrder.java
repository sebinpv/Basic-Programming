package com.ilpbatch4.utility;

public class DescendingOrder {

	public static void main(String[] args) {
		int input1=5, input2=1, input3=3;
		
		if(input1<input2)
		{
			input1 += input2;
			input2 = input1-input2;
			input1 -= input2;
		}
		if(input1<input3)
		{
			input1 += input3;
			input3 = input1-input3;
			input1 -= input3;
		}
		if(input2<input3)
		{
			input2 += input3;
			input3 = input2-input3;
			input2 -= input3;
		}
		System.out.println(input1+" "+input2+" "+input3);
	}

}
