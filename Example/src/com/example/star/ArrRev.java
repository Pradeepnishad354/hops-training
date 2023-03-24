package com.example.star;

import java.util.Arrays;

public class ArrRev {
	public static void main(String[] args) {

		int a[] = { 3, 4, 5, 7, 8, 9, 2, 3 };

		int i = 0;
		int j = a.length - 1;
		int temp;
		while (i < j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;

		}

		for (int b = 0; b < a.length; b++)
			System.out.print(a[b] + " ");
		// System.out.println(Arrays.toString(a));
	}

}
