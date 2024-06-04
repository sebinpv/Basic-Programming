package com.ilpbatch4.utility;

import java.util.*;

public class DuplicateNumber {

	public static void main(String[] args) {
		int array[] = {1,2,3,5,5,5};
		
		duplicateNumber(array);

	}

	private static void duplicateNumber(int[] array) {
		Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                System.out.println(array[i]);
                while (i < array.length - 1 && array[i] == array[i + 1]) {
                    i++;
                }
            }
        }
		
	}

}
