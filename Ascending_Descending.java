package com.ilpbatch4.utility;

public class Ascending_Descending {

	public static void main(String[] args) {
int input1=5, input2=1, input3=3;
		
		if(input1>input2)
		{
			input1 += input2;
			input2 = input1-input2;
			input1 -= input2;
		}
		if(input1>input3)
		{
			input1 += input3;
			input3 = input1-input3;
			input1 -= input3;
		}
		if(input2>input3)
		{
			input2 += input3;
			input3 = input2-input3;
			input2 -= input3;
		}
		System.out.println("Ascending Order "+input1+" "+input2+" "+input3);

		
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
		System.out.println("Decending Order "+input1+" "+input2+" "+input3);
	}

}
