package com.test.generic.bounded.type.parameter;

public class MyGenericBound<T extends Number>{
	
	private T[] numArr;
	
	public MyGenericBound(T[] numArr) {
		
		this.numArr=numArr;
		
	}
	public double getAverage() {
		
		double sum=0.0;
		for(int i=0; i<numArr.length; i++) {
			
			sum=sum+numArr[i].doubleValue();
		
		}
		double average=	sum/numArr.length;
		
		return average;
	}

}
