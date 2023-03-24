package com.example.star;

public class ArrayRev {
	public static void main(String[] args) {

		int arr[] = { 3, 4, 5, 7, 8, 9, 2, 3};

//		for (int i = arr.length - 1; i > 0; i--) {
//
//			System.out.print(arr[i]+" ");
//		}

		int n = arr.length;

		int start = 0, end = n - 1;

		int temp;

		while (start < end) {

			temp = arr[start];
			arr[start] = arr[end];

			arr[end] = temp;
			start++;
			end--;

		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
