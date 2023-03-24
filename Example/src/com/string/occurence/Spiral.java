package com.string.occurence;

class Spiral {

	public static void main(String[] args) {

		int n=4;
		int c1=0, c2=n-1;
		
		int r1=0, r2=n-1;
		
		int k=1;
		
		int A[][]=new int[n][n];
		
		while(k<=n*n)
		
		for(int i=c1; i<c2; i++) {
			
			A[r1][i]=k++;
			
			
		}
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				
				System.out.print(A[i][j]+" ");
			}
		}
		
	}
}