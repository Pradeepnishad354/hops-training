package com.string.occurence;

public class AB {

	public int[] reverse(int arr[]) {

		int i = 0;

		int j = arr.length - 1;
 
		int temp;

		while (i < j) {

			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;

		}
		return arr;
	}

	public void pArr(int arr[]) {
		for (int i = 0; i <= arr.length - 1; i++) {

			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 7, 8, 9, 2, 3 };

		AB b = new AB();
		b.reverse(arr);
		b.pArr(arr);
	}
}
